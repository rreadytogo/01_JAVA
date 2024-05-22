package main.java.com.ohgiraffers.understand.service;

import main.java.com.ohgiraffers.understand.auth.GoogleAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

import java.util.NavigableMap;

public class MemberService {


    public void findMember(String authType, MemberDTO memberDTO) {

        switch (authType) {
            case "google":
                GoogleAuth googleAuth = new GoogleAuth();
                boolean result = googleAuth.login(memberDTO);
                if (result) {
                    System.out.println("구글 아이디로 인증 된" +
                            memberDTO.getId() + "님 환영합니다.");
                } else {
                    System.out.println("구글에 인증된 회원이 없습니다.");
                }
                break;

                case "naver";
                NaverAuth naverAuth = new NaverAuth();

        }
    }

}
