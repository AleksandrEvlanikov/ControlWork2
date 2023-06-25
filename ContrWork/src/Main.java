import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ToysShop toy0 = new ToysShop("Слоник", 1, 15);
        ToysShop toy1 = new ToysShop("Бигемотик", 3, 10);
        ToysShop toy2 = new ToysShop("Змейка", 2, 15);
        ToysShop toy3 = new ToysShop("Солдатик", 4, 60);
        List<ToysShop> toys = new ArrayList<>();
        toys.add(toy0);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy1);

        Random random = new Random();
        DrawTings drawTings = new DrawTings(toys, random);

        for (int i = 0; i < 10; i++ ){
            ToysShop toy = drawTings.drawToy();
            System.out.println("Выпала игрушка: " + toy.getName());
        }
    }
}