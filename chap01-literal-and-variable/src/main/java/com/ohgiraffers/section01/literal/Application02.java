package main.java.com.ohgiraffers.section01.literal;

public class Application02 {

    public static void main(String[] args) {

        /* 정수 리터럴 연산 형식의 값을 직접 연산한다. */

        /*
         *
         * 1. 123+456
         * 2. 123-456
         * 3. 123*456
         * 4. 40/10
         * 5. 10 %2
         *
         *
         * */


        System.out.println("123+456의 답은 " + 123 + 456);
        System.out.println(123 - 456);
        System.out.println("123*456의 답은 " + 123 * 456);
        System.out.println("40/10의 답은 " + 40 / 10);
        System.out.println("10%2의 답은 " + 10 % 2);

        System.out.println("-------------------------");

        /* 정수와 실수 연산 */

        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        System.out.println("-------------------------");


        /* 문자와 문자의 연산 */
//        문자끼리의 연산도 사칙 연산 OK! 아스키코드때문 (한 문자에 대응되는 수가 있음)

        System.out.println('a' + 'b');
        System.out.println('ㄱ' + 'ㄴ');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
        System.out.println("-------------------------");
        /* 문자열은 + 연산만 가능하다. */

        System.out.println( "hello" + 123);
        System.out.println( "hello" + 123.456);
        System.out.println( "hello" + 'a');
        System.out.println( "hello" + true);

        System.out.println("-------------------------");
        System.out.println( "123"+"456");
        System.out.println("-------------------------");

        /*논리값 연산*/
//        System.out.println(true+false); -> 불가. 논리값끼리 연산 X
        System.out.println(true+"false");
//        System.out.println(true+1); -> 불가. 정수끼리 연산 X


        System.out.println("-------------------------");

        System.out.println("안녕"+"하세"+'요');






    }

}
