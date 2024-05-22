package main.java.com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal{

    //Animal로부터 상속.

    //오버라이드 통한 재정의 할 것.
    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어먹고 있습니다");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다");
    }

    //토끼만의 메서드 추가.
    public void jump(){
        System.out.println("토끼가 점프를 합니다.");
    }
}
