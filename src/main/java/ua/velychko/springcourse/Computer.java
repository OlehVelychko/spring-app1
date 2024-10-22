package ua.velychko.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Computer " + id + " started...\n");
        musicPlayer.getMusicList().forEach(music -> builder.append("\tPlaying: ").append(music.getSong()).append("\n"));
        return builder.toString();
    }
}
