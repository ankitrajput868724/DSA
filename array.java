import java.util.Scanner;
public class array{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


//Taking the input size of array rom user

System.out.println("Enter the size of array : ");
        int s = sc.nextInt();                                        //SIZE OF ARRAY
        int arr[] = new int[s];                            //dECLARING ARRAY WITH SIZE TAKEN FROM USER

//Taking the input of array elements from user            INPUT

        System.out.println("Enter the elements of array : ");
        for(int i = 0 ; i<s ; i++){                                            //lOOP TO TAKE INPUT FROM USER AND STORE IN ARRAY
            arr[i] = sc.nextInt();
        }


//Giving output of array size tpo the users         OUTPUT

        System.out.println("The elements of array are : ");
        for(int i = 0 ; i<s ; i++){
            System.out.println(arr[i] + " ");                           //THROWING OUTPUT TO THE USER
        }

    }
}