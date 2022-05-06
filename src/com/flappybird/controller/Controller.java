
package com.flappybird.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.flappybird.model.Bird;
import java.awt.event.KeyEvent;

public class Controller implements IStrategy {
    @Override
    public void addscore(int urscore, int highscore) throws SQLException{
        String jdbcURL = "jdbc:h2:C:/Users/Oottung/score";
        String username = "sa";
        String password = "";
        try (Connection connection = DriverManager.getConnection(jdbcURL,username,password)) {
            System.out.println("Success");
            try (Statement statement = connection.createStatement()) {
                String sql = "create table score values(score1 int, score2 int);";
                try {
                    boolean r = statement.execute(sql);
                } catch (SQLException e14) {
                    // TODO Auto-generated catch block
                    e14.printStackTrace();
                }
                sql ="insert into score values (urscore,highscore);";
                try {
                    boolean r = statement.execute(sql);
                } catch (SQLException e14) {
                    // TODO Auto-generated catch block
                    e14.printStackTrace();
                }
    }
}
    }


    @Override
    public void controller(Bird bird, KeyEvent kevent) {
    }

    @Override
    public void controllerReleased(Bird bird, KeyEvent kevent) {
        if(kevent.getKeyCode() == KeyEvent.VK_SPACE) {
            bird.jump();
        }
    }
    
}
