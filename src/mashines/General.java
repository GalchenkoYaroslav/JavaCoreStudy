package mashines;

import cats.Cat;
import mashines.Car;
import mashines.Mashine;
import mashines.Moto;

import java.awt.*;
import java.util.*;
import java.util.List;


/**
 * Created by Yaroslav on 19.04.2016.
 */
public class General {

    public static void main(String[] args) {

        System.out.println();
        General den = new General();
          Cat cat = new Cat();
//        SmallCat smallCat = new SmallCat();
//        BigCat bigCat = new BigCat();
//        say(cat);
//        say(smallCat);
//        say(bigCat);

//
        List list = new ArrayList<>();
        Map map = new TreeMap<String, String>();
        Mashine mashineCar = new Car();
        Mashine mashineMoto = new Moto();
        Car car = new Car();
        doDrive(mashineMoto);
        doDrive(mashineCar);
        System.out.println();

    }

//    static void say(Cat cat){
//        cat.sayHello();


// }

    static void doDriveByCar(Car mashine){
        mashine.drive();
    }

    static void doDrive(Mashine mashine) {
      mashine.drive();
    }

}