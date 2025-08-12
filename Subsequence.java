package String;

public class Subsequence {
    static void sub(String a , String ans){
        if(a.length()==0){
            System.out.print(ans+" ");
            return;
        }
        // pick 
        sub(a.substring(1),ans+a.charAt(0));
        // not pick
        sub(a.substring(1),ans);
    }
    public static void main(String[] args) {
        sub("rohit", "");
    }
}
