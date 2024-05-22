package main.java.com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("호랑이가 식사하고 있습니다");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 달려갑니다");

    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖고 있습니다.");
    }

    public void bite(){
        System.out.println("호랑이가 물어뜯습니다.");
    }
}
