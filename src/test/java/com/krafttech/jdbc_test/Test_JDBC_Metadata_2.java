package com.krafttech.jdbc_test;

import java.sql.*;

public class Test_JDBC_Metadata_2 {
    public static void main(String[] args) {

        String url="jdbc:sqlserver://94.73.170.25:1433;DatabaseName=u0583688_Kraft2;" +
                "encrypt=true;trustServerCertificate=true;";
        String userName="u0583688_Kraft2";
        String password="ANKARA123456789*0987654fg";
        String query="SELECT TOP(10 )* FROM u0583688_Kraft2.product.brand";

        try (Connection connection= DriverManager.getConnection(url,userName,password);
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             ResultSet  resultSet = statement.executeQuery(query);)
        {
            ResultSetMetaData metaData = resultSet.getMetaData();
            //System.out.println("getColumnCount() = " + metaData.getColumnCount());
            /**
             * Soru: Columncount u kullanarak ilk satırın değerlerini ekrana yazdıralım

            resultSet.next();
            //1. yöntem:
            System.out.println(resultSet.getString(metaData.getColumnCount()-1)+"-->"+
                    resultSet.getString(metaData.getColumnCount()));
            //2. yöntem:
            int kolonSayisi=metaData.getColumnCount();
            for (int i = 1; i <=kolonSayisi ; i++) {
                //System.out.print(resultSet.getString(i)+"\t");
                System.out.println("1. row: "+i+". kolon: "+resultSet.getString(i));
            }*/

            /**
             * SORU: columnCount u kullanarak bütün rowları alt alta yazdıralım

            int kolonSayisi= metaData.getColumnCount();
            while (resultSet.next()){
                for (int i = 1; i <=kolonSayisi ; i++) {
                    System.out.print(resultSet.getString(i)+"\t");
                }
                System.out.println("");
            }*/

            /**
             * SORU: Tablomuzu kolon isimleriyle (başlıklarıyla) beraber columnCount u
             * kullanarak bütün rowları alt alta yazdıralım
             */

            int kolonSayisi= metaData.getColumnCount();
//            for (int i = 1; i <=kolonSayisi ; i++) { başka bir yol başlık için
//                System.out.print(metaData.getColumnName(i)+"\t");
//            }
//            System.out.println("");

            System.out.print(metaData.getColumnName(1)+"\t");
            System.out.println(metaData.getColumnName(2));
            System.out.println("________"+"\t"+"________");
            while (resultSet.next()){
                for (int i = 1; i <=kolonSayisi ; i++) {
                    System.out.print(resultSet.getString(i)+"\t"+"\t"+"\t");
                }
                System.out.println("");
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
