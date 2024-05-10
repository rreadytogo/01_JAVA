package main.java.com.ogiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        /*
         * Static 메서드 호출
         * 메인말고도 static 메서드 만들 수 있다
         * 호출하는 방법 어떤 것인지 알아볼 것
         * */

        /*
        static 메서드를 호출하는 방법
        클래스명, 메서드명();
         */

        System.out.println(
                "10과 20의 합 : " + Application08.sumTwonumber(10, 20)
        );

        System.out.println("20과 30의 합 : " + sumTwonumber(20, 30));
        //app~8 생략 가능

    }

    public static int sumTwonumber(int num1, int num2) {
        return num1 + num2;
    }


}
