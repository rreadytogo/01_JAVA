package main.java.com.ohgiraffers.section03.interfaceimplements;

public interface InterProduct {

    /*
    인터페이스는 상수필드는 작성 가능
     */

    public static final int MAX_NUM = 100;
    int MIN_NUM = 10;
    //해도 위와 같은 의미를 가진다.


    void abstractMethod();
    /*
    인터페이스는 구현의 책임을 가짐 ->
    자동적으로 접근제한자가 public으로 붙어요
    이걸 사용해서 구현해야하기 때문에,
    제한적으로 열어주지 않고 public이 들어간 것.
    -> 그래야 어디서든 오버라이딩 사용 가능.
    public abstract가 생략된 것으로 보면 된다.
     */

    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 static method 호출");
    }
    //스태틱메서드는 몸체를 갖춰야 작성할 수 있다.



    default void defaultMethod() {
        System.out.println("InterProduct 클래스의 default 메소드 호출");
    }
}
