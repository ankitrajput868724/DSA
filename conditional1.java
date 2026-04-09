import java.util.Scanner;
public class conditional1 {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Two numbers : ");
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println(" Enter 1 for Addition  \n  Enter 2 for Substraction  \n  Enter 3 for Division  \n Enter 4 for multiplication  \n Enter 5 for Modula");




System.out.print("Enter Number : ");
int i = sc.nextInt();
   
 switch(i) {

    case 1:   
    System.out.println(a+b);
    break;

    case 2: 
    System.out.println(a-b);
    break;

    case 3:
        System.out.println(a/b);
        break;

        case 4:
            System.out.println(a*b);
            break;

            case 5:
                System.out.println(a%b);
                break;

                default:
                    System.out.println("Invalid Number");
 }

    }


}
