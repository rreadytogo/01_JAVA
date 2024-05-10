package main.java.com.ogiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        /*
        nextLine() : 공백을 포함한 한 줄 입력을 위한 개행문자 전까지 읽어서 문자열로 반환한다
            cf. 개행문자 : 줄넘김
            띄어쓰기까지 반환
        next() : 공백문자나 개행문자 전까지 읽어서 문자열로 반환한다
         */

        Scanner sc = new Scanner(System.in);
//        System.out.println("값을 입력해주세요 : "); // 안녕하세요 반갑습니다 입력 -> 안녕하세요 반갑습니다 출력
        String greeting = sc.nextLine();
//        System.out.println(greeting);

//        System.out.println("두번째 값을 입력해주세요 : "); //안녕하세요 반갑습니다 입력 -> 안녕하세요 출력
                                                        // (공백 인식해서 그 전까지 출력)
        String greeting2 = sc.next();
//        System.out.println(greeting2);











    }
}
