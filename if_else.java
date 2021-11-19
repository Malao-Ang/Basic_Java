import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ใส่อายุของคุณ :");
        int age = sc.nextInt();
        if(age<15 && age >0){
            System.out.println("วัยเด็ก");
        }
        else if(age<=20 && age >=15){
            System.out.println("วัยสรุ่น");
        }
        else if(age>=30 && age<= 50){
            System.out.println("วัยทำงาน");
        }
        else if(age>50){
            System.out.println("วัยชรา"); 
        }
        else{
            System.out.println("บคุณกรอกอายุผิด");
        }
        System.out.println("end");

    }
    
}
