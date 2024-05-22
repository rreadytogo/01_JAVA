package main.java.com.ohgiraffers.section01.object.book;

public class Book {

    private int number;
    //책번호

    private String title;
    //책제목

    private String author;

    private int price;

    public Book() {
        super();
        //이 슈퍼는 오브젝트를 가르키는 것.
    }

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
        //book 클래스의 인스턴스를 생성할 때 사용.
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //모든 클래스에 다 넣을 수 있다. object 해놓으면
        if(this == obj){
            return true;
        }
        Book other = (Book) obj;
        //오브형 자체를 자료형으로 사용하면 book을 사용할 수 없다
        //부모자료형일 땐 자료형이 book 못 씀. book 쓰기위해 형변환

        if(this.number != other.number){
            return false;
        }
        //other 빨간불 =>
        // Book other = (Book) obj; 이 부분이 틀림. Book book으로 써버림.

        if(this.title == null){
            if(other.title!=null){
                return false;
                //다른 객체라는 뜻
            }
        } else if (!this.title.equals(other.title)){
            return false;
        }

        if(this.author == null){
            if (other.author != null){
                return false;
            }
        } else if (this.author.equals(other.author)) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
       int result = 1;
       //변수들 곱해서 해쉬코드 할거니까 1로 맞춤

        final int PRIME = 31;
        //필드마다 곱해줄 31. 31인 이유가 제일 중복값이 덜 나와서.

        result = (PRIME * result) + this.number;
        //스트링은 ㅎ쉬코드가 재정의되어있다.

        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;
    }
}
