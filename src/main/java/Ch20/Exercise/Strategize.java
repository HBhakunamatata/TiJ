package Ch20.Exercise;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2021年10月08日 17:36
 */


interface Strategy {
    String approach(String msg);
}

// method 1
class Soft implements Strategy {

    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

// method 2 : method reference

class Unrelated  {
    static String twice (String msg) {
        return msg + " " + msg;
    }
}

public class Strategize {

    Strategy strategy;
    String msg;

    Strategize (String msg) {
        strategy = new Soft();
        this.msg = msg;
    }

    void changeStrategy (Strategy strategy) {
        this.strategy = strategy;
    }

    void communicate () {
        System.out.println(strategy.approach(msg));
    }

    public static void main(String[] args) {

        Strategy [] strategies = {

            // 1. Anonymous class
            new Strategy() {
                @Override
                public String approach(String msg) {
                    return msg.toUpperCase();
                }
            },

            // 2. lambda
            msg1 -> msg1.substring(0, 5),

            // 3. method reference
            Unrelated::twice
        };

        Strategize strategize = new Strategize("Hello world");
        strategize.communicate();

        for (Strategy newStrategy : strategies) {
            strategize.changeStrategy(newStrategy);
            strategize.communicate();
        }

    }
}
