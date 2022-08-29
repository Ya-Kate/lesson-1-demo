package lesson11.PartTwo;
import java.util.Scanner;

public class MyShops {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        AllThings allThings = new AllThings();
        allThings.addClothes();
        allThings.addMaels();

        while (true) {
            System.out.println("Добавить список: одежды нажмите 1, продукта нажмите 2");
            System.out.println("Выйти из программы: 0");
            Scanner scanner = new Scanner(System.in);
            int numVvod = scanner.nextInt();
            if (numVvod == 1) {
                allThings.addClotheNew();
                continue;
            }
            else if (numVvod == 2) {
                allThings.addMealNew();
                continue;
            }

            else {
                break;
            }
        }

    }
}
