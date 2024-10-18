package ua.velychko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.playMusic();

        System.out.printf("\n%s\n%s\n\n", firstMusicPlayer.getName(), firstMusicPlayer.getVolume());

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        System.out.println();

        ClassicalMusic classicalMusicBean = context.getBean("classicalMusicBean", ClassicalMusic.class);
        System.out.println(classicalMusicBean.getSong());

        context.close();
    }
}
