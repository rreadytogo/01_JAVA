package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

public class Application02 {

    public static void main(String[] args) {
        /*

        와일드카드

        제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 떄,
        그 객체 타입변수를 제한할 수 있다.
        <?> : 제한없음
        <? extends Type> : 와일드카드 상한 제한 (Type과 Type 후손을 이용해 생성한 인스턴스만 가능)
        <? super Type> : 와일드카드 하한 제한 (Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)

         */

        WildCardFarm wildCardFarm = new WildCardFarm();
        //농장 생성 자체가 불가능한 경우 매개변수로 사용할 수 없다.
        //래빗은 래빗의 후손만 받는다.
//        wildCardFarm.anyType(new RabbitFarm<>());
//        wildCardFarm.anyType(new RabbitFarm<Reptile>());

        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // extends
        // wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        // super
        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
        // wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
