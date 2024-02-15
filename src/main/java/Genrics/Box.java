package Genrics;

public class Box {
    private Object content;

    public void setContent(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public static void main(String[] args) {
        Box stringBox = new Box();
        stringBox.setContent("Hello, Generics!");
        Box IntegerBox = new Box();
        IntegerBox.setContent(112);

        String message = (String) stringBox.getContent();
        System.out.println("Content: " + message);



    }
}
