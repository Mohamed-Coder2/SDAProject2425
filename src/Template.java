public class Template {
    private int ID;
    private String content;
    private String Placeholder;

    public Template(int ID, String content, String placeholder) {
        this.ID = ID;
        this.content = content;
        Placeholder = placeholder;
    }
    public void render(String Data){
        System.out.println(Data);
    }
}
