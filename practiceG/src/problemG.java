public class problemG {
    public static String stringGenerator(int n){
        StringBuilder sb = new StringBuilder("1");
        char current;
        int count = 1-1;
        for (int j = 0; j < n; j++) {
           if (sb.length() == 1){
              printTerm(1, '1', true);
              continue;
           }
            for (int i = 0; i < sb.length() ; i++) {
                current = sb.charAt(i);
                if(current == sb.charAt(i)){

                }
            }

        }
        //System.out.println(sb.toString());
        return sb.toString();

    }

    public static String updateString(char current, int count){

        System.out.println("hello");

       return "hello";
    }

    public static void printTerm(int count, char current, boolean flag){
        System.out.print("1, ");
        if(flag) {
            System.out.print(count);
            System.out.print(current);
            System.out.print(", ");
        }
        else {
            System.out.print(count);
            System.out.print(current);
        }
    }
}
