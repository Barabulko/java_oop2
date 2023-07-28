// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cat my_pet = new Cat();
        my_pet.hello();
        my_pet.play();

        Cat new_pet = new Cat();
        new_pet.setName("Серый");
        new_pet.setAge(20);

        Cat.CatComparatorByAge comparatorByAge = new Cat.CatComparatorByAge();
        int ageComparison = comparatorByAge.compare(my_pet, new_pet);
        System.out.println("Сравнение по возрасту 1: " + ageComparison);

        new_pet.setAge(10);
        ageComparison = comparatorByAge.compare(my_pet, new_pet);
        System.out.println("Сравнение по возрасту 2: " + ageComparison);

    }
}