package main.java.com.ogiraffers.section04.question;

import main.java.com.ogiraffers.section01.method.Application07_test;
import main.java.com.ogiraffers.section01.method.Calculator;
import main.java.com.ogiraffers.section04.Questionimport.Application01;

import java.util.Random;

public class Question {

    public static void main(String[] args) {
        
       /*
       -100에서 100사이의 난수르 발생시켜서 매개변수로 전달하면
       매개변수가 양수면서 짝수면  x는 양수면수 짝수입니다. 양수면서 홀수면 양수면서 홀수입니다.
       음수면서 짝수면 x는 음수면서 짝수입니다. 홀수면 음수면서 홀수입니다.
       를 반환하는 메서드를 복습을 위해 다른 패키지에 클래스를 생성해 임포트 시킨 후 메인 메소드에 출력하시오
       * */

//        main.java.com.ogiraffers.section04.Questionimport.Application01 = new main.java.com.ogiraffers.section04.Questionimport();
//        int num
//        System.out.println(num);

        Random random = new Random();
        int num = random.nextInt(201) - 100;
        //num을 넘겨줄 메서드 작성
        //import -> 주소 다 쓸 필요X
        Application01 number = new Application01();


        int randomx = random.number(num);
        System.out.println(randomx);


    }
}
