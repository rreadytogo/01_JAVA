package main.java.com.ohgiraffers.section01;

public class RabbitFarm<T extends Rabbit>
//public class RabbitFarm<T extends Rabbit  & Animal>
// 도 가능!
 {

    //래빗의 자손만 들어올 수 있게 제네릭이 지정해준 것
    //T만 있으면 모든 타입이 들어올 수 있다.

     private T animal;

     public RabbitFarm() {

     }

     public RabbitFarm(T animal) {
         this.animal = animal;
     }

     public T getAnimal() {
         return animal;
     }

     public void setAnimal(T animal) {
         this.animal = animal;
     }
 }
