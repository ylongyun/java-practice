public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
//        p.age = 1;编译不通过
        p.setAge(18);
        System.out.println(p.getAge());
    }
}
class Person{
    private int age;
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
}