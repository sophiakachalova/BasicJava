package edu.ntu.pzks.lr5.database;


import java.sql.*;
import java.util.Scanner;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:students.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }


    public static void getStudentsByMonth(String month) {
        String sql = "SELECT * FROM students WHERE substr(birth_date, 6, 2) = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, month);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("\n Студенти, народжені у " + month + " місяці:");
            boolean found = false;
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getString("middle_name") + " (" + rs.getString("birth_date") + ")");
                found = true;
            }
            if (!found) {
                System.out.println("Немає студентів, народжених у цьому місяці.");
            }
        } catch (SQLException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\n Введіть номер місяця (01-12) або 'exit' для виходу: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Вихід з програми.");
                break;
            }

            if (input.matches("^(0[1-9]|1[0-2])$")) {
                getStudentsByMonth(input);
            } else {
                System.out.println("Неправильний формат! Введіть число від 01 до 12.");
            }
        }
    }
}
