public class plus_minus {
    public static void main(String[] args) {
        /* 
        ++a เพิ่มค่าให้ก่อน แล้วนำไปใช้
        a++ นำค่าไปใช้เกินค่อยเิพ่ม
        --a same 
        a-- same
        */
        int a=5;
        float x = 10-4+2;
        System.out.println("x = "+x);
        System.out.println(a);
        System.out.println(a++);//บวกทีหลัง
        System.out.println(a);//มาเพิ่มเป็น 6 ตรงนี้แทน
    }
    
}
