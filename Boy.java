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
        System.out.println("����Ȣ"+girl.getName());
    }
    public void shout(){
        if(this.age >= 22){
            System.out.println("�������������İɣ�");
        }else if(this.age >= 16){
            System.out.println("�㻹���ڵȵȰɣ��������̸������");
        }else{
            System.out.println("ȥ��������й�����");
        }
    }
}
