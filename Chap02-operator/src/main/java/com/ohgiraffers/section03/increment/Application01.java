package main.java.com.ohgiraffers.section03.increment;

public class Application01 {

    public static void main(String[] args) {

        /*
        증감 연산자
        ++X, X++ : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 증가시킨다.
        --X. X-- : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 감소시킨다.
         */

        int num = 10;
        int num2 = 20;
        int result = 0;
        //변수 선언
         result = result * ++num;
         //num = num+1이 된 후에 *가 일어난 것이므로, 11이 출력됨.
        System.out.println(result);
        System.out.println("num = " + num);

        System.out.println("------------------------------");

        int numm = 11;
        result = 1;
        result = result * numm++;
        System.out.println(numm);
        System.out.println(result);
        System.out.println("numm = " + numm);





    }
}
