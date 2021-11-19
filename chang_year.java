import java.util.Scanner;
public class chang_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ต้องการเปลี่ยนปีให้เป็นแบบใด พิมพ์ 1 เพื่อเปลี่ยนเป็น พ.ศ. พิมพ์ 2 เพื่อเปลี่ยนเป็น ค.ศ.");
        int select = sc.nextInt();
        System.out.print("input year:");
        int year = sc.nextInt();

        if (select==1) {System.out.println("พ.ศ. = "+(year+543));};
        if (select==2) {System.out.println("ค.ศ. = "+ (year-543));};

    }
    
}
