package kz.aqmolda.springcourse;

import org.springframework.stereotype.Component;

@Component("popBean")
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Anywhere";
    }

    @Override
    public void doMyInit() {
    }

    @Override
    public void doMyDestroy() {
    }
}
