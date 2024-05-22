package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.Bunny;
import main.java.com.ohgiraffers.section01.DrunkenBunny;
import main.java.com.ohgiraffers.section01.Rabbit;
import main.java.com.ohgiraffers.section01.RabbitFarm;

public class Application01 {

    public static void main(String[] args) {

        /*
        extends 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다.

         */

//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
        //안됨. 막아놔서

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<Rabbit>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        //setter를 이용할 때도 올바른 타입의 인스턴스 전달해야.
        farm4.setAnimal(new Rabbit());
        //래빗팜 클래스에서      private T animal; 이부분이 래빗으로 바뀌는 것.
        //=> 인스턴스 만들어서 넣어주는 것.

        farm4.getAnimal().cry();
        //넣어준거 바로 쓸 수 있다. 별도의 형변환 필요없이
        //제네릭타입에 의해 보장되어있ㄱ ㅣ때문)

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();

        //별도의 유효성 검사없이 사용가능. 래빗팜에서 토끼만을 열어줘서!








    }
}
