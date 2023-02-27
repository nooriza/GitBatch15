package Class24;

public abstract class FileAbstract {
    String open;
    int size;
    String edit;
    String close;

abstract void open();
    void edit(){
        System.out.println("You can edit the document");
    }
    void close(){
        System.out.println("You can close this document");
    }
}
class Javafile extends FileAbstract{
    @Override
    void open() {
        System.out.println("Open JAVA File");
    }
}
class Wordfile extends FileAbstract{
    @Override
    void open() {
        System.out.println("Open wordfile");
    }
}
class PDFfile extends FileAbstract{
    @Override
    void open() {
        System.out.println("open PDF file");
    }
}
