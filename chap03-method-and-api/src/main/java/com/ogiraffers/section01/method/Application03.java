package main.java.com.ogiraffers.section01.method;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Application03 {

//    int test=10;

    //전역변수는 class와 메인메서드 사이.
    // 어디서 사용가능하다고?????


    public static void main(String[] args) {

        /*
        변수의 종류

        1. 지역변수
        메소드 내부에서 사용할 수 있음
        int a  = 10;

        2. 매개변수
        계산기 만들 때 (int a, int b)
        값을 호출할 때 전달할 수 있는 변수.
        일종의 지역변수.
        매개변수 받은 메서드 내에서만 사용 가능
        자료형만 맞추게 되면 전달 가능. (연산결과 바로, 강제형변환, 자동형 변환 등등..)


        3. 전역변수(필드)



        4. 클래스(static)변수

         */
//        int a = 10;
//        int b = 20;

        Application03 app3 = new Application03();
        app3.testMethod(28);
//        app3.testMethod(20,30);
//          app3.testMethod("30"); error 같은 타입이어야만.
//        ""문자니까

        // 변수에 저장한 값 전달 테스트

        int age = 20;
        app3.testMethod(age);

        // 자동 형 변환을 이용한 값 전달 테스트

        byte byteAge = 17;
        app3.testMethod(byteAge);
        //int보다 작은 byte를 넣어도 자동 형 변환이 일어나 error가 생기지 않는다

        // 강제 형 변환을 이용한 값 전달 테스트
        long longAge = 30;
//        app3.testMethod(longAge); error! long이 더 크니까 못 담아
        app3.testMethod((int) longAge);

        // 연산 결과를 이용하는 값 전달 테스트
        app3.testMethod(byteAge * 2);


    }

    public void testMethod(int age) {

        System.out.println("당신의 나이는 " + age + "세 입니다.");


    }
}
