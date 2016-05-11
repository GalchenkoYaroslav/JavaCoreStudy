import cats.Cat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yaroslav on 11.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Cat barsic = new Cat();
        Cat tom = new Cat();
        barsic.setName("Barsic");
        tom.setName("Tom");
        ArrayList<Cat> cats = new ArrayList();
        cats.add(barsic);
        cats.add(tom);

        for (int i =0; i < 2; i++){
            System.out.println(cats.get(i).getName()+ "  simple for");
        }

        for(Cat cat:cats){
            System.out.println( cat.getName() + "  foreach");
        }

    }




}
