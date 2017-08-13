package task1;

/**
 * Created by arabk on 12.08.2017.
 */
public class Main {

    public static void main(String[] args) {
    Vehicle vec = new Vehicle("fiat");
    Bike b1 = new Bike("romet");
    Vehicle b2 = new Bike("romet");
    Car c1 = new Car("mazda");
    SuperBike sb1 = new SuperBike("romet2");
    Bike sb2 = new SuperBike("romet3");
    Vehicle c2 = new Car("lo");
    System.out.println(vec.run());
    System.out.println(b1.run());
    System.out.println(b2.run());
    System.out.println(c1.run() + " and " + c1.start());
    System.out.println(sb1.run());
    System.out.println(sb2.run());
        System.out.println(c2.run());


        //konwersja typow prostych
char c = 'a';
int asci = (int)c;

// konwersja typow objektowych
String snum = "123.01";
Double dd = Double.parseDouble(snum);

    }

}
