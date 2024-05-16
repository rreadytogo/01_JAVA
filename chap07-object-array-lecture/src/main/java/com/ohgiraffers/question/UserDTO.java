package main.java.com.ohgiraffers.question;

public class UserDTO {

    private String id;

    private String name;

    private String pwd;

    private String pwdcheck;

//    public User() {
    //문제 있는데 무슨 문제인진 모르겠음.
//        //기본 생성자 만들어 봄!
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwdcheck() {
        return pwdcheck;
    }

    public void setPwdcheck(String pwdcheck) {
        this.pwdcheck = pwdcheck;
    }

    public String getInfo(){
        return "User{ id : "+ id + ", name : " + name + ", pwd = " + pwd + ", pwdcheck : " + pwdcheck + "}";
    }
}



