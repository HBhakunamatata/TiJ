package Ch04.Exercise;


public class Exercise22 {
    Currency currency;
    public Exercise22 (Currency currency) {
        this.currency = currency;
    }

    public void describ () {
        switch( currency ) {
            case DEutscheMark:
                System.out.println("It is used in German.");
                break;
            case HongKongDollar:
                System.out.println("It is used in HongKong.");
                break;
            case UnitedStatesDollar:
                System.out.println("It is used in USA.");
                break;
            default:
        }
    }

    public static void main(String[] args) {
        for (Currency c : Currency.values()
             ) {
            System.out.println(c + " : " + c.ordinal());
        }

        Exercise22 exercise22 = new Exercise22(Currency.DEutscheMark);
        exercise22.describ();
    }
}


/*
 * 例程：
 * enum Direction {
    EAST,
    WEST,
    SOUTH,
    NORTH;
}

public class SimpleEnum {
    public static void main(String args[]){
        Direction d = Direction.EAST;
        switch(d) {
        case EAST:
            System.out.println("Dragon");
            break;
        case WEST:
            System.out.println("Tiger");
            break;
        case SOUTH:
            System.out.println("Peacock");
            break;
        case NORTH:
            System.out.println("Tortoise");
        }
    }
}
*为什么程序中对 enum 常量的引用不一致？

在 main函数中，
Direction d = Direction.EAST;
*
如果写成
Direction d = EAST;
javac 会报错，说找不到符号 EAST.

而switch case的代码块中必须直接跟枚举常量，
* 如果把 case EAST: 改成 case Direction.EAST:，
* javac 会报告说： 枚举 switch case 标签必须为枚举常量的非限定名称。
*
*
 * 原因：枚举变量的定义、赋值是运行时jvm强制要求类型必须一致，所以必须加上类限定前缀；
 * 而在switch...case中使用枚举变量，则只是java提供的语法糖，
 * 这个特色并不是在运行时通过JVM来保证的，而只是java编译器在编译阶段完成的，
 * 在编译过程中的一旦判断switch语句中的变量是enum类型，
 * 即只需要以其ordinal属性为索引，通过tableswitch查找局部变量数组。
 * 在此时case语句不需要类限定前缀，完全是java编译器的限制
 * (编译器是不需要枚举类的前缀，只需要枚举类编译的static int[] $SWITCH_TABLE)
 *
 */
