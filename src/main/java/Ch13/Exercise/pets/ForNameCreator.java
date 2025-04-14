package Ch13.Exercise.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{
    private static String [] typeNames = {
            "Ch13.Exercise.pets.Mutt",
            "Ch13.Exercise.pets.Pug",
            "Ch13.Exercise.pets.EgyptianMau",
            "Ch13.Exercise.pets.Manx",
            "Ch13.Exercise.pets.Cymric",
            "Ch13.Exercise.pets.Rat",
            "Ch13.Exercise.pets.Mouse",
            "Ch13.Exercise.pets.Hamster"
    };

    private static List<Class<? extends Pet>> types =
                    new ArrayList<Class<? extends Pet>>();

    /*
    The loader( ) method is defined separately and then placed inside
    a static initialization clause because the @SuppressWarnings annotation
    cannot be placed directly onto the static initialization clause.
     */
    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add( (Class<? extends Pet>)Class.forName(name) );
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    @Override
    List<Class<? extends Pet>> types() {
        return types;
    }
}
