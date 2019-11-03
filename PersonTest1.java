public class PersonTest1 {
    public static void main(String[] args) {
        Person1 p = new Person1(18);
//        p.age = 1;编译不通过
        p.setAge(18);
        System.out.println(p.getAge());
        Person1 p1 = new Person1("张泽彧",6);
        System.out.println(p1.showName()+"是一个"+p1.getAge()+"岁的小孩子");
    }
}
class Person1{
    private int age;
    private String name;
    public Person1(int n){
        age = n;
    }
    public Person1(String n,int i){
        age = i;
        name = n;
    }
    public void setAge(int i){
        if(i >= 0 && i <=130){
            age = i;
        }else{
         throw new  RuntimeException("传入的数据不合法");
        }
    }
    public int getAge(){
        return age;
    }
    public String showName(){
        return name;
    }
}