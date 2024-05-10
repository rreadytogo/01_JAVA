package main.java.com.ogiraffers.section01.method;

import java.sql.SQLOutput;

public class Application05 {
    public static void main(String[] args) {
        
        /*
        return?
        현재 메소드를 강제 종료하고 구문으로 다시 돌아가는 명령어
        (So, return 후에 다른 명령문을 작성해도 동작 X)

        모든 메소드 내부에는 return;이 존재한다
        void : return을 명시적으로 작성하지 않아도 마지막 줄에 컴파일러가 자동으로 추가해준다

         */

        System.out.println("main() 메소드를 시작함..");

        Application05 app5 = new Application05();
        app5.testMethod();

        System.out.println("main() 메소드를 종료함..");

    }

    public void testMethod(){

        System.out.println("testMethod() 동작 확인");

        return;


//        System.out.println("test"); Error : return 하면 활동이 끝난 것. 추가로 뒤에 적어도 동작 X

//        보통메서드는 return 포함한다
//        void는 알아서 return 기능이 내재되어있어서 생략해도 무방하다
    }


}
