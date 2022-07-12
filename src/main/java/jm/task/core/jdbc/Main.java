package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Виталий", "Погодаев", (byte) 41);
        System.out.println("User с именем – \"Виталий\" добавлен в базу данных");
        userService.saveUser("Ангелина", "Погодаева(Курамина)", (byte) 24);
        System.out.println("User с именем – \"Ангелина\" добавлен в базу данных");
        userService.saveUser("Милана", "Погодаева", (byte) 1);
        System.out.println("User с именем – \"Милана\" добавлен в базу данных");
        userService.saveUser("Максим", "Погодаев", (byte) 9);
        System.out.println("User с именем – \"Максим\" добавлен в базу данных");
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
