package ua.velychko.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SuperMusic implements Music {
    private final String[] songs = new String[]{"Echoes",
            "Shine on you crazy diamond", "Time"};

    @Override
    public String getSong() {
        return songs[new Random().nextInt(songs.length)];
    }
}
