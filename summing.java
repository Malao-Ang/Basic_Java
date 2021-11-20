import java.util.Scanner;
public class summing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count=0;
        while(true){
            System.out.println("input your number :");
            int num = sc.nextInt();
            if (num<0)break;
            sum += num;
            count++;

        }
        System.out.println("sum = "+sum);
        System.out.println("average = "+(sum/count));

    }
    
}
