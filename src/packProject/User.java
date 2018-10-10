package packProject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class User {
    private String login;
    private String password;
    private int role;
    private String phoneNumber;
    private String email;
    public static void main(String[] args) {
      }

    public String getLogin() { return login; }
    public String getPassword() { return password; }
    public int getRole() { return role; }

    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(int role) {
        this.role = role;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        Pattern p=Pattern.compile("^(\\+375|80)[\\s-]?(29|44|33|25)[\\s-]?(\\d{7}|\\d{3}[\\s-]?\\d{2}[\\s-]?\\d{2})");
        Matcher matcher=p.matcher(phoneNumber);
       try{
           if(!matcher.matches())
               throw new IllegalArgumentException("!Недопустимое входное значение для номера телефона!");
           else
               System.out.println("Номер успешно добавлен");
       }catch (IllegalArgumentException e){
           e.getMessage();
       }
    }
    public void setEmail(String email)
    {
        Pattern p=Pattern.compile("(\\d|\\w)*@{1}(mail|gmail)\\.{1}(ru|com)$");
        Matcher matcher=p.matcher(email);
        try{
            if(!matcher.matches()) {
                throw new IllegalArgumentException("!Недопустимое входное значение для email!");
            }
            else
                System.out.println("email успешно добавлен");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
