package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {
    /*        캡슐화 : 우리가 만든 필드에 직접 접근할 수 () -> 없게ㄱ
자신의 데이터를 지키기 위해 일부 명령만을 열어주는 것.

필더에 직접접근으로 생기는 문제점을 알아보자. */

    //필드에 올바르지 않은 값이 들어가도 통제가 불가능하다
    public static void main(String[] args) {


        String name;
        int hp;

//    몬스터별 이름 체력을 받아서 각각 몬스터 객체 만들것

        //1번 몬스터 생성
        Monster monster1 = new Monster();
        //이름과 체력 변경
        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1 = " + monster1.name);
        System.out.println("monster1 = " + monster1.hp);

        //2번 몬스터 생성
        Monster monster2 = new Monster();
        //이름과 체력 변경
        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("monster2 = " + monster2.name);
        System.out.println("monster2 = " + monster2.hp);

        // 3번 몬스터 생성
        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(200);
        System.out.println("monster3 = " + monster3.name);
        System.out.println("monster3 = " + monster3.hp);



        //4번 몬스터 생성
        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(-1000);

        System.out.println("monster4 = "+monster4.name);
        System.out.println("monster4.hp = "+monster4.hp);

        // 유효하지 않은 값이 들어와도 제어하지 못했기 땓문에 sethp 만든 것






    }



}
