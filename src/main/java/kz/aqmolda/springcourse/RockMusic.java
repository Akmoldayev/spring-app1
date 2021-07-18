package kz.aqmolda.springcourse;

import org.springframework.stereotype.Component;

@Component("rockBean")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public void doMyInit() {
//        System.out.println("initRock");
    }

    @Override
    public void doMyDestroy() {
//        System.out.println("destroyRock");
    }
}
