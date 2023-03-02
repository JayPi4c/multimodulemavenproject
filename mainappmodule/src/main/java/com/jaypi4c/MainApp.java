package com.jaypi4c;

import com.jaypi4c.dao.Dao;
import com.jaypi4c.entity.User;
import com.jaypi4c.userdao.UserDao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        // System.out.println(getClass().getResource("").getPath());

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene.fxml")));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm());

        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    static Dao<User> userDao;

    public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Julie"));
        users.put(2, new User("David"));
        userDao = new UserDao(users);

        launch(args);
    }
}
