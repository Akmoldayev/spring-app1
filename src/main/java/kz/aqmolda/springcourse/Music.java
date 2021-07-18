package kz.aqmolda.springcourse;

import org.springframework.beans.factory.annotation.Autowired;

public interface Music {
    String getSong();

    public void doMyInit();

    public void doMyDestroy();
}
