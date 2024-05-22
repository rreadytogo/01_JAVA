package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

public class Application01 {

    public static void main(String[] args) {

        /*
        모든 클래스는 Object 클래스의 후손이다
        따라서 오브젝트 클래스가 가진 메소드를 자신이 가진 것처럼 사용할 수 있다
        또한 부모 클래스가 가지는 메소드를 오버라이딩해서 사용하는 것도 가능

        오브젝트 클래스의 메소드 중 관례상 많이 오 해서 사용하는 메서드들이 있다
        toString(), equals(), hashCode()이다
         */

        Book book1 = new Book(1,"홍길동전","허균",50000);
        //임포트 : 컨트롤 + 스페이스
        Book book2 = new Book(1,"목민심서","정약용",30000);
        Book book3 = new Book(1,"목민심서","정약용",30000);


        //오버라이딩 없으면 book1 = main.java.com.ohgiraffers.section01.object.book.Book@9f7fadae(클래스이름@해쉬코드) 출력됨.
        //투스트링의 클래스이름@해쉬코드를 문자열로 바꿔주는게  오버라이드인거지?
        // -> yes. 주소값 출력됐는데 북에서 투스트링 -> number = , title, author =, price =  출력됨.
        System.out.println("book1 = " + book1.toString());
//        투스트링을 메서드에 넣으면 흐려진다 =-> 있는것.
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);
        //


    }
}
