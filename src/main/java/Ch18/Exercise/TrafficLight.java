package Ch18.Exercise;

enum Signal {
    RED, GREEN, YELLOW
}

public class TrafficLight {

    Signal color = Signal.GREEN;

    public void change () {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "TrafficLight color = " + color;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 5; i++) {
            trafficLight.change();
            System.out.println(trafficLight);
        }
    }
}
