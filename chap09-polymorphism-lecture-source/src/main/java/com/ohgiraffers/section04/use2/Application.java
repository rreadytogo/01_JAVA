package main.java.com.ohgiraffers.section04.use2;

public class Application {

    public static void main(String[] args) {
        /*
        우리 -> 다이서 -> 주사위
                 */
        Dicer dicer = new Dicer();

        dicer.throwDice(new HellDice());
        dicer.throwDice(new SuperDice());


    }
}
