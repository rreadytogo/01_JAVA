package main.java.com.ohgiraffers.understand.auth;

import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class KakaoAuth implements SnsAuth {

    MemberDTO memberDTO1 = new MemberDTO("kakao","kakao");

    @Override
    public boolean login(MemberDTO memberDTO) {
        if(memberDTO1.getId().equals(memberDTO.getId))
    }
}
