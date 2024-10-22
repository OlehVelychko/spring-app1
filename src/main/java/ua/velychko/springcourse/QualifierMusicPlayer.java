package ua.velychko.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QualifierMusicPlayer {

    @Autowired
    @Qualifier("rockMusic")
    private Music rockMusic;

    @Autowired
    @Qualifier("classicalMusic")
    private Music classicalMusic;

    @Autowired
    @Qualifier("superMusic")
    private Music superMusic;

    public String playMusic(Genre genre) {
        final String message = "Playing random on the QualifierMusicPlayer... : ";
        return switch (genre) {
            case CLASSICAL -> message + classicalMusic.getSong();
            case ROCK -> message + rockMusic.getSong();
            case SUPER -> message + superMusic.getSong();
            default -> "Unknown genre!";
        };
    }
}
