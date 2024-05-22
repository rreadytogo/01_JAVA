package main.java.com.ohgiraffers.section02;

public class Smartphone extends Product
//추상메서드 정의해주지 않아 빨간줄
{

    public Smartphone() {
    }

    @Override
    public void abstractMethod() {
        System.out.println("product 클래스의 추상 메소드를 호출함");
        //오버라이드를 강제화시키는 목적으로 사용한다.
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone의 print 메서드를 호출함.");
    }
}
