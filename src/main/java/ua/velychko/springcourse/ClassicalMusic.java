package ua.velychko.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    private final String[] songs = new String[]{"Hungarian Rhapsody",
            "Clair de Lune", "Moonlight Sonata"};

//    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my ClassicalMusicBean initialization...\n");
    }

//    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my ClassicalMusicBean destruction...\n");
    }

    @Override
    public String getSong() {
        return songs[new Random().nextInt(songs.length)];
    }
}
