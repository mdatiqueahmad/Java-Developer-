package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListP01 {
    public static void main(String[] args) {
        List<String> playlist= new ArrayList<>();

        playlist.add("Video 1");
        playlist.add("Video 2");
        playlist.add("Video 1");
        playlist.add("Video 4");
        playlist.add("");
        playlist.add("Video 5");
        System.out.println(playlist);

        //System.out.println(playlist(0));
        System.out.println(playlist.get(2));
    }
}
