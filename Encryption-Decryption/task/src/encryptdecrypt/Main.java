package encryptdecrypt;

import java.util.HashMap;

public class Main {
    static HashMap<Character, Character> hm = new HashMap<>(25){
        {
            put('a','z');
            put('b','y');
            put('c','x');
            put('d','w');
            put('e','v');
            put('f','u');
            put('g','t');
            put('h','s');
            put('i','r');
            put('j','q');
            put('k','p');
            put('l','o');
            put('m','n');
            put('n','m');
            put('o','l');
            put('p','k');
            put('q','j');
            put('r','i');
            put('s','h');
            put('t','g');
            put('u','f');
            put('v','e');
            put('w','d');
            put('x','c');
            put('y','b');
            put('z','a');
        }
    };
    public static void main(String[] args) {
        String input = "we found a cdtreasure!";
        for (char i: input.toCharArray()){
            if (!hm.containsKey(i)) {
                System.out.print(i);
                continue;
            }
            System.out.print(hm.get(i));
        }
    }
}
