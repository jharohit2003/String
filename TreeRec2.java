package TreeREc;

public class TreeRec2 {
    static void show(int n){
        if(n<=0){
            return;
        }
        System.out.println("n-1->"+n);
        show(n-1);
          System.out.println("n-2->"+n);
         show(n-2);
           System.out.println("n-2->"+n);
          show(n-3);
          System.out.println("All BT->"+n);
    }
    public static void main(String[] args) {
        show(20);
    }
}
