package Utils;

public class MathM {
    private static boolean isNull(int arg){
        return arg == 0;
    }
    public static int sum(int arg1, int arg2) {
        return arg1+arg2;
    }

    public static int devide(int arg1,int arg2){
        if (isNull(arg2)){
           myERROR();
            return 0;
        }else{
            return arg1/arg2;
        }
    }

    private static void myERROR() {
        System.out.println("ERROR");
        System.exit(0);
    }
}
