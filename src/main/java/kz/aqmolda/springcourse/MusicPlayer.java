package kz.aqmolda.springcourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music;
    @Autowired
    public MusicPlayer(@Qualifier("popBean") Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing now... " + music.getSong());
    }
}