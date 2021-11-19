import java.util.Scanner;
public class input_ {
    public static void main(String[] args) {
        //input
        //ข้อมูลแบบไหน : ตัวเลข int float long double String
        //ข้อความใช้ทำอะไร
        //ข้อความแบบตัวเลข เป็นแบบไหย? ใช้คำนวนไหม
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อชื่อลงไป : ");
        String name = sc.nextLine(); //รับค่าString จากแป้นพิมพ์ =>  name
        System.out.println("Hello !!"+name);

        //รับค่าตัวเลข
        System.out.print("What your พ.ศ. born? :");
        int year = sc.nextInt();  //รับค่า int

        System.out.print("ว้าว คุณเกิด"+" "+year+" "+"หรอ!");
        int age = 2564-year; 
        System.out.println("แสดงว่าคุณอายุ "+age+" ปี");
    }   //nextLine เป็นคำวั่งไว้อ่านข้อคว**อ่านช่องว่างระหว่างคำด้วย**
        // next อไว้ตรวจว่ามีข้อมูลให้อ่านอยู่มั้ย เพราะมันจะไม่อ่านช่อว่าง if Pim mama
        //มันจะอ่านแค่Pim
}
