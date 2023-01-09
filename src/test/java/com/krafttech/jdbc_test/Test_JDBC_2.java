package com.krafttech.jdbc_test;

import java.sql.*;

public class Test_JDBC_2 {
    public static void main(String[] args) {

        String url="jdbc:sqlserver://94.73.170.25:1433;DatabaseName=u0583688_Kraft2;" +
                "encrypt=true;trustServerCertificate=true;";
        String userName="u0583688_Kraft2";
        String password="ANKARA123456789*0987654fg";
        String query="SELECT TOP (10) * from u0583688_Kraft2.product.product";

        try {
            Connection connection= DriverManager.getConnection(url, userName, password);
            Statement statement= connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            resultSet.next();
            System.out.print(resultSet.getRow()+". satır: "+ resultSet.getString(2));
            System.out.println(" || "+resultSet.getString("model_year"));
            resultSet.next();
            System.out.print(resultSet.getRow()+". satır: "+ resultSet.getString(2));
            System.out.println(" || "+resultSet.getString("model_year"));
            String model=resultSet.getString("brand_id");// modelini string değer olarak getirdi.
            System.out.println("model = " + model);
            int model_year = resultSet.getInt("brand_id");// modelini int değer olarak getirdi.
            System.out.println("model_year = " + model_year);
            double list_price = resultSet.getDouble("list_price");
            System.out.println("list_price = " + list_price);
            int list_price1 = resultSet.getInt("list_price");
            System.out.println("list_price1 = " + list_price1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
