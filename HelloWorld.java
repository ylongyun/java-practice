public class HelloWorld {
    public static void main(String[] args) {
////        System.out.println("Hello World!!");
//        int i;
//        String[] names = new String[3];
//        names[0] = "\u5f20\u6cfd\u5f67";
//        names[1] = "\u6768\u9f99\u4e91";
//        names[2] = "\u5f88\u7231\u5f88\u7231";
////        System.out.println(names[2].length());
////        System.out.println(names[1]+names[2]+names[0]);
//        for (i = 0;i < names.length;i++){
//            System.out.println(names[i]);
//        }
//
//
        int sum, i, k;
        for (i = 1; i < 1001; i++) {
            sum = 0;
            for (k = 1; k <= i/2; k++) {
                if (i % k == 0) {
                    sum += k;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
        for(i = 2;i < 1001;i++){
            k = 1;
            for(sum = 2;sum <= Math.sqrt(i);sum++){
                if(i % sum == 0){
                    k = 0;
                    break;
                }
            }
            if(k == 1){
                System.out.print(i+"\t");
            }
        }
    }
}