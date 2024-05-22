package main.java.com.ohgiraffers.section01.polymorphism;

public class Application02 {

    //배열만들어서 연속적으로 처리할 것.
    public static void main(String[] args) {
        //애니멀로 객체배열 만들 것
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();
        //자식 클래승기때문에 부모의 모든 것을 사용할 수 있다

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
        //토끼 울어 호랑이 울어 각자 명령말고 동물 울어! 이렇게 한번에 할 수 있음.

        /*
        각 클래스별 고유한 메소드를 동작시키기 위해서는
        down-casting을 명시적으로 해주어야 한다.
        ClassCastException을 방지하기 위해서 instanceOf 연산자를 이용해야 한다
         토끼에 호랑이가 들어가는 것을 방지해야겟죠?

         => 향상된 for문 사용
         */
        for(Animal animal : animals) {
            if(animal instanceof Rabbit){
                ((Rabbit)animal).jump();
                //animal이 Rabbit의 자료형을 가지고 있으면 -> 동작.
            }else{
                ((Tiger)animal).bite();
            }
        }

    }
}
