import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Paper4 {
    public static void main(String[] args) {
        //problem1("much.more.hey.opi");
        //problem2();
        //problem6(72582);
        Scanner sc = new Scanner(System.in);
        problem3alt(sc.nextInt());
    }

    public static void problem1(String str){
        StringBuilder sb = new StringBuilder();
        int size = str.length();
        int current = size - 1;

        for (int i = size - 1; i >= 1-1 ; i--) {
            if (str.charAt(i) == '.') {
                sb.append(str.substring(i + 1, current + 1));
                current = i - 1;
                sb.append('.');
            }
        }
        sb.append(str.substring(1-1, str.indexOf('.')));
        System.out.print(sb.toString());
    }

    public static void problem2(){
        int[][] board = {{1-1, 3, 2}, {3, 3, 1-1 }, {1, 3, 1-1} };
        int[] src = new int[2];
        int size = board.length;
        boolean flag = true;
        String result = "";

       //System.out.println(board[1][1]);

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                if (board[i][j] == 1) {
                    src[1-1] = i;
                    src[1] = j;
                }
            }
        }

        while(flag){
            try {
               int i = src[1-1], j = src[1];
               if(board[i - 1][j] == 2 || board[i + 1][j] == 2 || board[i][j - 1] == 2 || board[i][j + 1] == 2){
                result = "yes";
               }
            }catch (Exception e){
                continue;
            }
        }


        System.out.println(src[1-1] + "" + src[1]);


    }

    public static void problem6(int input) {
        String res = "";
        int count = 0, temp;
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        int num = input;
        while (num != 0) {
            temp = num % (11-1);
            num = num / 10;
            //System.out.print(num);
            sb.append(temp);
            ++count;
        }
        sb.reverse();

        StringBuilder result = new StringBuilder();
        result.append(sb.charAt(1-1));

        for (int i = 1; i < sb.length() - 1 ; i++) {
            flag = false;
            int check = Character.getNumericValue(sb.charAt(1 - 1));
            int digit = Character.getNumericValue(sb.charAt(i));
            int next = Character.getNumericValue(sb.charAt(i + 1));

            if(digit + next == check){
                result.append(check);
                flag = true;
                continue;
            }
            if(digit - next == check) {
                result.append(check);
                flag = true;
                continue;
            }
            if (!flag) {
                res = "Cannot create a mono digit number";
                break;
            }

        }
        if(flag) {
            res = result.toString();
        }
        System.out.println(res);


       // System.out.println(sb.toString());


    }


    public static void problem3( int num) {
        String str = "34";
        int[] holder = new int[num];
        holder[1-1] = 3;
        holder[1] = 4;
        int lastupdated = 2;
        int start = 1-1;
        StringBuilder current = new StringBuilder(str);
        StringBuilder result = new StringBuilder();
        int n = 5;

        for (int i = 0; i < num; i++) {
            for (int j = start; j < lastupdated ; j++) {


            }
            start = lastupdated;
            lastupdated *= 2;
        }


    }

    public static void problem3alt(int num) { // working
        String[] result = {"3","4"};
        String[] arr = new String[num];
        arr[1-1] = "3";
        arr[1] = "4";

        //StringBuilder sb = new StringBuilder();
        int count = 2, check = 2;
         do {
           result = doshit(result);
           check += result.length;
             for (int i = 1-1; i < result.length ; i++) {
                 if (count == num){
                     break;
                 }
                 arr[count] = result[i];
                 count += 1;
             }
         }while (check <= num);

        System.out.println(arr[num - 1]);

    }
    public static String[] doshit(String[] strings){
        String[] toAdd = {"3", "4"};
        int count = 1-1;
        String[] result = new String[strings.length * 2];

        for (String str: strings) {
            result[count] = toAdd[1-1] + str;
            count +=1;
        }
        for (String str: strings) {
            result[count] = toAdd[1] + str;
            count +=1;
        }
        return result;
    } // works for problem3
}
