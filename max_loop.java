import java.util.Scanner;
public class max_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0,min = Integer.MAX_VALUE;
        while (true){
            System.out.println("ใส่ตัวเลขที่คุณต้องการหาค่าสงสุดต่ำสุด :");
            int num = sc.nextInt();
            if (num<0)break;
            if(num>max) max = num;
            if (num<min) min = num;

        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }
    
}
