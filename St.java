public class St {
    public static void main(String[] args) {
        //ฝึกปริ้้น
        System.out.println("หวัดดีครับ");
        System.out.println("ผมชื่อ พิมพ์");
        System.out.println("อายุ 18 ปี เป็นวัยรุ่นคริปโต");
        //กำหนดตัวแปล
        int x,y;
        x=100;
        y=x++;
        System.out.println("x="+x+"y="+y);
        y=++x;
        System.out.println("x="+x+"y="+y);
        //กำหนดค่าคงที่ **ต้องมีการระบุค่าเริ่มต้น*
        final int num1,num2;
        num1= 100; 
        num2 = 200;
        System.out.println("Num1 = "+num1);
        System.out.println("Num2 = "+num2);

    }
    
}
