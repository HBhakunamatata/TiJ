package Ch19.database;

/*
 Exercise 1 : Implement more SQL types in the database example.
 */

/*
+---------------+----------------+
| 列类型　　　　| 显示格式　　　 |
| TIMESTAMP(14) | YYYYMMDDHHMMSS |　
| TIMESTAMP(12) | YYMMDDHHMMSS　 |
| TIMESTAMP(10) | YYMMDDHHMM　　 |
| TIMESTAMP(8)　| YYYYMMDD　　　 |
| TIMESTAMP(6)　| YYMMDD　　　　 |
| TIMESTAMP(4)　| YYMM　　　　　 |
| TIMESTAMP(2)　| YY　　　　　　 |
+---------------+----------------+
*/


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLTimestamp {

    String name() default "";
    int value() default 0;
    Constrains constrains() default @Constrains;
}
