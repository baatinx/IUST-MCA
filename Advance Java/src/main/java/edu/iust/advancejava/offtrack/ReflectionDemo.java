package edu.iust.advancejava.offtrack;

public class ReflectionDemo {
    public String username;
    private String password;

    public ReflectionDemo(){ }

    public ReflectionDemo(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username){
        System.out.println("username has been set to " + username);
    }

    public void getUsername(){
        System.out.println("username :" + username);
    }

    //private method
    private void showMePassword(){
        System.out.println("private method invoked, Password is : " + password);
    }
}
