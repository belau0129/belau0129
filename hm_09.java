import java.util.Scanner ;
public class hm_09 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in) ;

        System.out.print("請輸入長和寬:") ;
        int length = cin.nextInt() ;
        int width = cin.nextInt() ;
        System.out.print("The area is:"+(length*width)) ;
        cin.close() ;
        
    }
}
