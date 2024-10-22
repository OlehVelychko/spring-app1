package ua.velychko.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public SuperMusic superMusic() {
        return new SuperMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList() {
        return List.of(classicalMusic(), rockMusic(), superMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}
