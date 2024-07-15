import java.util.Scanner ;
public class Ch5_8 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in) ;
        int n, sum=0 ;

        do{
            System.out.print("請輸入累加最大值: ");
            n=cin.nextInt() ;   //輸入一個整數
        }while(n<1) ;           //n要大於等於1,否則會要求重複輸入

        for(int i=1 ; i<=n ; i++){
            sum+=i ;    //計算sum=sum+1
            //System.out.printf("1+2+...+%d=%d\n",n,sum) ;    //印出結果
            cin.close() ;
        }
        System.out.printf("1+2+...+%d=%d\n",n,sum) ;    //印出結果
    }   
}
