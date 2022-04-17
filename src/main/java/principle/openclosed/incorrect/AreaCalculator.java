package principle.openclosed.incorrect;

public class AreaCalculator {

    public static void computeArea(Object object){
        int area = 0;
        String forma = "";

            if (object instanceof Rectangle){
                Rectangle rectangle = (Rectangle) object;
                area = rectangle.getHeigth() * rectangle.getWidth();
                forma = "rectangulo";
            }

            if (object instanceof Triangle){
                Triangle triangle = (Triangle) object;
                area = triangle.getHeigth() * triangle.getWidth() / 2;
                forma = "triangulo";
            }

        System.out.println("El area del " + forma + " es de: " + area);
    }
}
