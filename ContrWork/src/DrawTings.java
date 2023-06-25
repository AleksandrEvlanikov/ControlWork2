import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawTings {
    private List<ToysShop> toys;
    private Random random;

    public DrawTings(List<ToysShop> toys, Random random) {
        this.toys = toys;
        this.random = random;
    }

    public List<ToysShop> getToys() {
        return toys;
    }

    public void setToys(List<ToysShop> toys) {
        this.toys = toys;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public ToysShop drawToy() {
        int totalPercent = calculateTotalPercent();
        int randomNum = random.nextInt(totalPercent) + 1;

        for (ToysShop toy : toys) {
            randomNum -=toy.getPercent();
            if (randomNum <= 0) {
                return toy;
            }
        }
        return null;

    }

    private int calculateTotalPercent() {
        int totalPercent = 0;

        for (ToysShop toy : toys) {
            totalPercent += toy.getPercent();
        }
        return totalPercent;
    }


}
