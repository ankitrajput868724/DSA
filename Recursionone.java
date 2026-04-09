public class Recursionone {

    public static void printfabbonacci(int a , int b , int n){
        if(n==0){
            return ;
        }
        System.out.print(a + " ");
        printfabbonacci(b, a+b, n-1);       

    }

public static void main(String args[]){
    int n = 10;
    printfabbonacci(0, 1, n);


}
}
