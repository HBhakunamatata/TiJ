package Ch19.database;

public @interface Uniqueness {
    Constrains constrains() default @Constrains(unique = true);
}
