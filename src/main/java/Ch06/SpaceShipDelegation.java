package Ch06;

class SpaceController {
    private String name;

    SpaceController (String name) {
        this.name = name;
    }

    public void forward(int velocity){ }
    public void back(int velocity) {}
}

public class SpaceShipDelegation {
    private SpaceController spaceController;
    SpaceShipDelegation (String name) {
        spaceController = new SpaceController(name);
    }

    // Delegation methods
    public void forward(int velocity){
        spaceController.forward(velocity);
    }

    public void back(int velocity) {
        spaceController.back(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation ssd = new SpaceShipDelegation("SpaceShip No.1");
        ssd.forward(100);
        ssd.back(100);
    }
}
