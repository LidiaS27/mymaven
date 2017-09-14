package com.mymaven;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Smik_li30 on 04.09.2017.
 */
public class Main {
    private final static String DB_PATH = "jdbc:postgresql://127.0.0.1:5439/postgres";
    private final static String DB_USER = "postgres";
    private final static String DB_PASS = "";

       public static void main(String[] args) {
        //Подключение драйвера для выбранного вида БД
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Создание соединения с БД
        try {
            Connection connection = DriverManager.getConnection(DB_PATH, DB_USER, DB_PASS);

            //Получение объекта statement для DDL/DML операций
            Statement statement = connection.createStatement();

            //Выполнение простых SQL-запроса на изменение содержимого таблицы
            boolean isExecuted = statement.execute("INSERT INTO `users` (`id`, `name`, `mail`) VALUES (null, 'user_name', 'user_mail@user.com')");
            int count = statement.executeUpdate("INSERT INTO `users` (`id`, `name`, `mail`) VALUES (null, 'user_name', 'user_mail@user.com')");

            //Создание множество неоднообразных запросов и их совместное выполнение
            statement.addBatch("INSERT INTO `users` (`id`, `name`, `mail`) VALUES (null, 'user_name', 'user_mail@user.com')");
            statement.addBatch("DELETE FROM `users` WHERE `id` = 1");
            int[] batchCount = statement.executeBatch();


            //Получение данных из таблицы и их обработка
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `users`");

            //Обработка полученных данных через получение конкретного ряда с наименованием колонок и их значениями
            List<Map<String, Object>> userList = new ArrayList<>();

            while (resultSet.next()) {
                Map<String, Object> map = new HashMap<>();

                //Получение значений по имени колонок в текущем ряду
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String mail = resultSet.getString("mail");

                map.put("id", id);
                map.put("name", name);
                map.put("mail", mail);

                userList.add(map);
            }

            //Использование заранее подготовленных запросов с возможность подставления ключевых значений
            PreparedStatement prst = connection.prepareStatement("INSERT INTO `users` (`id`, `name`, `mail`) VALUES (null, ?, ?)");
            prst.setString(1, "user_name_2");
            prst.setString(2, "user_name_2@mail.user");
            prst.execute();

            prst = connection.prepareStatement("SELECT * FROM `users` WHERE `id` = ?");
            prst.setInt(1, 2);
            resultSet = prst.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
