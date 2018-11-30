package OOP.streams;

import java.io.*;

public class Read {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/OOP/streams/numbers.txt"));
            String numar;
            while((numar = reader.readLine()) != null) {
                System.out.print(numar);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();


    }

    }
}
