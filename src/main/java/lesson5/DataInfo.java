package lesson5;

public class DataInfo {
    public DataInfo(String name, int age, int weight, int hight, int iq ) {
        this.name = name;
        this.age = age;
        this.meta = new Parametrs(weight,hight,iq);

    }

    String name;
    int age;
    Parametrs meta;
    public void print(){
        System.out.println(name);
        meta.print();
    }

}

class Parametrs{
    int weight;
    int hight;
    int iq;

    public Parametrs(int weight, int hight, int iq) {
        this.weight = weight;
        this.hight = hight;
        this.iq = iq;
    }

    public void print(){
        System.out.println("DATAIL INFO");
        System.out.println(weight);
        System.out.println(hight);
        System.out.println(iq);
        System.out.println("+++++++++++");
    }
}
