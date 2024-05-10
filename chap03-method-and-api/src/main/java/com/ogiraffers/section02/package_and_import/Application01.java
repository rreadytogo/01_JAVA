package main.java.com.ogiraffers.section02.package_and_import;
//????static은 class 자가 복제 과정이 없나??????


public class Application01 {
    public static void main(String[] args) {

        /*
        * 패키지란?
        * 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음으로 단위를 구성하는 것을 말한다.
        * 같은 패키지 내에서는 동일한 이름의 클래스를 make X
        * 다른 패키지 내에서는 동일한 이름의 클래스를 make O
        * 클래스명은 원래 패키지명을 포함하고 있기 때문이다.
        * 지금까지 클래스명에 패키지명을 함께 사용하지 않은 이유?
        * 동일 패키지 내에서 사용했기 때문

        * So, 서로 다른 패키지에 존재하는 클래스를 사용하는 경우
        * 클래스명 앞에 패키지명을 명시해 풀 클래스 이름으로 사용해야 한다.
        * */

//        //Calculator 호출
        main.java.com.ogiraffers.section01.method.Calculator calc = new main.java.com.ogiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(30,20);
        System.out.println(min);

        //static 메소드 호출

        int max = main.java.com.ogiraffers.section01.method.Calculator.maxNumberOf(30,20);
        System.out.println(max);
    //근데 주소 박박 긁으려면 chap03~부터 긁는거 아닌가? 왜 main부터..
//        ㄴ src가 실행구간이기 때문에 하위 main부터 시작!



    }
}
