package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    String kinds;

    int hp;

    public void setInfo(String info){
        this.kinds = info;
    }

    public void setHp(int hp){
        if(hp>0){
            System.out.println("정상적으로 체력이 입력되었습니다")
            ;
            this.hp = 1;

        }
    }

    //출력하는 메서드 생성
    public String getInfo(){
        return "몬스터의 종류는" + kinds + "이고, 체력은 " + hp + "입니다";
    }
}
