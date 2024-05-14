package main.java.com.ohgiraffers.section01.user_type;

public class Application01 {

    public static void main(String[] args) {


        //클래스가 무엇인지 이해하고 작성할 수 있다.

        /*
        회원 데이터 관리 (아이디.비번.이름.나이.성별.취미)
           */

//        1. 변수를 이용한 데이터 관리
        String id = "user01";
        String pwd = "pass01";
        String name = "손흥민";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구","볼링","테니스"};

        //변수명 타입 다 다르기 때문에 뭐 반복문 같은걸 쓸 수 없다.

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        for (int i = 0; i < hobby.length ; i++) {
//            for( int j = 0; j<hobby.length; j++) 돌아가게 하는거 뭐였지?
            System.out.println(hobby[i]+ " ");
        }
        System.out.println();

        /*
        이렇게 각각의 변수로 관리하게 되면 여러가지 단점이 있다
        1. 변수명을 다 관리해야 한다
        1명만해도 6개
        2. 모든 회원정보를 인자로 메소드 호출 시 전달하면 너무 많은 값을 인자로 전달 -> 한 눈에 들어오지 X
        3. 리턴은 1개의 값만 가능 -> 회원정보를 묶어서 리턴값으로 사용X (서로 다른 자료형이기 때문에)
         */

        /* class를 이용한 객체 생성
        자료형 변수명 = new 클래스명 (); <- 지금까지 사용한 이 구문은 객체(instance)를 생성하는 구문
        사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap에 할당해야 함
        객체를 생성하게 되면 클래스에 정의한 필드와 메소드대로 객체가 된다
        아이디, 비번, 이름, 나이, 성별, 취미를 연속된 메모리 주소에서 사용하도록 heap에 공간을 만들었다.


         */

        Member gildong = new Member();
        //뉴 길동 -> 힙 영역에 이름. 나이. 등등 받는 공간을 만든 것

        /*
        필드에 접근하기 위해서는 레퍼런스 변수명(gildong). 필드명으로 접근한다.
        길동.id  이건 객체(인스턴스)x
        "."은 참조 연산자라고 하는데, 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미를 가진다
        각 공간은 필드명으로 접근한다.(배열은 인덱스로 접근, 객체는 필드명으로 접근한다
         */

        // 각 필드에 접근해서 변수 사용하듯 사용하기
        gildong.id = "user01";
        //값을 넣어주는 과정
        gildong.pwd = "pass01";
        gildong.name = "홍길동";
        gildong.age = 20;
        gildong.gender = '남';
        gildong.hobby = new String[] {"축구","볼링","테니스"};

        System.out.println("gildong.id = " + gildong.id);
        System.out.println("gildong.pwd = " + gildong.pwd);
        System.out.println("gildong.name = " + gildong.name);
        System.out.println("gildong.age = " + gildong.age);
        System.out.println("gildong.gender = " + gildong.gender);
        System.out.println("gildong.hobby = ");
        for(int i = 0; i < gildong.hobby.length; i++) {
            System.out.println(gildong.hobby[i] + " ");
        }
        System.out.println();

        //변수명 관리할 필요 없음. member의 이름만 구별해주면 각각 관리 가능.

        //면접
        // 객체지향 프로그래밍 4대 특성 - 추상화, 상속, 다형성, 캡슐화















    }

}
