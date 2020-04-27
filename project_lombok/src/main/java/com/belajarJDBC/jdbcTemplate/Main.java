package com.belajarJDBC.jdbcTemplate;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Sammi Aldhi Yanto")
                .gender("male")
                .age(17)
                .builder();
        System.out.println(person);
    }
}
