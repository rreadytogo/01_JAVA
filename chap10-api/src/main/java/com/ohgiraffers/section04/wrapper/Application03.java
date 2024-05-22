package main.java.com.ohgiraffers.section04.wrapper;

public class Application03 {

    public static void main(String[] args) {

        //parsing과 반대로 기본자료형 값을 문자열로 변경하는 경우도 필요하다

        /*
        valueOf() : 기본 자료형 값을 Wrapper 클래스 타입으로 변환시키는 메소드

        toString() : 필드값을 문자열로 반환하는 메소드
        //래퍼클래스 안에서는 이렇게 쓰이는 것.
        그 외에는 주소값 반환하는 역할

         */
        String b = Byte.valueOf((byte)1).toString();
//        1이  바이트형을 ㅗ바뀌고 -> 래퍼열로 바뀌고 0238 ㅁㅇㄻㅇㄹ

        String s = Short.valueOf((short)2).toString();
        //자료형이 더 작은 자료형가려면 형변환. 래퍼클래스 밸류오브로 인해 인스턴스화.
        //스트링 -> 쇼트니까.

        String i = Integer.valueOf(4).toString();

        String l = Long.valueOf(8L).toString();
        //상위타입으로 형변환 하는건 괜찮으니까.

        String f = Float.valueOf(4.0f).toString();

        String d = Double.valueOf(8.0).toString();

        String bl = Boolean.valueOf(true).toString();

        String c = Character.valueOf('a').toString();

        //String 클래스의 valueOf를 사용할 수 있다
        String str = String.valueOf(10);

        String str2 = 123 + "";




    }
}
