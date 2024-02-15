package compositionPrac;

import java.util.ArrayList;

public class Folder extends DocumentContainer{

    private ArrayList<DocumentContainer> subDirectory;

    public Folder(String folderName){
        super(folderName);
        subDirectory = new ArrayList<>();
    }

    public ArrayList<DocumentContainer> getSubDirectory(){
        return subDirectory;
    }

    @Override
    public Boolean isFolder(){
        return true;
    }

    public void add(DocumentContainer container){
        subDirectory.add(container);
    }

    public void delete(DocumentContainer d){
        subDirectory.remove(d);
    }
    public void printSubDirectory(int currentIndent){
        for (DocumentContainer d : subDirectory){
            for (int i = 0; i< currentIndent; i++){
                System.out.print("   ");
            }
            System.out.print("-");
            d.print(currentIndent);
        }
    }

    @Override
    public void print(int currentIndent){
        int indent = currentIndent;
        System.out.println(this.getName());
        if (this.isFolder()){
            indent++;
            this.printSubDirectory(indent);
        }
    }
}

