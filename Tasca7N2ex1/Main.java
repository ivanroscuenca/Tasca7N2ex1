package N2ex1;

import java.io.IOException;

import static N2ex1.JSONSerializer.serialize;


public class Main {
    public static void main(String[] args) throws IOException {

Person p1 = new Person("Joan","Gómez", 39);
        serialize(p1);
    }
}