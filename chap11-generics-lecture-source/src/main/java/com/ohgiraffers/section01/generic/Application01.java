package main.java.com.ohgiraffers.section01.generic;

import java.awt.geom.QuadCurve2D;

public class Application01 {

    public static void main(String[] args) {

        /*

        제네릭
        사전적 의미 : 일반적인
        자바       : 데이터의 타입을 일반화

        제네릭 : 클래스나 메소등서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법
        컴파일 시 미리 타입 검사를 시행 ->
        클래스 / 메소드 내부에서 사용되는 객체의 타입 안정성 높일 수 있음
        (아닐 경우 컴파일 에러)

        반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략 가능해짐
        (instanceOf 비교 및 다운 캐스팅 작성 불필요)
        jdk 1.5버전부터 추가된 문법

        제네틱 프로그래밍
        데이터의 형식에 의존하지 않고 하나의 값이 다른 데이터 타입들을 가질 수 있는 기술에
        중점을 두어 재사용성을 높일 수 있는 프로그래밍 방식

         */

        GenericTest<Integer> gt1 = new GenericTest<Integer>();
                //new GenericTest<Integer> 속 인티저는 빼도 됨

        gt1.setValue(10);
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        GenericTest<String> gt2 = new GenericTest<>();

        gt2.setValue("홍길동");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        GenericTest<Double> gt3 = new GenericTest<>();

        gt3.setValue(0.5);
        System.out.println(gt3.getValue());
        System.out.println(gt3.getValue() instanceof Double);
    }
}
