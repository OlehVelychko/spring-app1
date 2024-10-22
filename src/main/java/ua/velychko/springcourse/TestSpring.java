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

        System.out.printf("\n%s\n%s\n", firstMusicPlayer.getName(), firstMusicPlayer.getVolume());

        System.out.println();

        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        System.out.println();

        ClassicalMusic classicalMusicBean = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusicBean.getSong());

        System.out.println();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        System.out.println();

        QualifierMusicPlayer qualifierMusicPlayer = context.getBean("qualifierMusicPlayer", QualifierMusicPlayer.class);
        System.out.println(qualifierMusicPlayer.playMusic(Genre.ROCK));
        System.out.println(qualifierMusicPlayer.playMusic(Genre.CLASSICAL));
        System.out.println(qualifierMusicPlayer.playMusic(Genre.SUPER));

        System.out.println();

        context.close();
    }
}
