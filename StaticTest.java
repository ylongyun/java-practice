public class StaticTest {
    public static void main(String[] args) {
//    Chinese.nation = "China";
    Chinese c1 = new Chinese("ÖÐ¹ú");
    System.out.println(c1.nation);
    Chinese c2 = new Chinese("China");
    c2.nation = "China";
    System.out.println(c1.nation);



    }
}
class Chinese{
    static String nation;
    Chinese(String nation){
        this.nation = nation;
    }

}