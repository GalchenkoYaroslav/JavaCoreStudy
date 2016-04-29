package mashines;

/**
 * Created by Yaroslav on 26.04.2016.
 */
public class Car implements Mashine, Design{

    String carColor;
    int petrol;

    @Override
    public void drive() {
        System.out.println("Drive by Car!");
    }

    @Override
    public int countPetrol() {
        return petrol;
    }

    @Override
    public void doColor(String colorName) {
        carColor = colorName;
    }
}
