package main.java.com.ohgiraffers.question;

//회원가입 처리, 로그인처리
//라고 하니까.. 어디서 로그인 창을 구현해야하고 어디서 로그인을 하는건지... 모르겠음

import org.w3c.dom.ls.LSOutput;

public class LoginRepository {

    private final static UserDTO[] users = new UserDTO[10];

    private static int count;

    public boolean join(UserDTO)

    static {
        users = new UserDTO[10];
    }


    //가입정원
    public static boolean store(UserDTO[] newUsers) {
        for (int i = 0; i < newUsers.length; i++) {
            if (count < 10) {
                users[count++] = newUsers[i];

            } else {
                System.out.println("정원이 초과되었습니다.");
                return false;
            }
        }
        return true;
    }

//    //로그인하는 메서드 처리 -> 로그인service에서 했어야.
//    public static String Login() {
//        if (users == null) {
//            System.out.println("가입된 회원이 없습니다.");
//        }else{
//            System.out.println("로그인이 완료되었습니다.");
//        }
//
//    }



    //회원가입하는 메서드
    public static String signUp(){
        if (){

        }
    }

    /*로그인 구현*/








}



