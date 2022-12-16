package org.Jenkins;

public class Entity {
    private String message;

    public Entity(){
        this.message = "No Message Inserted";
    }

    public Entity(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int calculate(int x, int y, char c) {
        int res = 0;
        switch (c) {
            case '+': res = x + y; break;
            case '-': res = x - y; break;
            case '*': res = x * y; break;
            case '/': res = x / y; break;
        }
        return res;
    }

}
