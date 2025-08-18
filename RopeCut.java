package TreeREc;

//maximum pieces

public class RopeCut {
    static int rope(int ropeL , int a , int b , int c ){
        if(ropeL==0){
           return 0;     
        }
        if(ropeL<0){
            return -1;
        }
      int option1=  rope(ropeL-a, a, b, c);
      int option2=  rope(ropeL-b, a, b, c);
      int option3=  rope(ropeL-c, a, b, c);
     int max = Math.max(option1, Math.max(option2,option3));
     if(max==-1){
        return -1;
     }
     return max+1;
    }
    public static void main(String[] args) {
        System.out.println(rope(5, 5, 2, 1));
    }
}
