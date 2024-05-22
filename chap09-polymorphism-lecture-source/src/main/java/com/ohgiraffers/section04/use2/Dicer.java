package main.java.com.ohgiraffers.section04.use2;

public class Dicer {

    //주사위 굴릴사람 만드는 클래스

    private int currentPosition;
    //현재 위치 나타내주는 필드

    //주사위 굴리고 -> 움직임 구현
    public void throwDice(Dice dice){
        //다이서니까 주사위를 굴려야 함.
      //주사위 종류를 매개변수로 받을 것
        //주사위마다 겟넘버메서드를 만들어놨음.
        //각각 담아준 다이스를 겟넘버메서드에 시동해서 발생하는 4, 1~14사이의 넘버를 다이스에 담아준 것


      int diceNumber  = dice.getNumber();
        move(diceNumber);
      //각각 담아준 다이스를 겟넘버메서드 시동해서 발생하는 값을 다이스넘버에 넣어준 것.




        //
        System.out.println(currentPosition + " 만큼 이동하셨습니다.");

    }

    //이동하는 메서드
    public void move(int diceNumber){
      this.currentPosition += diceNumber;
      //throwdice 이욯애서 get number


    }
}
