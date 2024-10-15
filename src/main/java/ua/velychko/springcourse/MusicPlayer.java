package ua.velychko.springcourse;

public class MusicPlayer {
    private final Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.printf("Playing: %s", music.getSong());
    }
}
