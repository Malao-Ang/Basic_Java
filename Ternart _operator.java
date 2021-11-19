import java.util.Scanner;
public class Ternart _operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number :");
        int num = sc.nextInt();
        //ตัวแปล = (เงื่อไข) ? คำสั่งเมื่อเงื่อนไงเป็นจริง : คำสั่งเมื่อเงื่อนไขเป้นเท็จ
        String result = "";
        result = (num%2 == 0) ? "เป็นเลขคู่" : "เป็นเลขคี่";
        System.out.println(result);


    }
    
}
