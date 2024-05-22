package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

public class Application02 {

    public static void main(String[] args) {
        /*
        equals()메소드 오버라이딩
        equals메소드는 매개변수로 전달 받은 인스턴스와 == 연산하여 true or false 반환한다
        즉 동일한 인스턴스 인지를 비교하는 기능

        동일객체와 동등객체
        동일객체 : 주소가 동일한 인스턴스 - 얕은복사.
        동등객체 : 주소는 달라도 필드값이 동일한 객체 - 내용물이 같으면 동등한 것으로 해야할 때가 있다.
         */

        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(1,"홍길동전","허균",50000);

        System.out.println("1.두 인스턴스의 == 연산 비교 : "+(book1 == book2));
        System.out.println("2.두 인스턴스의 equals() 비교 : " + (book1.equals(book2)));

        /*둘 다 false
        equals 오버라이딩 해주지않으면 똑같다. 1이나 2나. 주소값비교
        오버라이딩 후 false / true 로 바뀜.

         */



    }
}
