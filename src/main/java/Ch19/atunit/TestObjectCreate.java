//: net/mindview/atunit/TestObjectCreate.java
// The @Unit @TestObjectCreate tag.
package Ch19.atunit;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestObjectCreate {} ///:~
