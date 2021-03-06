package Lexical;

public class Token {
    private int typeNum;
    private String memorySymbol;
    private String tokenContent;

    public Token(int typeNum, String memorySymbol, String tokenContent) {
        this.typeNum = typeNum;
        this.memorySymbol = memorySymbol;
        this.tokenContent = tokenContent;
    }

    public Token(String memorySymbol, String tokenContent) {
        this.memorySymbol = memorySymbol;
        this.tokenContent = tokenContent;
    }
    public int getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(int typeNum) {
        this.typeNum = typeNum;
    }

    public String getMemorySymbol() {
        return memorySymbol;
    }

    public void setMemorySymbol(String memorySymbol) {
        this.memorySymbol = memorySymbol;
    }

    public String getTokenContent() {
        return tokenContent;
    }

    public void setTokenContent(String tokenContent) {
        this.tokenContent = tokenContent;
    }
}
