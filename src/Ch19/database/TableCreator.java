package Ch19.database;

// Reflection-based annotation processor.
// {Args: annotations.database.Member}

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {
    public static void main(String[] args) throws Exception{
        if (args.length < 1) {
            System.out.println(
                "arguments: annotated classes");
            System.exit(0);
        }

        for (String className : args) {
            Class<?> cl =  Class.forName(className);

            // 1.Get the name of db_table
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if (dbTable == null) {
                System.out.println(
                    "No DBTable annotations in class " + className);
                continue;
            }
            String dbName = dbTable.name();

            // Object in annotation cannot be null
            // we only can use length to judge whether it has value.
            if (dbName.length() < 1) {
                // If the name is empty, use the Class name.
                dbName = cl.getName().toUpperCase();
            }

            // 2. Get each columns and generate statements
            List<String> columnDefs = new ArrayList<>();

            for (Field field : cl.getDeclaredFields()) {
                String columnName = null;
                Annotation [] anns = field.getAnnotations();
                if (anns.length < 1) {
                    continue;
                }

                // Get each annotation in one field
                for (Annotation ann : anns) {
                    if (anns[0] instanceof SQLInteger) {
                        SQLInteger sInt = (SQLInteger) anns[0];

                        if (sInt.name().length() < 1)
                            columnName = field.getName().toUpperCase();
                        else
                            columnName = sInt.name();
                        columnDefs.add(columnName + " INT "
                            + getConstraints(sInt.constraints()));
                    }
                    if (anns[0] instanceof SQLString) {
                        SQLString sStr = (SQLString) anns[0];

                        if (sStr.name().length() < 1)
                            columnName = field.getName().toUpperCase();
                        else
                            columnName = sStr.name();
                        columnDefs.add(columnName + " VARCHAR(" + sStr.value() + ") "
                            + getConstraints(sStr.constraints()));
                    }

                    if (anns[0] instanceof SQLTimestamp) {
                        SQLTimestamp sTsp = (SQLTimestamp) anns[0];
                        if (sTsp.name().length() < 1)
                            columnName = field.getName().toUpperCase();
                        else
                            columnName = sTsp.name();
                        columnDefs.add(columnName + " TIMESTAMP(" + sTsp.value() + ") "
                                        + getConstraints(sTsp.constrains()));
                    }
                }
            }

            // 3. compose all
            StringBuilder createCommand = new StringBuilder(
                "CREATE TABLE " + dbName + "("
            );

            for (String columnDef : columnDefs) {
                createCommand.append("\n    " + columnDef + ",");
            }

            // Remove trailing comma
            String result = createCommand.toString()
                .substring(0, createCommand.length() - 1);
            result += "\n);";

            System.out.println("Table Creation SQL is : \n" + result);

        }

    }

    private static String getConstraints (Constrains con) {
        StringBuilder constraints = new StringBuilder();
        if (!con.allowNull())
            constraints.append(" NOT NULL");
        if (con.unique())
            constraints.append(" UNIQUE");
        if (con.primaryKey())
            constraints.append(" PRIMARY KEY");
        return constraints.toString();
    }
}
