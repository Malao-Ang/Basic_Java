import java.util.Scanner;
public class temprerator {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("โปรดเลือกว่าต้องการเปลี่ยนค่าแบบใด");
        System.out.print("1. Cal => Far 2. Far => Cal : ");
        int select = sc.nextInt();
        System.out.print("input temperator : ");
        double tem = sc.nextDouble();

        if (select==1){
            tem =((tem*9.0/5.0)+32);
            System.out.println("อุณหภูมิ :"+tem+" F");
        }else if (select==2){
            tem = ((tem-32.0)*(5.0/9.0));
            System.out.println("อุณหภูมิ :"+tem+" C");
        }

    }
    
}
