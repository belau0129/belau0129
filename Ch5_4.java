public class Ch5_4 {
    public static void main(String args[]) {
        int a=50, b=20 ;
        char oper ='+' ;

        switch(oper) {  //選擇值為'+'
            case '+' :
            System.out.println(a+"+"+b+"="+(a+b)) ; //印出a+b
            break;
            case '-' :
            System.out.println(a+"-"+b+"="+(a-b)) ; //印出a-b
            break;
            default:
            System.out.println("Unknown exression!!") ;//印出字串
        }
    }
}
