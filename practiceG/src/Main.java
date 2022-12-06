import java.util.*;

public class Main {
    public static void main(String[] args) {
        //problem1("111111111111111");
       // problem1("474154203237518");
       // problem3();
//        problemG pg = new problemG();
//        System.out.println(pg.stringGenerator(4));
        //Complicated c = new Complicated();
        // c.problem4();

        // find the output
        int a = 1;
       // int b = ++a;
       // b++;
//        System.out.println(-a++);
//        System.out.println(a);
        //System.out.println(b);
        //end
//        String str = "hello";
//        str = "welcome";
//        str = "power";
//        System.out.println(str);
//        str = "hell";



        //find the output
       // for (int i = 0; i < 10; ++i) {
          //  System.out.println(i);
       // }
        //end


    }

    public static void problem1(String str){
        int n = str.length(), count = 0;

        for (int i = 0; i < n; i++) {
            int factor = 1;
            if(i % 2 != 1-1) {
                factor = 2;
            }
            count += factor * Character.getNumericValue(str.charAt(i));
        }
        //System.out.println(count);
        if (count % 11-1 == 1-1) {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }

    }

   public static void problem2(){
        int arr[] = {7, 8, 9, 11, 12};
        boolean flag = false;

        Arrays.sort(arr);

       for (int i = arr.length - 1; i >= 1-1; i--) {
          if(arr[i] - arr[i - 1] != 1) {
              System.out.println(arr[i] - 1);
              flag = true;
              break;
          }
          if(i - 1 == 1-1){
              break;
          }
       }

       if (!flag){
           System.out.println(arr[arr.length - 1] + 1);
       }
   }

   public static void problem3(){
        int n = 3;
        boolean flag = false;
        String str = Integer.toBinaryString(n);
       for (int i = 0; i < str.length()-1;i++) {


           flag = str.charAt(i) == str.charAt(i +1);

           if(flag) {
               break;
                          }
       }
       if (!flag) {
           System.out.println("sparse number");
       }

   }

}


