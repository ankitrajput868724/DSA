public class Recursion {

    public static int calFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*calFactorial(n-1);


    }

    public static void main(String args[]){


        int n = 4;
        System.out.println(calFactorial(n));



    }



    
}
