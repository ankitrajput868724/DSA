import java.util.Scanner;
public class functions {
    public static void printAverage(int a, int b , int c){
        int average = (a+b+c)/3;
        System.out.println(average);
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The Average is : ");
        printAverage(a,b,c);

    }
    
    
}
