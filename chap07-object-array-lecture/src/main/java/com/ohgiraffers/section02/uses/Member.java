package main.java.com.ohgiraffers.section02.uses;

public class Member {//멤버의 정보를 담을 클래스 (DTO클래스)

    private int num;

    private String id;

    private String pwd;

    private String name;

    private int age;

    private char gender;

    public Member() {
        //generate -> constructor :  아무것도 선택하지 않은 기본 생성자.
    }

    public Member(int num, String id, String pwd, String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInfo() {
        return " Member{ num : " + num + ", id = " + id + ", pwd = " + pwd +
                ", name = " + name + ", age = " + age + ", gender = " + gender + "}";

        //getinfo 출력하면 필드들의 내용을 다 보여줄 수 있는 메서드를 만든 것.
    }
}
