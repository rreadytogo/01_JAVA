package main.java.com.ohgiraffers.section02.uses;

import org.w3c.dom.ls.LSOutput;

public class MemberService {

    // application의 명령을 실행할 곳

    //유저 등록, 유저 보여줄것

    public void signUpMembers() {
//        메서드명이 불이 들어오면 잘 들어온 것
        Member[] members = new Member[5];

        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "유관순", 16, '여');
        members[2] = new Member(3, "user03", "pass03", "이순신", 40, '남');
        members[3] = new Member(4, "user04", "pass04", "신사임당", 36, '여');
        members[4] = new Member(5, "user05", "pass05", "이화림", 20, '여');

        MemberRegister memberRegister = new MemberRegister();
        //멤버레지스토리에게 등록하라는 명령을 내려줄 객체

        memberRegister.regist(members);


    }

    public void showAllMembers() {
        //단순히 데이터만 반환. 멤버레지스터에 등록하라는 명령 내려줄 것.
        //클래스마다 단일책임 데이터 반환 했으면 등록하고 등록하고 반환하는 것.
        //그 명령을 내려줄 클래스를 서비스- db사이에 출력.

        MemberFinder finder = new MemberFinder();

        System.out.println("-----가입된 회원 목록------");

        for (Member member : finder.findAllMembers()) {
            System.out.println(member.getInfo());
        }
        System.out.println("------회원 조회 완료-----");
    }


}

