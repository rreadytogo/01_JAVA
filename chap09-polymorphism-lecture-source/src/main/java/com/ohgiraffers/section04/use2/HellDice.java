package main.java.com.ohgiraffers.section04.use2;

public class HellDice implements Dice {

    //주사위를 상속받을 클래스.


    @Override
    public int getNumber() {
        return 4;

    }
    //구현책임으로 인해 오버라이딩.

}
