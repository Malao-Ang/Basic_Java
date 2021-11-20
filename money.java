import java.util.Scanner;
public class money{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ป้อนจำนวนเงิน");
        int money = sc.nextInt();
        System.out.println("จำนวนเงิน :"+money);

        if (money>=1000){
            //5000/1000 = จำนวนแบงค์พัน
            System.out.println("1000 = "+(money/1000)+" ใบ");
            money %= 1000;
            
        }if (money>=500){
            System.out.println("500 = "+(money/500)+" ใบ");
            money %= 500;
            System.out.println("เศษ = "+(money));
        }if (money>=100){
            System.out.println("100 = "+(money/100)+" ใบ");
            money %= 100;
            System.out.println("เศษ = "+(money));
        }if (money>=50){
            System.out.println("50 = "+(money/50)+" ใบ");
            money %= 50;
            System.out.println("เศษ = "+(money));
        }if (money>=20){
            System.out.println("20 = "+(money/20)+" ใบ");
            money %= 20;
            System.out.println("เศษ = "+(money));
        }if (money>=10){
            System.out.println("10 = "+(money/10)+" เหรียญ");
            money %= 10;
            System.out.println("เศษ = "+(money));
        }if (money>=5){
            System.out.println("5 = "+(money/5)+" เหรียญ");
            money %= 5;
            System.out.println("เศษ = "+(money));
        }if (money>=2){
            System.out.println("2 = "+(money/2)+" เหรียญ");
            money %= 2;
            System.out.println("เศษ = "+(money));
        }if (money>=1){
            System.out.println("1 = "+(money/1)+" เหรียญ");
            money %= 1;
            System.out.println("เศษ = "+(money));
        }
        
    }
}