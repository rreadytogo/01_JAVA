package main.java.com.ohgiraffers.section04.use1;

public class RacingCar extends Car {

    //경적ㅇ ㅣ없을 것, 차만 상속받을 것.


    @Override
    public void go() {
        System.out.println("레이싱카가 달려갑니다");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");

    }
}
