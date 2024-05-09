package main.java.com.ohgiraffers.section05.typecasting;

public class Application01 {

    public static void main(String[] args) {

        /*
        데이터형 변환
        자바에서 다른 타입끼리의 연산은 피 연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다.
         */

        /*
        형 변환의 종류와 규칙
        1. 자동형 변환 - 컴파일러가 자동으로 수행해주는 타입 변환
            1-1. 작은 자료형 -> 큰 자료형으로 자동 형 변환 된다.
            1-2. 정수는 실수로 자동 형 변환 된다.
            1-3. 문자형은 int형으로 자동형 변환 된다.
            1-4. 논리형은 형변환 규칙에서 제외된다.

        2. 강제 형 변환 - 형 변환 cast 연산자를 이용한 강제적으로 수행하는 형 변환



         */

        // 1-1 정수끼리의 형 변환
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20L;

        long result = num1 + num2;
        // int result2 = num1+num2; <-Error!

        System.out.println(result);

        // 1-2 정수와 실수의 형 변환

        //정수자료형 + 실수자료형 더했을 때, 어떻게 변하는지 보자

        long eight = 8L;
        float four = eight;
        System.out.println(four);

        float result3 = eight + four;
        System.out.println(result3);

        // long result4 = eight + four; Error!


        char ch1 = 'a';
        int charNumber = 97;


        //2. 강제형변환//
       // char chValue = charNumber;  error
        char chValue =  (char)charNumber;
        System.out.println(chValue );
        System.out.println((int)ch1);
        System.out.println((char)charNumber);
        //아스키코드에 있는 문자도 형변환 해줄 수 있다.

        char ch2 = 65;
        System.out.println(ch2);
        //컴퓨터는 문자인식할 수 없고, 숫자를 그에 대응시킨다.
        //따라서 문자출력시 , 형변환 해야

        // 논리형은 형변환 규칙에서 제외됨
        boolean isTrue = false;
        //byte b = isTrue;              error!
        // String test = isTrue;        error!
        // int 1 =








    }
}
