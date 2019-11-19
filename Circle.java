public class Circle {
    private double radius;
     Circle(){
         this.radius = 1;
    }

    public void setRadius(double radius){
         this.radius = radius;
    }
    public double getRadius(){
         return this.radius;
    }
    public double findArea(){
         return Math.PI * radius * radius;
    }
}
