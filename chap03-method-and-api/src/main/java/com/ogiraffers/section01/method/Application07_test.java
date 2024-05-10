package main.java.com.ogiraffers.section01.method;
/*
- 반환받아서 메인 메소드에 sout 이용해 출력 해야한다에서 >>반환받아<< 조건  쓰지 않았음.
- public void말고, public int method (int a, int b){}
method()에서 ()안에 int a, int b 인자 설정해줬어야 함
- 반환받으라고 했으니 public int 로 쓰기!
void는 return이 내재되어있어 생략 가능함

- public int로 쓰면 반환값에 숫자밖에 못 씀
문자열과 같이 리턴하고 싶으면 public String을 쓰면 됨.
int보다 string이 더 크다

*/


public class Application07_test {

    public static void main(String[] args) {

        Application07_test app7 = new Application07_test();
        int a = 10;
        int b = 2;
        System.out.println(app7.methodadd(a,b));
        System.out.println(app7.methodminus(a,b));
        System.out.println(app7.methodmultiply(a,b));
        System.out.println(app7.methoddivide(a,b));
//        app7.methoddivide(a,b);



        /*
        실습
        두 수를 매개변수로 받아 더한 값을 반환하는 메소드
        두 수를 매개변수로 받아 뺀 값을 반환하는 메소드
        두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
        두 수를 매개변수로 받아 나눈 값을 반환하는 메소드

        반환 받아서 메인 메소드에 sout 을 이용해 출력해보자
         */
    }

    public String methodadd(int a, int b){
//        int adder = a+b;
        return "더한 값은 : " + (a+b);
//        System.out.println("더한 값 반환 : " + adder);
    }

    public String methodminus(int a, int b){
//        int minus = a-b;
//        System.out.println("뺀 값을 반환 : " + minus);
        return "뺀 값은 : " + (a-b);
    }

    public String methodmultiply(int a,int b){
//        int mul = a*b;
//        System.out.println("뺀 값을 반환 : " + mul);
        return "곱한 값은 : " + a*b;
    }

    public String methoddivide(int a,int b){
//        int div = a/b;
//        System.out.println("뺀 값을 반환 : " + div);
        return "나눈 값은 : " + a/b;
    }






}
