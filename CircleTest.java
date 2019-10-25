import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double s,r;
        Circle c1 = new Circle();
        System.out.println("请输入圆的半径：");
        Scanner scan = new  Scanner(System.in);
        r = scan.nextDouble();
        System.out.println("圆的面积为"+c1.s(r));

    }
}
class Circle{
    public double s(double r){
        return Math.PI * r * r;
    }
}