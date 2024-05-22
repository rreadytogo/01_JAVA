package main.java.com.ohgiraffers.section02;

public abstract class Product {

    private int nonStaticField;

    private static int staticField;

    // 일반생성자와 메서드를 가질 수는 있다!

    public Product() {
// 기본생성자를 가질 수는 있다. 인스턴스를 못만드는 것 뿐.
    }

    public void nonStaticMethod(){
        System.out.println("product 클래스의 nonStaticMethod를 호출");
    }

    public static void staticMethod(){
        System.out.println("product 클래스의 staticmethod 호출");
    }

    public abstract void abstractMethod();
    /*추상메서드 하나 만든 것.

    몸체가 없다. 이건 자식클래스에서 무조건 재정의를 해줘야함
     */
}
