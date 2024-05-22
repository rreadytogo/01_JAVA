package main.java.com.ohgiraffers.section01.list.run;

import main.java.com.ohgiraffers.section01.list.comparator.AscendingPrice;
import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {

    public static void main(String[] args) {
        //여러가지 책 관리할 어레이 리스트

        List<BookDTO> bookList = new ArrayList<>();
        //북디티오를 담을 리스트 만들어줄 것.

        bookList.add(new BookDTO(1,"홍길동전","허균",50000));
        bookList.add(new BookDTO(2,"목민심서","정약용",30000));
        bookList.add(new BookDTO(3,"동의보감","허준",40000));
        bookList.add(new BookDTO(4,"삼국사기","김부식",45000));
        bookList.add(new BookDTO(5,"삼국유사","일연",58000));

//        Collections.sort(bookList);


        //책을 북리스트에 추가하게 되면
        for(BookDTO bookDTO:bookList){
            System.out.println(bookDTO);
        }
        System.out.println();
        System.out.println("==========가격 오름차순 정렬 ==========");
        bookList.sort(new AscendingPrice());
        //SORT에 이 만든 인자를 넣어줄 것.

        //SORT한걸 FOREACH로.

        for(BookDTO bookDTO:bookList){
            System.out.println(bookDTO);
        }

        // => int 형은 comparator로 직접할 수 없다.
        // 따로 클래스를 파서 해줘야함!

        System.out.println("========== 제목 오름차순 정렬 ==========");
        bookList.sort(new Comparator<BookDTO>() {
                          @Override
                          public int compare(BookDTO o1, BookDTO o2) {
                              return o1.getTitle().compareTo(o2.getTitle()) ;
                              // 내림차순 : * -1
                          }
                      }

        );
        for (BookDTO bookDTO:bookList){
            System.out.println(bookDTO);
        }

        System.out.println("========== 작가 오름차순 정렬 ==========");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        for (BookDTO bookDTO:bookList){
            System.out.println(bookDTO);
        }

        System.out.println("========== 작가 내림차순 정렬 ==========");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getAuthor().compareTo(o2.getAuthor()) * -1;
            }
        });
        for (BookDTO bookDTO:bookList){
            System.out.println(bookDTO);
        }

        System.out.println();

//        System.out.println("=======넘버 오름차순 정렬=======");
//        bookList.sort(new Comparator<BookDTO>() {
//            @Override
//            public int compare(BookDTO o1, BookDTO o2) {
//                return o1.getNum().compareTo(o2.getNum()) * -1;
//            }
//        });
//        for (BookDTO bookDTO:bookList){
//            System.out.println(bookDTO);
//        }


    }
}






    }
}
