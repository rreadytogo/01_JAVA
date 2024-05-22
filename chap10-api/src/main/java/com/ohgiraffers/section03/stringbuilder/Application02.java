package main.java.com.ohgiraffers.section03.stringbuilder;

public class Application02 {

    public static void main(String[] args) {

        StringBuilder sb1  = new StringBuilder();
        //capacity() : 용량(현재 버퍼의 크기)를 정수형으로 반환하는 메소드
        //(문자열길이 + 16을 기본 용량으로 가지고 있다.)

        System.out.println(sb1.capacity());
        //ㄱ기본생성자로 만들어 길이가 없어서, 기본용량인 16 ㅜ출력

        /*
        append() : 인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가.
        기본 용량을 초과하는 경우 (기존 문자열 + 1) * 2를 하여 용량 확장함

         */

        for (int i = 0; i < 50; i++) {
            sb1.append(i);
            //여러가지 자료형을 스트링으로 변환할 수 있다

            System.out.println("sb1 = " + sb1);
            System.out.println("sb1.capacity() = " + sb1.capacity());
            System.out.println("sb1.hashCode = "+sb1.hashCode());
            //용량만 늘리고, 기존 주소값이 변하지 않는다는 것을 확인할 수 있다.
        }

        //새로운 인스턴스 생성
        StringBuilder sb2  = new StringBuilder("javaoracle");

        /*
        delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
        deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.

        둘 다 원본에 영향을 미친다.
        실제 객체 안에서 지워짐.
         */

        System.out.println("delete() : " + sb2.delete(2,5));
        System.out.println("deleteCharAt(0) : "+sb2.deleteCharAt(0));
        System.out.println(sb2);
        //원본이 지워진걸 확인할 수 있다

        /*
        insert() : 인자로 전달된 값을 문자열로 변환 후 저장된 인덱스 위치에 추가한다.
        원본에 영향을 미친다.

         */

        System.out.println("insert() : " + sb2.insert(1,"vao"));
        System.out.println("insert() : " + sb2.insert(0,'j'));
        System.out.println("insert() : " + sb2.insert(sb2.length(),"jabc"));
        System.out.println("Sb2 = " + sb2);

        /*
        reverse() : 문자열 인덱스 순번을 역순으로 재배열.
        원본에 영향을 미침
         */
        System.out.println("reverse() : " + sb2.reverse());
        System.out.println("sb2 = "+sb2);


        /*

        String 클래스와 동일한 메소드도 있다.
        charAt(), indexOf() / lastIndexOf(), length(0, replace(), subString(), toString()

         */










    }
}
