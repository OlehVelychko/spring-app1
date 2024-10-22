package ua.velychko.springcourse;

import java.util.Random;

public class JazzMusic implements Music {
    private final String[] songs = new String[]{"Take Five", "So What", "Blue in Green"};

    @Override
    public String getSong() {
        return songs[new Random().nextInt(songs.length)];
    }
}