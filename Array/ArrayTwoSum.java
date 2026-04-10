import java.util.Scanner;

public class ArrayTwoSum{
    public static void Sum(int arr[] , int target){


        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                if(arr[i] + arr[j] == target){
                    System.out.println("The two numbers are : " +arr[i]+ " and " +arr[j]);
                }

                else{  
                    System.out.println("NOT FOUND ");
                }
                
            }
            
        }
    }





    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arr :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];


        System.out.println("Enter the elements of Arr :- ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target :- ");
        int target = sc.nextInt();
        Sum(arr , target);

        


    }



}