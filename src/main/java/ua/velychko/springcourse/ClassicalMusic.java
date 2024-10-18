package ua.velychko.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("Doing my ClassicalMusicBean initialization...");
    }

    public void doMyDestroy() {
        System.out.println("Doing my ClassicalMusicBean destruction...");
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

}
