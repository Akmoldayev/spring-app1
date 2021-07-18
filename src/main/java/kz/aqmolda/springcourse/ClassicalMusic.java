package kz.aqmolda.springcourse;

import org.springframework.stereotype.Component;

@Component("classicBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public void doMyInit() {
//        System.out.println("initClassic");
    }

    @Override
    public void doMyDestroy() {
//        System.out.println("destroyClassic");
    }
}
