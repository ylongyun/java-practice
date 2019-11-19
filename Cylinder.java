public class Cylinder extends Circle {
    private double high;
    Cylinder(){
        super();
        this.high = 1;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getHigh() {
        return high;
    }
    public double findArea(){
        return super.findArea() * 2 + this.high * getRadius()
                * 2 * Math.PI;
    }
    public double Volume(){
        return super.findArea() * this.high;
    }
}
