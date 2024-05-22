package main.java.com.ohgiraffers.section01.list.comparator;


import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingNum implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
//        return 0;
        int result = 0;
        if(o1.getNum()<o2.getNum()){
            result = -1;
        } else if(o1.getNum()>o2.getNum()){
            result = 1;
        }else{
            result = 0;
        }
        return result;
    }
}
