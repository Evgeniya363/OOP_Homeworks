package org.example.Company.Model;

public abstract class User {
    protected Integer id;
    protected String password;
    protected String firstName;
    protected String secondName;
    protected Integer age;

    static Integer count;
    static {
        count = 10000;
    }

    public User(String password, String firstName, String secondName, Integer age) {
        id = ++count;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object obj) {
        return id == ((Employee) obj).id;
    }
}
