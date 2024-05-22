package main.java.com.ohgiraffers.section01;

public class WildCardFarm {

    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
        //래빗팜 매개변수잖아. 제네릭타입으로 들어오는 어떤 자료형도 쓸 수 있다.
    }

    public void extendsType(RabbitFarm<? extends Bunny> farm){
        //제네릭타입 중 버니 후손이거나 버니자신만 쓸 수 있다고 열어준 것.
        farm.getAnimal().cry();

    }

    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}
