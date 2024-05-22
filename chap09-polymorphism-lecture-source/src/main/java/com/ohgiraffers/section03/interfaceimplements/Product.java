package main.java.com.ohgiraffers.section03.interfaceimplements;

public class Product extends Object implements InterProduct  {

    /*
    클래스에서 인터페이스를 상속받을 때 : implements 키워드를 사용한다
    또한 인터페이스는 여러개를 상속받을 수 있으며
    extends로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능해진다.

    단, extends 키워드를 앞에 작성하고 뒤에 implements 키워드를 작성한다.
    (순서 바뀌면 에러 발생)

     */

    // 빨간줄 : 재정의 안해줘서 에러나는 것

    @Override
    public void abstractMethod() {
        System.out.println("interProduct의 nonstaticMethod 오버라이딩 메소드 호출");
    }

    @Override
    public void defaultMethod() {
        InterProduct.super.defaultMethod();
        System.out.println("interfaceProduct default 메소드 오버라이딩 호출");
    }

    /*
    ㅁㄻㄴㄹ 1056
   인터페이스 추상클래스처럼 상속받아 1056
  재정의하지 않으면 에러 발생.
     */
}
