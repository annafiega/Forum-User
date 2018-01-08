package com.kodilla;
class User{
    private String name;// atrybuty
    private String lastName;
    private String sex;
    private int age;
    private String email;

    public User (String name, String lastName, String sex, int age,String email){ //konstruktor
        this.name=name;
        this.lastName=lastName;
        this.sex=sex;
        this.age=age;
        this.email=email;
    }
    public void logIn(){//metody: logowanie, wylogowanie, usunięcie konta
        System.out.println("Log in");
    }
    public void logOut(){
        System.out.println("Log out");
    }
    public void cancalAccount(){
        System.out.println("Cancel my account");
    }
    public String getName() {//gettery dla atrybutów klasy
        return this.name;
    }

    public String getSex() {
        return this.sex;
    }
    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }
    public String getEmail(){
        return this.email;
    }
}
class ForumUser extends User{//klasa dziedzicząca
    private String userName;//atrybuty klasy
    private int numberOfPosts;
    private boolean isLoggedIn=true;
    public ForumUser(String userName, int numberOfPosts, boolean isLoggedIn, String name, String lastName, String sex, int age,String email){//konstruktor klasy dziedziczącej
        super(name, lastName, sex,age,email);
        this.userName=userName;
        this.numberOfPosts=numberOfPosts;
        this.isLoggedIn=isLoggedIn;
    }
    public String getUserName()//gettery dla atrybutów klasy dziedziczącej
    {
        return this.userName;
    }

    public int getNumberOfPosts()
    {
        return this.numberOfPosts;
    }
    public boolean getIsLoggedIn()
    {return this.isLoggedIn;
    }
    public void publishPost(){
    }
    public void commentPost(){
    }
    public void showInfoAboutUser(String name, String lastName, String sex, int age,
                                  String email){//metoda przedstawiająca użytkownika w konsoli
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(sex);
        System.out.println("Wiek: " + age);
        System.out.println(email);
        System.out.println("Nazwa uzytkownika: " + userName);
        System.out.println("Liczba postow: " + numberOfPosts);

        if(isLoggedIn == true)
        {
            System.out.println("Zalogowany: TAK");
        }

        else{
            System.out.println("Zalogowany: NIE");}
    }
}

class Application{
    public static void main(String[] args)
    {
        ForumUser anna = new ForumUser("anna-fiega", 0, false, "Anna", "Fiega","kobieta", 18,"annafiega@gmail.com");// nowy obiekt anna
        String name=anna.getName(); //wywołanie metody
        String lastName=anna.getLastName();
        String sex=anna.getSex();
        int age=anna.getAge();
        String email=anna.getEmail();
        anna.showInfoAboutUser("Imie: " + name, "Nazwisko: " + lastName, "Plec: " + sex,
                age,  "E-mail: " + email);
    }
}