package main.java.com.ogiraffers.section01.method;
// # static 없으면 자가복제 해야한다는 것이 차이같은데...
public class Application09 {

    public static void main(String[] args) {

        /* 다른 클래스에 작성한 메서드 호출 */

        //최솟값, 최댓값을 비교할 두 정수 선언
        int first = 100;
        int second = 50;

//        static 없으면 똑같은 방법으로 호출

//        static X 버전의 메서드
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);
        System.out.println(min);

//        static O 버전의 메서드
        int max = Calculator.maxNumberOf(first, second);
        System.out.println(max);
//                class이름 넣으면 됨

        int max2 = calc.maxNumberOf(first, second);
        System.out.println(max2);
//        스태틱 메모리 - 이미 올ㄹ라가있다. 논스탵ㄱ 하려고 클래스 자체 만들어서 적재시켜줌
//                더많은 메모리




    }
}
