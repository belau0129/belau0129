import java.util.Scanner ;
public class hm_08 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in) ;

        System.out.print("請輸入姓名、年齡和城市:") ;
        String name = cin.next() ;
        int age = cin.nextInt() ;
        String city = cin.next() ;

        System.out.print("姓名:"+name+"\n年齡:"+age+"\n城市:"+city) ;
    }
}
