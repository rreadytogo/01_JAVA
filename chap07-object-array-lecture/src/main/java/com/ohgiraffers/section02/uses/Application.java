package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application { //프로그램 실행부
    //메서드별로 나눠줄.

    public static void main(String[] args) {
        //회원정보받아서 회원정보 등록하는 프로그램

        /*
        * 시스템 요구사항
        * 1. 여러명의 회원정보를 받아 한 번에 회원정보를 등록
        * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
        *
        * 1번 -> 회원등록
        * 2번 -> 회원 전체조회

        * 9번 -> 프로그램 종료
        *   9번 만날 때까지 무한 루핑 돌릴 것임.
        * 그 외의 값 -> "잘못된 번호를 입력했습니다"
        *
        * 회원정보는 10명까지 저장할 수 있다. - 제한을 둔다는 것. -
        *
        * */

         Scanner scr = new Scanner(System.in);
         MemberService memberService = new MemberService();
         //기본생성자가 자동으로 추가되기 때문. 근데 멤버 서비스 이거 왜 추가? 10:38

        while(true){
            //반복문 돌릴 것.  무한 반복 돌리려면 true

            System.out.println("=====회원 관리 프로그램======");
            System.out.println("1.회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("번호 선택 : ");
            int no = scr.nextInt();

            switch (no) {
                case 1 : memberService.signUpMembers(); break;
                case 2 : memberService.showAllMembers(); break;
                //빨간불 : 안만들었기 때문.
                case 9 :
                    System.out.println("프로그램 종료"); return;
                    //while 이름 붙여서 종료, switch문 밖에서 종료, return으로 종료 3가지 배움!
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");

            }

        }






    }
}
