import java.util.Scanner ;
public class hm_10 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in) ;

        System.out.print("請輸入華氏溫度:");
        float f = cin.nextFloat() ;
        float c = (f-32)*5/9 ;
        System.out.printf("攝氏溫度為:%.2f",c);
        cin.close() ;
    }
}
