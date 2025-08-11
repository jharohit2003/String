package String;

public class ATOI {
    public static int atoi(String s){
        if(s.length()==0){
            return 0;
        }
        int ans = atoi(s);
        return ans;
    }
    public static void main(String[] args) {
        String s = "784";
        System.out.println(atoi(s));

    }
}
