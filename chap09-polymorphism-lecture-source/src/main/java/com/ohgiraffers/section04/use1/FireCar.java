package main.java.com.ohgiraffers.section04.use1;

public class FireCar extends Car implements Soundable {

    //경적울리기 : 모든 차가 가지는게 아니어서 분리시킨 것.
    //Car에다 해놓으면 모든 차가 가지게 되니까


    @Override
    public void go() {
        System.out.println(
                "소방차가 달려갑니다."
        );
    }


    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다");
    }

    @Override
    public void horn() {
        System.out.println("소방차가 나갑니다. 비키세요");
    }
}


