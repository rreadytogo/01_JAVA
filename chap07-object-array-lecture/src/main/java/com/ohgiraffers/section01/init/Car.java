package main.java.com.ohgiraffers.section01.init;

public class Car {

    private String modelName;

    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }
    //generate -> constructor.

    public void driveMaxSpeed(){
        System.out.println(modelName+"이(가) 최고 시속 "+maxSpeed+"km/h로 달려갑니다.");
    }
    // 이 객체는 전체 필드를 넣어서 ? 0959



}
