package teste;

import connections.Imports;

public class Main {
    public static void main(String[] args) {
        Imports in = new Imports("src/'teste/teste.html");

        System.out.println(in.getFile());
    }
}