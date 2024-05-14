package method;

import java.sql.SQLOutput;

public class Application01 {
    public static void main(String[] args) {

        /*
         메소드 : 특정 작업을 수행하기 위한 명령문의 집합


         */

        System.out.println("메인메서드 시작");



        Application01 app = new Application01();
        app.methodA();
//        methodA()

        System.out.println("메인메서드 종료");



/*                (클래스명. 클래스는 하나의 자료형)
            char, int 이런 것들.
            자료형의 경우, 초기화를 해줘야 사용할 수 있음.
            이 클래스 안에 new 연산자를 이용해서 값을 넣어줘서 초기화해야
            사용 가능.
            class안에 뭘 넣을지 모름. 값을 넣을지 정수를 넣을지.
            -> new 이용해서 클래스 자체를 복사
            class라는 자료형을 가진 app을 사용할 수 있게 됨.


            클래스 안에 메인 메서드 내에서 다른 메서드 사용하려면,
            클래스를 자료형 값에 넣어줘야 이 안에서 메서드 호출 및 사용가능.



          */






    }

    //methodA()랑 B 둘 다 static 없음. ->
    public void methodA() {

/*       void: 접근 제어자. (접근 허용범위를 말해주는 것) 반환타입. 아무것도 반환하지 않겠다
여기에는 다양한 자료값이 들어갈 수 있는데, 항상 그 자료형에 맞는 값을 리턴해줘야 함

         public : 프로젝트 내에서 다 접근할 수 있도록 허용해주는 것


 */

        System.out.println("methodA() 호출");
        //methodA()랑 B 둘 다 static 없음. ->
        methodB();
        //static 없는 메소들끼리 호출하려면 이름으로 호출할 수 있음.
        System.out.println("methodA() 종료");

        //자바 프로그램 안에서 메인 메서드 안에서 실행되고 끝나기 때문에
        //메서드a 호출 / 종료 메세지 X
    }

    public void methodB() {

        System.out.println("methodB() 호출");

        System.out.println("methodB() 종료");
    }


}
