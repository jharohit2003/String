package String;

public class Reverse {
    static String reverse(String str ){
        if(str.length()==0){
            return "";
        }
        //""
        // "t"
        //"it"
        //"hit"
        //"ohit"
        //"rohit"
       String ans = reverse(str.substring(1));
      
       return ans +str.charAt(0);
    }
    static void isPallindrome(String str ,String ans){
        if(str.length()==0){
            if(ans.equals(str)){
                System.out.println(" string is pallindrome");
            }else{
                System.out.println("not pallindrome");
            }
            return;
        }
           isPallindrome(str.substring(1), ans);
           ans += str.charAt(0);
           return;
      
    }
   
    public static void main(String[] args) {
        System.out.println(reverse("rohit"));
        System.out.println(isPallindrome("rohit", ""););
        
    }
}
