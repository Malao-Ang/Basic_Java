import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ใส่แม่สูตรคูรที่คุณต้องการรู้ :");
        int num  = sc.nextInt();
        for (int i = 1; num<=13; i++) {
            System.out.println(num+" x "+i+" = "+(i*num));
            if(i>=12) {
                break;
        }
    }
    
}
}
