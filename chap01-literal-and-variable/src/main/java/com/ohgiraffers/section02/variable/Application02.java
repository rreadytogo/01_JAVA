package main.java.com.ohgiraffers.section02.variable;

public class Application02 {

    public static void main(String[] args) {

        /*
         * 변수를 선언하고 값을 할당하여 사용할 수 있다.
         *
         *
         * 변수를 사용하는 방법
         * 1. 변수를 준비한다 -- 선언
         * 2. 변수에 값을 대입한다. - 값 대입 (초기화)
         * 3. 변수에 사용한다.
         *

         * */

//        int bonus;
//        int 자료형에  bonus 변수를 사용할거야.
//        System.out.println(bonus);
//        값 대입하지 않고 변수만 입력해서는 값이 출력되지 않음.



     /*
     변수에는 자료형이 존재한다.
     자료형이란 ?
     다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리
     컴파일러와 약속한 키워드이다.
     ex) 앞에서 사용한 int 자료형은 4byte만큼을 읽어서 하나의 값으로 취급하겠다는 약속이다
     이러한 자료형은 기본 자료형 (primary type)과 참조자료형 (Reference Type) 으로 나눠진다.
     그 중 기본 자료형 8가지를 먼저 확인한다
      */

        // 1. 숫자를 취급하는 자료형
        // 1byte는 8개의 bit가 모여서 만들어진 단위이다.
        // 1bit는 0과 1 둘 중 하나의 값만 가질 수 있는 데이터의 최소단위.
        // 자바는 기본적으로 데이터의 최소 단위를 1byte만큼 취급한다



        // 프리미티브 타입 기본 자료형 8가지 ( 원시 자료형 )
        byte bnum;  //1byte
        short snum;  //2byte
        int inum; //4byte                        !기본값!
        long lnum; //8byte                       !자주 사용하긴 함!

        //실수를 취급하는 자료형
        float fnum; //4byte
        double dnum; //8byte                     !기본값!

        //문자를 취급하는 자료형
        //문자를 취급하는 자료형은 한 가지이다.

        char ch; //2byte

        //논리값을 취급하는 논리형
        // 1byte 논리 데이터형은 0과 1의 값으로 데이터를 취급하기 때문에 1bit로 표현 가능
        // 최소단위가 1byte이기 때문에, 1byte크기를 갖는다.

        boolean isTrue; // 1byte

        String str;


        //2. 변수에 값을 대입하기
        /* 위에서 한 변수 선언은 메모리에 값을 저장하기 위한 공간만 생성해둔 상태.
        그 공간에 대입 연산자를 이용하여 자료형에 저장하기로 한 값을 저장할 수 있음.
        만약, 약속 내용과 다른 형태의 값을 대입하려고 하면 컴파일러는 에러를 발생시킨다.

        설명
        대입 연산자의 실행 방향은 오른쪽 -> 왼쪽
        즉 오른쪽에 있는 값을 왼쪽의 공간에 대입한다는 의미.
        왼쪽에는 항상 공간, 오른쪽에는 항상 값.
        변수를 대입연산자
        왼쪽에 사용하면 공간의 의미이고,
        오른쪽에 사용하면 변수가 가진 값을 의미

         */

//        int test = "asd"; <-컴파일러에서 오류로 인식

//        개발에서 = 변수에 값을 대입한다는 의미.

        // 정수를 취급하는 자료형에 값을 대입
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;
//        출력시 l은 빠진다. l 꼭 기입해야
        System.out.println(lnum);

        // 실수를 취급하는 자료형에 값 대입

        fnum = 4.0f;
//        fnum = 4,0;  <- 불가 꼭 f로 마쳐야만.
        dnum = 4.0;


        /* 문자를 취급하는 자료형에 값 대입 */
        ch = 'a';
        char ch2 = 97;
        System.out.println(ch2);

        /* 논리형을 취급하는 자료형에 값 대입 */
        isTrue = false;
        System.out.println(isTrue);

//        문자열을 취급하는 자료형에 값 대입
        str = "안녕하세요";


        /*

        숫자로 된 형태의 값을 그대로 사용하는 자료형은 byte, short, int, double이다
        일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을
        대표자료형이라고 하며,
        정수는 int 실수는 double이다.


         */

        System.out.println("-------------변수값 출력하기-----------------");
        System.out.println("bnum의 값 : " + bnum);
        System.out.println("snum의 값 : " + snum);
        System.out.println("inum의 값 : " + inum);
        System.out.println("lnum의 값 : " + lnum);

        System.out.println("fnum의 값 : " + fnum);
        System.out.println("dnum의 값 : " + dnum);

        System.out.println("isTrue의 값 : " + isTrue);
        System.out.println("str의 값 : " + str);


        int bonus = 100;
        int point = 10;

        System.out.println("포인트와 보너스의 합은 : " + (point+bonus));

//        대입연산자의 왼쪽과 오른쪽 편에 사용하기
        bonus= bonus + 100;
//      bonus += 100; 과 같음.
        System.out.println("bonus = bonus + 100 ? " + bonus);








    }
}
