package principle.openclosed.correct;

public class Rectangle implements IShape{

    private int width;
    private int heigth;

    @Override
    public void area() {
        int area = this.heigth * this.width;
        System.out.println("El area del rectangulo es de: " + area);
    }

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}
