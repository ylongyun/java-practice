public class StudentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[20];
        for(int i = 0;i < 20;i++){
            stu[i] = new Student();
            stu[i].number = i + 1;
            stu[i].grade = (int)(Math.random()*6+1);
            stu[i].score = Math.random() * 101;
        }
        for(int i = 0;i < 20;i++){
            stu[i].show3();
        }

    }


}
class Student{
    int number;
    double score;
    int grade;
    public void show3(){
        //if(grade == 3){
            System.out.println("学号:"+number+"\n"+"年级："+grade+"\n"+"成绩"+score+"\n");
        //}
    }
}
