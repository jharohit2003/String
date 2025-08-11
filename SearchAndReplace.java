package String;

public class SearchAndReplace {
    static String sar(String str , char search , char replace,String ans){
       if(str.length()==0){
            return ans;
        }
        if(str.charAt(0)==search){
            ans +=replace;
        }else{
            ans += str.charAt(0);
        }
        
       return  sar(str.substring(1), search, replace , ans);
        
       
    }

    static String searchAndReplace(String str ,char search , char replace){
        
       return sar(str, search, replace , "");
    }
    static String searchAndReplace1(String str ,char search , char replace){
        
       if(str.length()==0){
            return "";
        }
        
        
      String ans =  searchAndReplace1(str.substring(1), search, replace );
       if(str.charAt(0)==search){
            ans =replace +ans;
        }else{
            ans = str.charAt(0)+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        String r = searchAndReplace("Hello", 'l', 'x');
        System.out.println(r);
        String s = searchAndReplace1("Hello", 'l', 'x');
        System.out.println(s);
        
    }
}
