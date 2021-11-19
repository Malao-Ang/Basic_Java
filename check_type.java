public class check_type {
    public static void main(String[] args) {
        //ชนิดข้อมูล
        Integer a= 10;
        double b;
        String c ="Hello worlds";
        boolean d;
        char e;
        float f;

        //check type ได้แค่ Ture or false เท่านั้น
        boolean result = c instanceof String ; 
        /*instanceof ใช้checkกับข้อมูลclass (ต้องเป็นclass เท่านั้น) typeเป็นตัวใหญ่และชื่อเต็ม
        เช่น int => Integer
        char => Character
        */
        System.out.println(result);
        //boolean result = a instanceof String ; มันจะerroeเพราะ a ไม่ใช่String
        boolean result1 = a instanceof Integer ; 
        System.out.println(result1);

    }
    
}
