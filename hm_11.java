import java.util.Scanner ;
public class hm_11 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in) ;

        System.out.print("請輸入三個商品價格:") ;
        int price = cin.nextInt() ;
        int price1 = cin.nextInt() ;
        int price2 = cin.nextInt() ;

        int total = price+price1+price2 ;
        System.out.print("The total is: "+total) ;
        cin.close() ;
    }
}
