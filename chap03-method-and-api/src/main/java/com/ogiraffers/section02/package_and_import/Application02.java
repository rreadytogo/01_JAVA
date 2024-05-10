package main.java.com.ogiraffers.section02.package_and_import;

import main.java.com.ogiraffers.section01.method.Calculator;

import static main.java.com.ogiraffers.section01.method.Calculator.maxNumberOf;
//        Calculator 입력하면 밑에 패키지 주소가 뜨고, 위에 import가 추가된다
// 메서드가 import 된 것을 볼 수 있다

public class Application02 {

    public static void main(String[] args) {

        /*
        import : 타 패키지의 클래스를 패키지명 포함한 주소 없이, 번거롭지 않게 사용할 수 있도록 함.
        맞게 가져왔는지 import를 확인

        서로 다른 패키지에서 존재하는 클래스를 사용하는 경우에는 패키지 명을 포함한 풀 클래스 이름을 사용해야 함.
        하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다
        그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다
         */

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50,60);
        System.out.println(min);

        int max = maxNumberOf(50,60);
        System.out.println(max);

        int max2 = maxNumberOf(100,200);
        System.out.println(max2);






    }
}
