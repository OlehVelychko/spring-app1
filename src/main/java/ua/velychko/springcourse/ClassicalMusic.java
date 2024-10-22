package ua.velychko.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private final String[] songs = new String[]{"Hungarian Rhapsody",
            "Clair de Lune", "Moonlight Sonata"};

    public void doMyInit() {
        System.out.println("Doing my ClassicalMusicBean initialization...");
    }

    public void doMyDestroy() {
        System.out.println("Doing my ClassicalMusicBean destruction...");
    }

    @Override
    public String getSong() {
        return songs[new Random().nextInt(songs.length)];
    }
}
