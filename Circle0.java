public class Circle0 extends GeometricObject {

    private double radius;

    public Circle0(){
        radius = 1.0;
//        color = "white";�����������ڸ���Ĺ�����
//        ���Ѿ�����˳�ʼ�����������ظ���ʼ����
//        weight = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle0(double radius){
        super();
        this.radius = radius;
    }

    public Circle0(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }
    public double finaArea(){
        return Math.PI * radius * radius;
    }
    public boolean equals(Object obj){
       if(this == obj){
           return true;
       }

       if(obj instanceof Circle0){
           Circle0 c1 = (Circle0)obj;
           return this.radius == c1.radius;
       }
       return false;
    }
    public String toString(){
        return("radius = "+this.radius);
    }
}
