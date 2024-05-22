package main.java.com.ohgiraffers.section02.string;

public class Application02 {

    public static void main(String[] args) {
        /*

        문자열 객체를 만드는 방법

        "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다(singleton)

        new string("문자열") : 매번 새로운 인스턴스를 생성함

         */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        //NEW : 힙영역에 새롭게 개체 할당하는 . 11:05
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));
        //같은 주소공간을 가지고 있어서, 따로 선언해도 true. 11:06

        System.out.println("str2 == str3 : " + (str2 == str3));
        //주소공간이 달라서 false

        System.out.println("str3 == str4 : " + (str3 == str4));
        //둘 조차도 다른 공간

        System.out.println("str1 : " + (str1.hashCode()));
        System.out.println("str2 : " + (str2.hashCode()));
        System.out.println("str3 : " + (str3.hashCode()));
        System.out.println("str4 : " + (str4.hashCode()));
        //다 같은걸 확인


        //문자열은 자체적으로 재정의 되어있어 해시코드는 똑같음.
        //11:08 전까지

        System.out.println("==================================");

        str2 += "oracle";
        System.out.println("str1==str2 : " + (str1 == str2));
        //공간자체가 바뀐게 아니라, 공간자체가 새롭게 추가된 것. 그래서 false

        /*
        equals() : String 클래스의 eauals 메소드는 인스턴스 비교가 아닌 문자열값을 비교하여
        동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false
        object의 equals() 메소드를 재정의 해두었다

        따라서 문자열 인스턴스생성 방식은 상관없이 동일한 문자열인지 비교하기 위해 == 대신
        equals() 메소드 사용해야.
         */

        System.out.println("str1.equals(str3) : " + (str1.equals(str3)));
        //순수값 비교여서 new 연산자 사용했지만 true 반환함을 볼 수 있다





    }
}
