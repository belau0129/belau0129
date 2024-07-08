import java.util.Scanner ;
public class hm_07 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in) ;

        System.out.print("請輸入圓的半徑:") ;
        double h = cin.nextDouble() ;

        double area = Math.pow(h,2)*Math.PI ;
        System.out.print("The area is: "+area) ;
        cin.close() ;
    }
}
