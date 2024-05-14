package method;

public class Application02 {
    
    public static void main(String[] args) {

        System.out.println("main() 메서드 시작");
        /*static있는 것에서  static 없는거 호출하려면
        class 자료형에 값을 넣어줘야 함.
         */
        Application02 app2 = new Application02();
        app2.methodA();
        app2.methodB();
        //app2 : 객체. 생성해놓으면 계속 쓸 수 있다




        System.out.println("main() 메서드 종료");
        
    }
    
    
    public void methodA(){
        System.out.println("methodA() 호출됨...");

        System.out.println("methodA() 종료됨...");
        
    }
    
    public void methodB(){
        System.out.println("methodB() 호출됨...");

        System.out.println("methodB() 종료됨...");
    }
    
}
