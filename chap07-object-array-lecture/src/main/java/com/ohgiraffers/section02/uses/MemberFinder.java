package main.java.com.ohgiraffers.section02.uses;

public class MemberFinder {

    //멤버를 조회하겠다는 명령을 repo에게 내리는 클래스
    //멤버레포 -> 데이터 뱉는.

    public Member[] findAllMembers(){
        return MemberRepository.findAllMembers();

    }
    //멤버배열로. 1132




}
