import java.sql.SQLOutput;

class Cat {

    String name;
    int age;
    static int counter = 0;

    // write static and instance variables

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");

        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}