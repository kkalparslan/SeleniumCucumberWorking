package com.krafttech.jdbc_test;

import java.sql.*;

public class Test_JDBC_Metadata {
    public static void main(String[] args) {

        String url="jdbc:sqlserver://94.73.170.25:1433;DatabaseName=u0583688_Kraft2;" +
                "encrypt=true;trustServerCertificate=true;";
        String userName="u0583688_Kraft2";
        String password="ANKARA123456789*0987654fg";
        String query="SELECT TOP (10) * from u0583688_Kraft2.product.product";

        try {
            Connection connection= DriverManager.getConnection(url, userName, password);
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(query);
            resultSet.next();
            ResultSetMetaData metaData = resultSet.getMetaData();
//            System.out.println("kolon sayısı = " + metaData.getColumnCount());
//            System.out.println("kolon isimleri= " + metaData.getColumnName(1)+ " || "+metaData.getColumnName(2));

            int kolonSayisi=metaData.getColumnCount();
            for (int i = 1; i <=kolonSayisi ; i++) {
                System.out.println(i+". kolon ismi: "+ metaData.getColumnName(i));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
