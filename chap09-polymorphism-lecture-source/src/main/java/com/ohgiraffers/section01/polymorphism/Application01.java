package main.java.com.ohgiraffers.section01.polymorphism;

public class Application01 {

    public static void main(String[] args) {
        /*
        1. 다형성 (하나의 클래스가 여러가지 자료형을 가질 수 있다는 것. 카 - 레이싱카 / 소방카)

        다형성이란 하나의 인스턴스가 여러 가지의 타입을 가질 수 있다는 것을 의미.
        -> 하나의 타입으로 여러 타입의 인스턴스 처리 가능
           & 하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작 가능

        다형성은 객체지향 프로그래밍의 3대 특징(캡슐화, 상속, 다형성) 중 하나이며,
        객체지향 프로그래밍의 꽃이라고 불러울 정도로 활용성이 높고 장점이 많다.
        하지만 학습하기 어렵다는 단점있음.

       2. 다형성의 장점

        ㄱ.여러타입의 객체를 하나의 타입으로 관리할 수 있어 유지보수성과 생산성 증가
        ㄴ. 상속을 기반으로 한 기술 -> 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있음.
       이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있음
       (다양한 기능을 사용하는데 있어서 관리해야할 메세지 종류가 줄어들게 됨)
       하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다
       다형성을 이해하기 쉬운 가장 좋은 예이기도 함.
       하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고만.

        ㄷ. 확장성이 좋은 코드를 작성할 수 있다

        ㄹ. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.

         */

        //amnimal 인스턴스 생성 후 메소드 호출
        System.out.println("======= animal 생성 =======");
        Animal animal = new Animal();
        animal.cry();
        animal.eat();
        animal.run();

        //래빗 타이거도 인스턴스 생성 후 메소드 호출
        System.out.println("=====================토끼=====================");
        Rabbit rabbit = new Rabbit();
        rabbit.cry();
        rabbit.eat();
        rabbit.run();
        rabbit.jump();

        System.out.println("=====================호랑이====================");
        Tiger tiger = new Tiger();
        tiger.cry();
        tiger.eat();
        tiger.run();
        tiger.bite();

        //부모타입으로 자식 이스턴스 주소값 저장
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();
        //타이거도 부모타이거로 저장.

//        Rabbit r = new Animal(); error! 애니멀이 래빗보다 크기 때문.

        // 동적 바인딩 확인
//        컴파일 당시
//                실행 -> 오버라이딩 .자식클래스 로 바뀌어 동작하는 것
        System.out.println("===============동적 바인딩 =======================");
        animal1.cry();
        animal2.cry();
        //부모에 넣었는데 자식의 메소드로 출력되는것알 수 있다

//        animal1.jump();
        //래빗이니까 점프가 존재하는데 찾지못하고 있다. 같은 주소값 참조하지만, 부모자료형이기 때문에 사용할 수 x
        //dfafdasfㄴㅇㅁㄹㄴㅁㅇㄹㅇㄴㄹ 부모클래스 참조..? 하면 자식 메소드는 못하나?
        // 각각의 레퍼런스 자료형으로 형변환 시켜줘야 고유의 기능 사용 가능

        System.out.println("================클래스 타입의 형변환 확인==================");
        ((Rabbit)animal1).jump();
        ((Tiger)animal2).bite();
//        각각의 타입에 맞지않게되면 클래스 인터셉션? 이라고 ...

//        ((Tiger)animal1).bite();
        //이 자체는 오류나지 않지만 an1이 토끼라. 오류남

//        ((Rabbit)animal2).jump(); 오류

        // instanceOf 연산자 확인
        System.out.println("=================== instance of 확인===================");
        System.out.println("animal이 Tiger와 같은지 "+(animal1 instanceof  Tiger));
        System.out.println("animal이 Rabbit와 같은지 "+(animal1 instanceof  Rabbit));
        System.out.println("animal이 Animal과 같은지 " +(animal1 instanceof Animal));
        System.out.println("animal이 Animal2과 같은지 " +(animal2 instanceof Animal));
        System.out.println("animal2이 Tiger과 같은지 " +(animal1 instanceof Animal));
        System.out.println("animal2이 Tiger과 같은지 " +(animal1 instanceof Tiger));
        // 협업할 때 인스턴스 오브로 확인을 해줘야 한다.

        if(animal1 instanceof  Rabbit){
            ((Rabbit)animal1).jump();
        }

        Animal animal3 = new Rabbit();
        //묵시적 형변환. 자식을 부모에 넣어주는 것. 자동형변환이 됨.

        Animal animal4 = (Animal) new Rabbit();
        Rabbit rabbit1 = (Rabbit) new Animal();
        //다운캐스팅은 꼭 써줘야한다.

//        Rabbit rabbit2 = (RA) ㄴㅇㅁㄹㄻㄴㅇㄹㅇㄴㄹㄴㅁㅇㄹㄴㅇㅁㄹ
                //부모타입으로 올린 것을 다시 내릴 때 사용하는 것.









    }
}
