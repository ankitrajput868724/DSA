import java.util.Scanner;
public class functions3 {


    public static void printBig(int a, int b){

        if(a>b){
            System.out.println(a+" is grater than "+b);

        }
        else{
            System.out.println(b+" is grater than "+a);
        }
    
 }

 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("EnterTwo Numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    printBig(a,b);
 }
}