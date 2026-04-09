import java.util.Scanner;
public class functions2 {

    public static void printOdd(int a){

        for(int i=0; i<=a; i++){
            if(i%3==0){
                System.out.println(i+" ");
            }
        }
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the maximum limit to print odd Numbers :");
            int a = sc.nextInt();
            System.out.print("The Odd NUmbers Series Is As Follows :-  ");
            printOdd(a);
 }
    }
    

