package main.java.com.ogiraffers.section04.scanner;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /*
        java.util.Scanner
        콘솔 화면에 값을 입력 받는 기능을 제공한다.

         */
//        스캐너 역시 안에 있는 메서드 이용하기 위해 선언을 해줘야 함

        Scanner sc = new Scanner(System.in);
//        시스템 동작할 수 잇게 권한줘야하는데 입력을 받을 수 있는 권한을 스캐너에 부여

        System.out.println("이름을 입력해주세요 : ");

        String name = sc.nextLine();
//        프로그램 실행 후 입력한 후 입력값을 받아 다음 명령문 실행.

        System.out.println("안녕하세요 "+name+" 님!");

        System.out.println("나이를 입력하세요 : ");

        int age = sc.nextInt();
        //다음에 나올 인트값을 입력받아서, age라는 변수안에 넣어주겠다

        System.out.println("입력하신 나이는 " + age + " 세 입니다.");
        //자료형보다 큰 값을 입력하면 Error!

        System.out.println("원하는 금액을 입력해주세요 : ");
        long lnum = sc.nextLong();
        System.out.println("입력하신 금액 : $" + lnum + "입니다.");
        //정수만 넣을 수 있다.
        //nextLine은 다 받을 수 있다.

        System.out.println("원하는 실수를 입력하세요 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 "+number+" 입니다.");

        System.out.println("참과 거짓 중에 한 가지를 True 아니면 False로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println((isTrue)?"참":"거짓");
        //nextline 다음 자료형을 맞춰줘야 한다.

        sc.nextLine();

        System.out.println("아무 문자나 입력 해주세요 : ");
        char charValue = sc.nextLine().charAt(1);
        System.out.println(charValue);
                //CHARAT에는 숫자 넣어야 함. index 0 = 첫문자부터 시작하는거 말하는듯
     







    }
}
