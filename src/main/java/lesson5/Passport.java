package lesson5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Passport {
   static  {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime now = LocalDateTime.now();
        year=Integer.parseInt(dtf.format(now));

    }

    private String name;
    private String family;
    private int weight;
    private int hight;
    private int age;
    private static int year;


    static public boolean human = true;

    private double iMT;

    public boolean isHuman() {
        return human;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }

    public Passport(String n, String family, int yerBirthday, boolean human) {

        this.name = n;
        this.family = family;

            this.age = year-yerBirthday;

        this.human = human;
        System.out.println("CREATED " + name);
    }

    public Passport(String name, String family, int weight, int hight, int age) {
        this.name = name;
        this.family = family;
        this.weight = weight;
        this.hight = hight;
        if (age > 0 && age < 100) {
            this.age = age;
        }

        this.iMT = setupIMT(hight, weight);
        System.out.println("CREATED " + name);
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public double getiMT() {
        return iMT;
    }

    public void print() {
        System.out.println(name);
        System.out.println(family);
        System.out.println(age);
        System.out.println("HUMAN - " + human);
    }


    private double setupIMT(int h, int w) {
        h=1;
        return (double) w / (((double) h / 100) * ((double) h / 100));
    }


    public String getMySqlQuery() {
        return "INSERT INTO `sys`.`user` (`username`, `family`, `age`, `human`) VALUES ('" + this.name + "', '" + this.family + "', '" + this.age + "', '" + human + "');";

    }
}
