package main.java.com.ohgiraffers.section03.abstraction;

public class CarlRacer {

    private Car car = new Car();
    // 속성 : 차 있음 구현
    // 카에 대한 직접적 권한은 카레이서에게 있으니까.

    public void startUp() {
        car.startUp();
//카레이서 -> 카에 스타트업 명령을 한 것.
    }
    // this.car의 시동을 달아주는 메서드

    public void stepAccelator() {
        car.go();
    }
    // this.car를 앞으로 가게 하는 메서드

    public void stepBreak() {
        car.stop();
    }
    // this.car를 멈추는 메서드

    public void turnOff() {
        car.turnOff();
    }
    // this.car 시동을 끄는 메서드


}
