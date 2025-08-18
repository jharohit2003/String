package TreeREc;

public class QuestionDice {
    static int count(int n ,String ans){
        if(n==0){
             System.out.print(ans+" ");
            return 1;
        }
        if(n<0){
            return 0;
        }
         int option =0;
         option += count(n-1, ans+'1');
          option += count(n-2, ans+'2');
          option += count(n-3, ans+'3');
          option += count(n-4, ans+'4');
         option += count(n-5, ans+'5');
         option += count(n-6, ans+'6');
        return option;
    }
    static void count1(int start,int end ,String ans){
        if(start==end){
             System.out.print(ans+" ");
            return ;
        }
        if(start>end){
            return ;
        }
        for(int dice =1;dice<=6;dice++){
                count1(start+dice,end,ans+dice);
        }
        
        //   count1(start+1,end, ans+'1');
        //    count1(start+2,end, ans+'2');
        //    count1(start+3,end, ans+'3');
        //    count1(start+4,end, ans+'4');
        //   count1(start+5,end, ans+'5');
        //   count1(start+6,end, ans+'6');
          return;
    }
    public static void main(String[] args) {
       
       count1(0,10,"");
    
    }
}
