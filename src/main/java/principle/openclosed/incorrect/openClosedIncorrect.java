package principle.openclosed.incorrect;

public class openClosedIncorrect {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        AreaCalculator.computeArea(rectangle);

        Triangle triangle = new Triangle(5, 10);
        AreaCalculator.computeArea(triangle);

    }
}
