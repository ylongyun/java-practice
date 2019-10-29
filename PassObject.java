public class PassObject {
    public void printAreas(Circle c,int time){
        int i = 1;
        System.out.println("Radius\t\tArea");
        for(;i <= time;i++){
            System.out.println(i+"\t\t"+c.s(i)+"\n");
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        PassObject test = new PassObject();
        test.printAreas(new Circle(),5);
    }
}
