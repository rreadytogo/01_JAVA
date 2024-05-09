package main.java.com.ohgiraffers.section03.constant;

public class Application01 {


    public static void main(String[] args) {

        /*
        상수란?
        변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면,
        상수는 이와 상반되는 개념.
        변하지 않는 값을 (고정된 값) 저장해두기 위한 메모리장의 공간을 상수라고 함.

        상수의 사용 목적
        변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
        초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.

        사용방법
        1. 상수를 선언한다 (변수 선언과 유사하지만 final 키워드 사용)
        2. 값을 초기화한다 (초기화 이후에는 값 변경 불가능)
        3. 필요한 위치에 상수를 호출해서 사용한다

         */

        // 상수는 선언시에 final 키워드를 붙인다.
        // 상수명은 다 대문자로 작성.
        final int AGE;

        // 상수 초기화
        AGE = 10;
        // 상수는 한 번 초기화(값 설정)했으면, 추후 변경 X
       // AGE = 30; // X

        System.out.println("AGE의 두배의 값 : " + (AGE*2));


        int sum = AGE;
        System.out.println(sum);

        //상수를 변수의 값에 넣는 것이 가능하다





    }
}
