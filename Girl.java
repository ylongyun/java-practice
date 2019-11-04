import java.util.SplittableRandom;

public class Girl {
    private String name;
    private int age;
    public Girl(){

    }
    public Girl(String name,int age){
        this.age = age;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return   this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }
    public void shout(){
        System.out.println("张钦：“你说啥？我没听清楚”");
    }
}
