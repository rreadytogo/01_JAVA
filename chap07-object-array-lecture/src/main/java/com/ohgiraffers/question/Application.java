package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /* 사용자 로그인 및 회원가입 시스템을 스캐너를 이용해 객체지향적으로 구현해보자.
         *
         * 회원가입은 10명까지만 가능
         * 가입한 회원이 없는 상태에서 로그인 시도 : 가입한 회원이 없습니다 출력
         * 정상적으로 가입 후 로그인 시 로그인 완료 출력된 후 프로그램 출력
         * 아이디, 이름, 비밀번호, 비밀번호 확인을 물어본 후 비밀번호와 비밀번호 확인이 같을 시 가입 진행
         *
         * Application
         * 스캐너로 로그인, 회원가입, 프로그램 종료 구현
         *
         * LoginService
         * 회가입처리, 로그인 메소드 연결
         *
         * LoginRepository
         * 회원가입 처리, 로그인 처리
         *
         * UserDTO
         * 회원의 id,pwd,name을 받을 DTO
         *  */

        Scanner sc = new Scanner(System.in);
        LoginService lservice = new LoginService();


        while (true) {
            System.out.println("======로그인 및 회원가입 프로그램=======");

            System.out.println("1. 회원가입 2. 로그인 9.프로그램 종료 ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    lservice.login();
                    break;

                case 2:
                    lservice.sinnUp();
                    break;
                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }


        }
    }
}
