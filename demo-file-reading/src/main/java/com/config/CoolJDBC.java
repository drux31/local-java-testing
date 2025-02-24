package com.config;

import java.sql.Connection;
import java.sql.SQLException;

import org.sqlite.SQLiteDataSource;

public class CoolJDBC {
    private String url = "jdbc:sqlite::memory:";

    private SQLiteDataSource datasource = null;

    /**
     * get a new datasource
     * @return a new datasource
     */
    private SQLiteDataSource getDataSource() {
        if(datasource == null) {
            datasource = new SQLiteDataSource();
        }
        return datasource;
    }

    /**
     * Check that the database connection is valid
     * @return true if the connection is valid, false otherwise
     */
    public boolean isConnectionValid() {
        SQLiteDataSource source = getDataSource();
        source.setUrl(url);
        boolean isValid = false;
        try (Connection con = source.getConnection()){
            isValid = con.isValid(5);   

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isValid;
    }
}
