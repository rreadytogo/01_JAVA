package main.java.com.ohgiraffers.question;


import java.util.Scanner;

public class LoginService {


//    application 명령 실행할 곳.;
// 스캐너로 로그인, 회원가입, 프로그램 종료 구현.


//
//    public void regist(UserDTO[] users) {
//
////        if(User[] users = null){
////            System.out.println("가입된 회원이 없습니다.");
////        } else{
////        }
//
////        User user = new User(); <- 이걸 왜 한건지 모르겠지만..
//
//
//        Scanner scr = new Scanner(System.in);

    /*1. 로그인 구현*/
//        public static String Login() {
//            if (users == null) {
//                System.out.println("가입된 회원이 없습니다.");
//            }else{
//                System.out.println("로그인이 완료되었습니다.");
//            }
//
//        } -> 가입한 회원이 없는 상태에서 로그인을 시도하면 "가입한 회원 x" 출력하려고 만든 것.

    Scanner sc = new Scanner(System.in);
    LoginRepository lrepo = new LoginRepository();

    public void login() {
        System.out.println("=====로그인 창=====");
        System.out.println("아이디를 입력해주세요");
       String id = sc.nextLine();
        System.out.println("비번을 입력해주세요");
        String pwd = sc.nextLine();

        UserDTO userDTO = new UserDTO(id, pwd);
        int isTrue = loginRepository.login();
        //ㄴㅇㄻㄹㅇㅁㄴㄻㅇㄴㄹisTrue를 왜 int로 받지?ㅠㅠ
        if(IsTrue==0)


    }


    public void Signup() {

        System.out.println("아이디를 입력하세요.");
        String id = scr.nextLine();
        System.out.println("이름을 입력하세요");
        String name = scr.nextLine();
        System.out.println("비밀번호를 입력하세요.");
        String pwd = scr.nextLine();
        System.out.println("비밀번호를 한 번 더 입력하세요.");
        String pwdcheck = scr.nextLine();

        UserDTO userdto = new userDTO(a, b);
        int isTrue = loginRepository
    }
}
}


//println("회원을 등록합니다.");
//        for(
//User user :users){
//        System.out.
//
//println(user.getInfo()+"님을 회원으로 등록합니다.");
//        }
//        }
//
//
//public void signIn() {
//    if () {
//
//    }
//}
//        }