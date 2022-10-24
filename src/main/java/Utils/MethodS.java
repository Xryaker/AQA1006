package Utils;

import java.util.Random;

public class MethodS {
    private static void publicMethod() {
        System.out.println("PUBLI METHOD");
    }

    public static void printD(int num1, int num2) {

        int result = num1 / num2;
        System.out.println(result);
        publicMethod();

    }

    public static void printPersonData(String name, int age, int idNumber) {
        System.out.println("==========================");
        System.out.println("Name : " + name);
        System.out.println("AGE  : " + age);
        System.out.println("ID   : " + idNumber);
    }

    public static void printPersonData(String name, int age, int idNumber, int tel) {
        System.out.println("==========================");
        System.out.println("Name : " + name);
        System.out.println("AGE  : " + age);
        System.out.println("ID   : " + idNumber);
        System.out.println("TEL  : " + tel);
    }

    public static void printPersonData(String name, int idNumber, int tel, String birthday) {
        int age = 2022 - Integer.parseInt(birthday);
        System.out.println("==========================");
        System.out.println("Name : " + name);
        System.out.println("AGE  : " + age);
        System.out.println("ID   : " + idNumber);
        System.out.println("TEL  : " + tel);
    }

    public static void walk2(int start, int... nums) {

        System.out.println(start);
        for (int i : nums) {
            System.out.println(i);
        }

    }

    public static void printProtectedMethod(String str, int[] t) {

        System.out.println(str);
    }

    public static void walk1(int... nums) {
        for (int i : nums) {
            System.out.println(i);
        }
    }


    public static String getTeacherName(int age) {
        if (age == 33) {

            return "Vasiliy";
        }
        return null;

    }
}
