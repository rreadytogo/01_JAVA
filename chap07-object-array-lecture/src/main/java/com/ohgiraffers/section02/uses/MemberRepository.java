package main.java.com.ohgiraffers.section02.uses;

import org.w3c.dom.ls.LSOutput;

public class MemberRepository {
    //db연결부 - 데이터 수행 (등록 같은것을)
    //데이터만 가지고 있음. 달라는 명령 오면 주고. 그런 역할
    //데이터 저장소같은 느낌이겠지?

    private final static Member[] members;

    private static int count;
    //1씩 증가시키면서 10보다 작게.
    //회원 들어올 때마다 1이 되는 것.

    static {
        members = new Member[10];
        //10명만 받을걸 설정ㅎ놓는걸.
        // 데이터베이스. 10명만 받을거라고 선언해놓은 것.
    }

    public static boolean store (Member[] newMembers) {
        //객체배열 받을것을 등록해준 것.
        //받은 후 어케 등록?
        for (int i = 0; i < newMembers.length; i++) {

            if (count != 10) {
                //<10해도 됨.
                // 순차적으로 실행되니까, 10되면 멈춤.
                members[count++] = newMembers[i];
                //newMem 선언안해도되나ㅠ
                //10이 되면 멈추는 것.
                //후위연산자 - 마지막값 -허용되는-
            } else {
                System.out.println("정원초과");
                return false;
            }


        }
        return true;
        //for문 밖에서.


    }


    public static Member[] findAllMembers() {
        return MemberRepository.findAllMembers();
    }
    }









