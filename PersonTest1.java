public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
//        p.age = 1;���벻ͨ��
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
         throw new  RuntimeException("��������ݲ��Ϸ�");
        }
    }
    public int getAge(){
        return age;
    }
}