package Ch07.shape;

public class Shapes {
    private static ShapeGenerator factory = new ShapeGenerator();

    public static void main(String[] args) {
        Shape [] shapes = new Shape[5];
        for(int i = 0; i < shapes.length; i++){
            shapes[i] = factory.generate();
        }
        for (Shape s:shapes) {
            s.draw();
            s.erase();
        }
    }
}
