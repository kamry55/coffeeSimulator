public class Main {

    public static void main(String[] args) {
        //int counter = 0;

        Secret[] secret = Secret.values();//get all enum constants
        for (Secret answer : secret) {


            System.out.println(answer);
        }
    }
}
enum Secret {
    STAR,
    SHIP,
    SAIL,
    STARSHIP,
    SOAR,
    STARRY,
}
/* sample enum for inspiration
enum Secret {
    STAR, CRASH, START, // ...
}
*/