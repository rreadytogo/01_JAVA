package main.java.com.ohgiraffers.section02.variable;

public class Question {
    public static void main(String[] args) {

        // 김경리가 사원 10명의 월급을 입금하는 날이다.
        // 사원의 직책은 대리 과장 차장 부장
        // 대리는 100만원, 과장은 120, 차장은 130, 부장은 150만원의 월급을 받는다
        // 보너스는 각 월급 *0.5 만큼을 더해서 주어야 한다
        // 화면에 출력되는 형태는 다음과 같아야 한다
        // 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금되었습니다.

        int money = 100;
        double bonus = money*0.5;
        int money2 = 120;
        double bonus2 = money2*0.5;
        int money3 = 130;
        double bonus3 = money3*0.5;
        int money4 = 150;
        double bonus4 = money4*0.5;



        System.out.println("김대리의 월급은 " + money + "만원 +  보너스 " + bonus + "만원으로 총" + (money+bonus) +
                "만원 입금되었습니다.");
        System.out.println("김과장의 월급은 " + money2 + "만원 +  보너스 " + bonus2 + "만원으로 총" + (money2+bonus2) +
                "만원 입금되었습니다.");
        System.out.println("김차장의 월급은 " + money3 + "만원 +  보너스 " + bonus3 + "만원으로 총" + (money3+bonus3) +
                "만원 입금되었습니다.");
        System.out.println("김부장의 월급은 " + money4 + "만원 +  보너스 " + bonus4 + "만원으로 총" + (money4+bonus4) +
                "만원 입금되었습니다.");









    }
}
