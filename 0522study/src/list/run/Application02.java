package list.run;

import list.dto.BookDTO;

import java.awt.print.Book;
import java.nio.channels.AsynchronousChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {

    public static void main(String[] args) {

        //여러가지 책 관리할 어레이 리스트

        List<BookDTO> bookList = new ArrayList<>();
        //리스트에 북디티오를 제네릭으로 넣는 과정.
        // 뉴 어레이리스트 해서 북 디티오를 담을 리스트를 만들 것.


        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "홍길동전", "정약용", 300000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 45000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

//        Collections.sort(bookList);
//        전에는 비교값 명확했는데 여기는 필드만 4개.
        //어떤식으로 어떻게 정렬하라고 하는지 알 수 없다.
        //그냥 sort에 넣게되면 오류가 난다

        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }
        //넣은 그대로 하나씩 담겨서 나올 것.

        //Comparator라는 인터페이스가 있는데 그걸 재정의해서 sort를 바꿔줄 수 있다.
        //컴페어레이터를 인터페이스, 구현체에 상속받은 다음, 해당되는 메소드를 조절하면 sort의 기준이 바뀜.
        //그걸 같이 해보면서 여러가지로 정렬을 해볼 것.
        //-> Comparator 패키지 생성, 클래스 AscendingPrice 파주기

        System.out.println("===========가격 오름차순 정렬===========");
        bookList.sort(new Comparator<BookDTO>() {

            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        for(BookDTO bookDTO:bookList){
            System.out.println(bookDTO);
        }

        System.out.println("======= 작가 내림차순 정렬 =========");
        bookList.sort(new Comparator<BookDTO>() {
                          @Override
                          public int compare(BookDTO o1, BookDTO o2) {
                              return o1.getAuthor().compareTo(o2.getAuthor());
                          }
                      }


        );
        for (BookDTO bookDTO : bookList){
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

        System.out.println("-----작가 오름차순 정렬------");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                 return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        for(BookDTO bookDTO : bookList){
            System.out.println(bookDTO);
        }


    }
}
