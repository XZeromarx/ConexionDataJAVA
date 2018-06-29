/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {

    private final Conexion CON;
    private String query;
    private ResultSet rs;

    public Data() throws ClassNotFoundException, SQLException {
        CON = new Conexion("localhost", "", "root", "");
    }
}
