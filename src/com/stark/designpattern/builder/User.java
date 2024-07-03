package com.stark.designpattern.builder;

public class User {

    private final String name;
    private final String email;
    private final String designation;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.designation = builder.designation;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDesignation() {
        return designation;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public static class UserBuilder {

        private String name;
        private String email;
        private String designation;

        public UserBuilder() {

        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }


        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
