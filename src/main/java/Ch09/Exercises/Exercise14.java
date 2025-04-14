package Ch09.Exercises;

import static net.mindview.util.Print.*;

interface Monster {
  void menace();
}

interface DangerousMonster extends Monster {
  void destroy();
}

interface Lethal {
  void kill();
}

class DragonZilla implements DangerousMonster {
  public void menace() {}
  public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
  void drinkBlood();
}

class VeryBadVampire implements Vampire {
  public void menace() {}
  public void destroy() {}
  public void kill() {}
  public void drinkBlood() {}
}

public class Exercise14 {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public DangerousMonster monsterMaker() {
        return new DangerousMonster() {
            public void menace() {
                print("DangerousMonster Menace");
            }

            public void destroy() {
                print("DangerousMonster Destroy");
            }
        };
    }

    public Vampire vampireMaker() {
        return new Vampire() {
            public void menace() {
                print("Vampire Menace");
            }

            public void destroy() {
                print("Vampire Destroy");
            }

            public void kill() {
                print("Vampire Kill");
            }

            public void drinkBlood() {
                print("Vampire DrinkBlood");
            }
        };
    }

    public static void main(String[] args) {
        Exercise14 show = new Exercise14();
        show.u(show.monsterMaker());
        show.v(show.monsterMaker());
        show.u(show.vampireMaker());
        show.v(show.vampireMaker());
        show.w(show.vampireMaker());
    }
}

