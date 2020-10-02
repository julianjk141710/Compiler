package Lexical;

import java.util.HashMap;
import java.util.HashSet;

public class LexicalHandler {
    public char getChar(String text, int index) {
        if (index < text.length()) {
            return text.charAt(index);
        }
        return ' ';
    }

    public void catToken(StringBuilder token, char character) {
        token.append(character);
    }


    public void clearToken(StringBuilder token) {
        token.delete(0, token.length());
    }

    public boolean isBlank(char character) {
        if (character == ' ' || character == '\n' || character == '\t') {
            return true;
        }
        return false;
    }

    public int getBlankChar(char character, int index) {
        if (isBlank(character)) {
            index ++;
        }
        return index;
    }

    public int addIndex(int index) {
        index ++;
        return index;
    }
    public int reduceIndex(int index) {
        index --;
        return index;
    }

    public boolean isDigit(char character) {
        if (Character.isDigit(character)) {
            return true;
        }
        return false;
    }

    public boolean isLetter(char character) {
        if (Character.isLetter(character)) {
            return true;
        }
        return false;
    }

    public boolean isReserver(HashSet<String> reservers, StringBuilder token) {
        if (reservers.contains(token.toString())) {
            return true;
        }
        return false;
    }

    public int atoi(StringBuilder token) {
        return Integer.parseInt(token.toString());
    }

    public LexicalException throwError() {
        return new LexicalException("Something went wrong...");
    }

    public Token isDelimiter(HashMap<String, String> delimiters, StringBuilder token) {
        if (delimiters.containsKey(token.toString())) {
            Token retToken = new Token(delimiters.get(token.toString()), token.toString());
            return retToken;
        }
        return null;
    }
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        char a = 'a';
//        sb.append(a);
//        System.out.println(sb.toString());
    }
}
