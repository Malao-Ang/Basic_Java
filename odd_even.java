import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number :");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("เป็นเลขคู่ ");
        }
        else{
            System.out.println("เป็นเลขคี่");
        }
        

    }
    
}
