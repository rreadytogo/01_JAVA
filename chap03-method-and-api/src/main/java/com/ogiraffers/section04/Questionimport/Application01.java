package main.java.com.ogiraffers.section04.Questionimport;

import java.util.Random;

public class Application01 {

           /*
       -100에서 100사이의 난수르 발생시켜서 매개변수로 전달하면
       매개변수가 양수면서 짝수면  x는 양수면서 짝수입니다. 양수면서 홀수면 양수면서 홀수입니다.
       음수면서 짝수면 x는 음수면서 짝수입니다. 홀수면 음수면서 홀수입니다.
       를 반환하는 메서드를 복습을 위해 다른 패키지에 클래스를 생성해 임포트 시킨 후 메인 메소드에 출력하시오
       * */

    public String number (int num) {
        String  number1=
                (num > 0 && num % 2 == 0) ? "x는 양수면서 짝수입니다." :
                (num > 0) ? "x는 양수면서 홀수입니다." : (num % 2 == 0) ? "x는 음수면서 짝수입니다." : "x는 음수면서 홀수입니다.";

        return number1;

    }
}

