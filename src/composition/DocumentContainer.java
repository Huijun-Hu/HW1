package composition;

public abstract class DocumentContainer {

    private String name;

    public DocumentContainer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isFolder(){
        return false;
    }

    public void print(int currentIndent){
        System.out.println(this.getName());
    }
}
