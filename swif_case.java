import java.util.Scanner;
public class swif_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input num mount :");
        int mount = sc.nextInt();
        String name = "";

        switch (mount) {
            case 1:
                name = "Jan";
                break;
            case 2:
                name = "Feb";
            default:
                name = "ไม่พบ";
                break;
        }
        System.out.println(name);
    }
    
}
