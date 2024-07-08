import java.util.Scanner ;
public class hm_06 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in) ;

        System.out.print("請輸入兩個整數:") ;
        int int1 = cin.nextInt() ;
        int int2 = cin.nextInt() ;
        
        int anw = int1+int2 ;
        System.out.print("The anwser is: "+anw) ;
        cin.close() ;
        
    }
}
