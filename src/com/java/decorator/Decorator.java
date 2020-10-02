package com.java.decorator;

public class Decorator {
    public static void main(String[] args) {

        FileStream fileStream = new DoOneMoreThingWhileReading(new FileStreamReader());
        fileStream.read();
    }

}
interface FileStream{
    void read();
}
class FileStreamReader implements FileStream{

    @Override
    public void read() {
        System.out.println("Read file");
    }
}
abstract class FileDecorator implements FileStream{
    FileStream fileStream;
    public FileDecorator(FileStream fileDecorator){
        this.fileStream = fileDecorator;
    }
    public abstract void read();


}

class DoOneMoreThingWhileReading extends FileDecorator{

    public DoOneMoreThingWhileReading(FileStream fileDecorator) {
        super(fileDecorator);
    }

    @Override
    public void read() {
        fileStream.read();
        System.out.println("I do one more thing");
    }
}