package TreeREc;

public class Destination {
   
    static int mazeSolve(int row,int col,String ans){
         if(row==0 && col==0){
            System.out.println(ans);
            return 1;
         }
         if(row<0 || col<0){
            return 0;
         }
         
      int a =   mazeSolve(row-1,col, ans+'L');
         int b= mazeSolve(row,col-1, ans+'D');

      return a+b;
    }
     static int mazeSolve1(int startR, int startC,int row,int col,String ans){
         if(row==startR && col==startC){
            System.out.println(ans);
            return 1;
         }
         if(startR>row || startC>col){
            return 0;
         }
         
      int a =   mazeSolve1(startR+1,startC,row,col, ans+'D');
         int b= mazeSolve1(startR,startC+1,row,col, ans+'R');

      return a+b;
    }
    public static void main(String[] args) {
        int n=3;

       System.out.println(mazeSolve1(0,0,n-1,n-1, "")); ;
    }
}
