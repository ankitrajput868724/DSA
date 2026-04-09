
//FINDING AN ELEMENT FROM THE ARRAY BUNCH OF ELEMENTS

import java.util.Scanner;

public class array1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the size of the array :");
        int s = sc.nextInt();
        int arr[] = new int[s];


        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search :");
        int x = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.println(x+ " is Found at index number : " +i);
            }

        }
        
    }
}