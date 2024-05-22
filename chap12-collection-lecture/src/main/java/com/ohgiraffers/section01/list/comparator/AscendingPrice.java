package main.java.com.ohgiraffers.section01.list.comparator;

import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    //정렬기준을 강제하기 위해 만든 클래스.
    //북디티오 정렬할거기 땜에 그걸 넣어줌.

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result = 0;

        if(o1.getPrice() > o2.getPrice()){
            result = 1;
            //양수 담아주기
        } else if(o1.getPrice() < o2.getPrice()){
            result = -1;
//            이미 오름차순되어있으니 바꿀 필요없다
        } else {
            result =0;
            // 작동 원리 : 순서바꿀 때만 양수를 보내준다.

            //내림 차순 : 1, -1 바꿔주면.
        }
        return result;
    }

    /*
    o1 o2
     */
}
