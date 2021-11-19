import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ใสน้ำหนัก(kg) :");
        double weight = sc.nextDouble();
        System.out.println("ใสส่วนสูง(cm) :");
        double height = sc.nextDouble();
        String ans = "";

        height/=100;
        double BMI = weight/(height*height);
        if (BMI<18) {
            ans = "ผอม";
        }else if (BMI>=18.5 && BMI<22.9){
            ans = "สมส่วน";
        }else if (BMI>=23.0 && BMI<= 24.9){
            ans = "น้ำหนักเกิน";
        }else if (BMI>=25.0 && BMI<=29.9){
            ans = "โรคอ้วน";
        }else{
            ans = "โรคอ้วนอัตราย";
        }
        System.out.println(ans);
        


    }
    
}
