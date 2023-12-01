package by.homeWebApp.model;

import java.util.Date;

public class User {
    private String username;
    private String password;

    private  String firstName;
    private  String lastName;
    private  String middleName;
    private  String gender;
    private  Date birthday;
    private  String email;

    private  String address;
    private  int phoneNumb;

    public User(String username, String password, String firstName,
                String lastName, String middleName, String gender,
                Date birthday, String email, String address, int phoneNumb) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.phoneNumb = phoneNumb;
    }

    public User (String username, String password, String firstName,
                 String lastName, String gender,
                 Date birthday, int phoneNumb){
        this(username, password, firstName, lastName, "unspecified", gender, birthday, "unspecified", "unspecified", phoneNumb);
    }

    public User (String username, String password, String firstName,
                 String lastName, String gender,
                 Date birthday, String email, String address, int phoneNumb){
        this(username, password, firstName, lastName, "unspecified", gender, birthday, email, address, phoneNumb);
    }

    public User (String username, String password, String firstName,
                 String lastName, String middleName, String gender,
                 Date birthday,  String address, int phoneNumb){
        this(username,password,firstName,lastName, middleName, gender, birthday, "unspecified", address, phoneNumb);
    }

 /*   public User(String username, String password, String firstName,
                String lastName, String middleName, String gender,
                Date birthday, String email, int phoneNumb){
        this(username, password, firstName, lastName, middleName, gender, birthday, email, "unspecified", phoneNumb);
    } */




    /*public User(String firstName, String lastName, String middleName, String gender, Date birthday, String email, String address, int phoneNumb) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.phoneNumb = phoneNumb;
    }

    public User(String firstName, String lastName, String gender, Date birthday, int phoneNumb) {
        this(firstName, lastName, "unspecified", gender, birthday, "unspecified", "unspecified", phoneNumb);
    }

    public User(String firstName, String lastName, String middleName, String gender, Date birthday, String email, int phoneNumb) {
        this(firstName, lastName, middleName, gender, birthday, email, "unspecified", phoneNumb);
    }

    public User(String firstName, String lastName, String gender, Date birthday, String email, String address, int phoneNumb) {
        this(firstName, lastName, "unspecified", gender, birthday, email, address, phoneNumb);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(int phoneNumb) {
        this.phoneNumb = phoneNumb;
    }*/
}
