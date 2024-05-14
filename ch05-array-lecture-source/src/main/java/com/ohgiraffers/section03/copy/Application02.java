package main.java.com.ohgiraffers.section03.copy;
//# 다시듣기
import org.w3c.dom.ls.LSOutput;

public class Application02 {
    public static void main(String[] args) {

        //얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다.

//        다른메서드를 만들어서 매개변수와 리턴값으로 활용해볼 것.
        //매개변수와 리턴값으로 활용하는 건 
//        메서드 호출시 사용하던 배열이랑 동일한 배열을 리턴받고 싶을 떄.

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("1.name의 hashCode : " + names.hashCode());
        haschCodePrint(names);
        //^이게 있어야 2.가 출력이 되네..
        // 매개변수로 스트링배열을 넘겨달라고 하니까, 만들어놨던 names를 넘겨주는 과정



        String[] animals = getAnimals();
        //스트링 배열이 생성되어서 리턴되서 animals 담김.
        //get에서 값을 받아 리턴받은 것.
        System.out.println("animals의  hasCode ; " + animals.hashCode());
        haschCodePrint(animals);












    }

    //인자로 넘겨주는거랑, 매개변수로 받는거랑 같은 주소값을 가지는지 확인해보는 과정
    public static void haschCodePrint(String[] names){
        //여기는 String 배열을 매개변수로 받을 것.
        //매개변수로 넘겨받는 names의 haschcode 출력

        System.out.println("2.names의 hashCode : " + names.hashCode());
        //static 있으면 같은 클래스내 -> 이름으로 바로 쓸 수 있다.
        //void는 리턴없으면 안됨. 반환타입. 반환하지 않겠다.
    }
    
    public static String[] getAnimals(){
        //리턴이 없어서 스코프 바깥에 에러가 생기는 것
        String [] animals = {"낙타","호랑이","돼지"};

        System.out.println("애니멀의 해시코드 : " + animals.hashCode());
        
        return animals;
        //반환타입이 스트링타입이니까, 스트링 배열을 넘겨주는 것.
    }
    
    //10:12 스트링 배열 ? 뭐?  흐름 안되면 메서드 파트 복습
    // 10 : 15

}
