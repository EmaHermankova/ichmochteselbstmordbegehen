import java.io.*;

public class Ctilidi extends Main{
    File file = new File("Z:\\druhak\\ichmochteselbstmodbegehen\\buu.txt");
    FileInputStream inFile = new FileInputStream(file);
    ObjectInputStream in = new ObjectInputStream(inFile);

    in.readObject();

    public Ctilidi() throws IOException {
    }
}