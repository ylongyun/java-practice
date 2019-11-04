public class Boy {
    private String name;
    private int age;
    public Boy(){

    }
    public Boy(String name,int age){
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
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }
    public void shout(){
        if(this.age >= 22){
            System.out.println("做你想你想做的吧！");
        }else if(this.age >= 16){
            System.out.println("你还是在等等吧，你可以先谈恋爱。");
        }else{
            System.out.println("去把你妈妈叫过来！");
        }
    }
}
