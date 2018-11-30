package OOP.collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Songs {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/OOP/collections/songs.txt"));
            String song;
            int index = 0;
            while((song = reader.readLine()) != null) {
                songs.add(song);

            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(songs);

        for (String song : songs) {
            System.out.println(song);
        }

    }
}
