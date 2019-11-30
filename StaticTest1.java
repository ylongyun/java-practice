package project01;

public class StaticTest {
    public static void main(String[] args) {
        Person p1 = new Person(6, "����");
        Person p2 = new Person(6, "������");
        p1.eat();
        p2.eat();
        System.out.println(p1.getAge());
    }
}
class Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private static String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void eat() {
        System.out.println(name + "�Է�");
    }
}
