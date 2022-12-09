import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Clovek a = new Clovek("jonas","zajicek",2002);
        Clovek b = new Clovek("lukas"," vesely",2004);
        Clovek c = new Clovek("martin","marecek",2000);

        File file = new File("Z:\\druhak\\ichmochteselbstmodbegehen\\buu.txt");
        FileOutputStream outFile = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(outFile);

        out.writeObject(a);

        out.close();
        outFile.close();
    }
}