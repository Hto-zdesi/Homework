package homework_nr_4;

public class Circle {

    static int radius;

    public static void main(String[] args) {
        Circle ARIA = new Circle(3);
        System.out.println(calculatedArea(radius));
    }

    public static float calculatedArea(float x){
        return (float) (Math.PI*x*x);
    }

    public Circle(int radius){
        this.radius = radius;
    }

}
