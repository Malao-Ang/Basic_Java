class Type_Casting {
    public static void main(String[] args) {
        //แปลง เล็กเป็นใหญ่ (ขนาดของ Bit) คอมจะแปลงให้เอง
        int numInt = 10;
        double numDouble = numInt;
        System.out.println(numInt);
        System.out.println(numDouble);
        //แปลงจากใหญ่ไปเล็กต้องทำเอง
        double numDouble = 10.0;
        int numInt =(int)numDouble;

        System.out.println(numInt);
        System.out.println(numDouble);
        
        /*string = ที่เก็ย char หลายตัว
        symbol = "";
        cha : symbol = ' '
        char > string

        String a = "Pim",b = "Pom",c="100",d = "50";
        c = c+d; // "100"+"50"
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //เปลี่ยน str => int
        c = Integer.parseInt(a); //สามารถคำนวนทางmath ได้แล้ว
        c = c +50;
        System.out.println("c str => int = "+c);

        // str=> double
        double z = Double.parseDouble(a);
        z = z+3.55;
        System.out.println("z str => double = "+z);

        //int => str
        int num1 = 100;
        String age = String.valueOf(num1);System.out.println("age int => str"+age);
*/

    }  
    
}
