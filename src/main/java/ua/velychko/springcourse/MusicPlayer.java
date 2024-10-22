package ua.velychko.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class MusicPlayer {
    private final List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        Music randomGenre = musicList.get(new Random().nextInt(musicList.size()));
        System.out.printf("Playing: %s\n", randomGenre.getSong());
    }
}
