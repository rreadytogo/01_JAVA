package main.java.com.ogiraffers.section03.math;

import java.util.Random;

public class Application01 {

    public static void main(String[] args) {

        /*
        API란?
        Application Programming Interface.
        응용프로그램에서 사용할 수 있도록,
        운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스.
        쉽게 말해 우리가 구현할 수 없거나,
        구현하기 번거로운 기능들을 jdk를 설치하면 자동으로 사용할 수 있도록 제공해놓은 소스코드.

        더 쉽게 말해 누가 작성해놓은 소스 코드를 갖다 쓰는 것.

        모든 코드를 개발자들이 외울 수 없어 -> api 문서 별도 제공.

        system.out.println(); : 출력을 구현해놓은 것

------------------------------------------------------------------------------------------------
         */

        /*
        java. lang. Math
        Math 클래스는 수학에서 자주 사용되는 상수들과 함수들을 미리 구현해놓은 클래스
        모든 메소드는 static 메소드로 정의되어 있다

         */

        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));
        //ctrl 누르고 커서를 갖다대면, 어떤 기능들이 있는지 확인할 수 있다.
        System.out.println("-1.25의 절대값 : " + (Math.abs(-1.25)));
        System.out.println("10과 20 중 더 작은 값은? : " + (Math.min(10,20)));
        System.out.println("10과 20 중 더 큰 값은 ? : " + (Math.max(10,20)));
        System.out.println("원주율 : " + (Math.PI));


        //원하는 범위의 난수를 구하는 공식
        
            //  난수 발생 0~10 : 랜덤으로 숫자 생성
             // ㄴ 로또 추첨 프로그램으로 활용
        System.out.println("난수 발생 : " + (int)(Math.random()*10)); // double 0.xxxxx 나올 수 있어서 x10을 한 후 출력되게 한 것


        Random random = new Random();
        int randomNumber = random.nextInt(10);
        //bound에는 원하는 숫자의 범위 쓰면 됨.
        System.out.println("난수 발생 : " + randomNumber);

        // -128~127 사이의 난수를 발생시키기
        int randomNumber1 = new Random().nextInt(256)-128;
        /*이렇게도 쓸 수 있다
        클래스 메모리에 올리자마자 변수에 담지않고 꺼내서 쓰는 방식*/




        
        

        //import 사용해서 사용하기


    }


}
