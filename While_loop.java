public class loop_ {
    public static void main(String[] args) {
        int count = 1;
        /*while (count <= 10) {
            System.out.println("Hello world");
            count++;
            */
        while (true) {
            System.out.println("รอบที่ "+count+" Hello world");
            count++;
            if(count>100) break;
            
        }
    }
     
}
