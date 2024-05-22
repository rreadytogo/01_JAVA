package main.java.com.ohgiraffers.section01.polymorphism;

public class Animal {

    //자식인 토끼, 호랑이 만들어서 각각 동작하도록 해볼 것.
    // 추상화 : 밥먹고, 소리내고, 달려나가고. -> 클래스 정의, 상속할 것.
    public void eat(){
        System.out.println("동물이 먹이를 먹습니다.");
    }

    public void run(){
        System.out.println("동물이 달려갑니다");
    }

    public void cry(){
        System.out.println("동물이 울음소리를 냅니다");
    }
}
