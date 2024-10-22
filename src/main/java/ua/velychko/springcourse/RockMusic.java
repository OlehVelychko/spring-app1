package ua.velychko.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {
    private final String[] songs = new String[]{"We are the champions",
            "Numb", "Stairway to Heaven"};

    @Override
    public String getSong() {
        return songs[new Random().nextInt(songs.length)];
    }
}
