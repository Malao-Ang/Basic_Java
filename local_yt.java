public class local_yt {
    public static void main(String[] args){
        //gobal viable
        int a = 100;
        int b = 200;
        System.out.println("A = "+a);
        {
            int c = 300; //local varble
            //ถ้าปริ้น cข้างนอกจะ error แต่ถ้า ปริ้นaในนี้สามารถปริ้นได้
            //{}ง่ายๆคือการวางวงจรชีวิต
            System.out.println("A = "+a);

        }
        //System.out.println("C = ",c); **ปริ้นนอกวงจรจะ errorนะจ๊ะ**
    }
    
}
