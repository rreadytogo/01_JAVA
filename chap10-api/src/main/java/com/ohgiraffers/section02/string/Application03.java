package main.java.com.ohgiraffers.section02.string;

import java.util.StringTokenizer;

public class Application03 {

    public static void main(String[] args) {

        /*

        문자열 분리
       문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능
       split() :  정규표현식을 이용하여 문자열 분리
       비정형화된 문자열을 분리할 때 좋지만 (공백 문자열 값 포함)
       정규표현식ㅇ르 이용하기 때문에 속도가 느리다는 단점

               StringTokenizer : 문자열의 모든 문자열을 구분자로 하여 문자열을 분리한다
               정형화된 문자열 패턴을 분리할 때 사용하기 좋다 (공백 문자열 무시)
               split()보다 속도면에서 빠르다
               구분자를 생략하는 경우 공백이 기본 구분자이다

         */

        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        //지역뺀것
        String emp3 = "300/이순신/경기도/";
        //부서뺀것

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        for (int i = 0; i < empArr1.length; i++) {
            System.out.println("empArr1[" + i + "] = " + empArr1[i]);
        }
        //각각 쪼개져서 인덱스에 추가된 것을 볼 수 있다.

        //토큰 스필릿으로 쪼개서 용도에 맞게 사용함

        System.out.println("=============공백포함 확인==============");

        for (int i = 0; i < empArr2.length; i++) {
            System.out.println("empArr2[" + i + "] = " + empArr2[i]);
        }
        System.out.println("============= 마지막인자에 존재하지 않는 값을 추출하고 싶을 때 ==============");
        String[] empArr4 = emp3.split("/", -1);
        for (int i = 0; i < empArr4.length; i++) {
            System.out.println("empArr4[" + i + "] = " + empArr4[i]);
        }

        System.out.println("==========Tokenizer==========");
        //토크나이저 " 공백 무시

        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        while (st1.hasMoreTokens()) {
            System.out.println("st1 : " + st1.nextToken());
        }
        //다음토큰이 존재할 때까지 반복.\
        System.out.println();
        while (st2.hasMoreTokens()) {
            System.out.println("st2 : " + st2.nextToken());
        }
        //아예 공백 무시된 것을 볼 수 있음
        System.out.println();
        while (st3.hasMoreTokens()) {
            System.out.println("st3 : " + st3.nextToken());
        }

        while (st1.hasMoreTokens()) {
            //한번 넥스트토큰으로 뺏으면 다시 출력x
            System.out.println("st1 : " + st1.nextToken());
        }
        //출력안됨.
        System.out.println();

        String colorstr = "red*orange#blue/yellow green";
//        String[] color = colorstr.split("#");
        String[] colors = colorstr.split("[*#/ ]");

        StringTokenizer colorStringTokenizer = new StringTokenizer(colorstr, "*#/ ]");
        //구분할문자열, 문자
        for (int i = 0; i < colors.length; i++) {
            System.out.println("colors[" + i + "] = " + colors[i]);
        }

        while (colorStringTokenizer.hasMoreTokens()) {
            System.out.println(colorStringTokenizer.nextToken());
        }


    }
}
