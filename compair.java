import java.util.Scanner;
public class compair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a = ");
        int a = sc.nextInt();
        System.out.println("input b = ");
        int b = sc.nextInt();
        //check
        System.out.println("a = d จริงป่าว"+(a==b));
        System.out.println("a != d จริงป่าว"+(a!=b));
        //or
        boolean c = (a==b);
        boolean d = (a!=b);
        System.out.println("a เท่ากับ b จริงป่าว "+c);
        System.out.println("a ไม่เท่ากับ b จริงป่าว "+d);
        System.out.println(" a>b = "+(a>=b));
        System.out.println(" a<b = "+(a<=b));

        //ข้อดีคือเอาไปเปรียบเทียบอย่างอื่นได้


    }
    
}
