package main.java.com.ohgiraffers.section02.encapsulation.problem4;
//임포트 여부 잘 보기( 같은 클래스면 뜨지 X)
public class Application01 {
    public static void main(String[] args) {

//접근제어자(public, private)

        Monster monster1 = new Monster();
//        monster1.kinds = "프랑켄슈타인";
//        monster1.hp = 200;
        // private 필드라 참조 X

        /*
        선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
        public으로 접근을 허용한 메소드만 이용할 수 있도록 해놓은 것이다.
        이것을 캡슐화(encapsulation)라고 부른다.
        유지보수성이 좋다.

        캡슐화 : 개발자가 의도한 값만 받기 위해 설정하는 것.
         */

        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());



    }
}
