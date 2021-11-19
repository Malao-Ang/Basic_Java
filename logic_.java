public class logic_ {
    public static void main(String[] args) {
        /* 
        && and
        || or
        ! not
        */
        int a=5,b=10;

        boolean c = (a==b);
        boolean d = (a<b);

        System.out.println("a=5\nb=10\nc = (a==b)");
        System.out.println("d = (a<b)");
        System.out.println("a=b is "+ c);
        System.out.println("a<b is "+ d);
        System.out.println("c and d is "+(c&&d));
        System.out.println("c or d is "+(c||d));

    }
    
}
