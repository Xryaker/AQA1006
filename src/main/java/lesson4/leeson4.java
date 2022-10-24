package lesson4;


import Utils.InputARGS;
import Utils.MathM;
import Utils.MethodS;

public class leeson4 {
    public static void main(String[] args) {
        int arg1, arg2;
        char simbol;
        arg1 = InputARGS.inputnumber();
        simbol = InputARGS.inputSimbol();
        arg2 = InputARGS.inputnumber();

        switch (simbol){
            case '+' :
                System.out.println(MathM.sum(arg1, arg2));
                break;
            case '/':
                System.out.println(MathM.devide(arg1, arg2));
            default:
                System.out.println("Error not found simbol");
        }

    }
}
