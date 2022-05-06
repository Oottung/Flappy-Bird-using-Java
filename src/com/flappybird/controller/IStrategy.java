
package com.flappybird.controller;

import com.flappybird.model.Bird;
import java.awt.event.KeyEvent;
import java.sql.SQLException;


public interface IStrategy {
    public void addscore(int urscore,int highscore) throws SQLException;
    public void controller(Bird bird, KeyEvent kevent);
    public void controllerReleased(Bird bird, KeyEvent kevent);
}
