package main.java.com.ogiraffers.section01.method;
// #

public class Application04 {
    public static void main(String[] args) {

       /*
       여러 개의 전달인자를 이용한 메소드 호출 테스트

//메인메서드에서 테스트메서드 부르기 위해 app~4 작성!*/

        Application04 app4 = new Application04();
        app4.testMethod("홍길동", 20, '남');
//        app4.testMethod(20,"유관순", '남'); 안됨. 순서대로 입력해야함~
//        매개변수는 순서대로 입력해야 한다.

        // 변수에 저장된 값을 전달하여 호출할 수 있다.
        String name = "유관순";
        int age = 20;
        char gender = '여';
        app4.testMethod(name, age, gender);

    }

    /*** 하면 초록색으로 뙇!
     *  협업할 때 설명 전달하는 것 @param
     *
     *  이름과 나이와 성별을 전달 받아 한 번에 출력해주는 기능을 제공
     *
     * @param name 출력할 이름을 전달 해주세요
     * @param age 출력할 나이를 전달 해주세요
     * @param gender 출력할 성별을 전달 해주세요. 성별은 변경되지 않습니다
     *
     * ***/


//    메인메서드 밖에서 만든다.
//    final 붙은건 값을 바꿀 수 없다
    public void testMethod(String name, int age, final char gender) {
//   #. char  왜 쓰신거지? 그냥 string 써도 됐던거 아닌가?+


//        name = "홍길동";
//        age = 20;
//        gender = 's';

        System.out.println("당신의 이름은 " + name + " 이고, " + "나이는" + age + "세이며, 성별은 " + gender + "입니다.");


    }

}
