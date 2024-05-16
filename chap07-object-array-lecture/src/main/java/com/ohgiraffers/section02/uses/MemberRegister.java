package main.java.com.ohgiraffers.section02.uses;

public class MemberRegister {

    public void regist(Member[] members){
        System.out.println("회원을 등록합니다");
        //어떤 회원을 등록할지에 대한 안내문 넣어줄 것
        for(Member member :members){
            System.out.println(member.getInfo()+"님을 회원 등록 시도합니다.");
            //10먕 가입제한. 올려놓고 레포지터리 생성


        }

//        ???한 과정 11:09

                if(MemberRepository.store(members)){

//                    boolean형. 정상 실행 -> if문 실행 11:10

                    System.out.println("총 "+members.length+ " 명의 회원 등록에 성공했습니다.");

                }else{
                    System.out.println("인원이 마감되어 등록에 실패했습니다.");
                }

    }
    //매개변수로 객체를 넘겨줬음
    // 회원등록을 repo에  등록하라는 명령하는 클래스

    //레포:레포지터리
}
