/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kosta
 */
public class DataDaoImpl implements DataDao {

    private final List<DataModel> dataList;

    SingleDBConnection1 connection = SingleDBConnection1.getInstance("root", "123456", "data");

    public DataDaoImpl() {
        this.dataList = new ArrayList<>();
    }

    @Override
    public String addData(DataModel d) {
        try {
            try ( PreparedStatement stmt = connection.getConnection().prepareStatement(""
                    + "INSERT INTO cities(yearC,locationC) VALUES (?,?)")) {
                stmt.setInt(1, d.getYear());

                stmt.setString(2, d.getCity());

                //execute statement
                stmt.executeUpdate();
            }

            //return success message
            return "inserted";
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        }

        return null;
    }

    @Override
    public String removeData(int id) {
        try ( PreparedStatement stmt = connection.getConnection().prepareStatement(""
                + "DELETE FROM cities where id = ?")) {

            stmt.setInt(1, id);
            

            //execute statement
            stmt.executeUpdate();

            //return success message
            return "remove sucessfull";
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        }

        return null;
    }

    @Override
    public String updateData(DataModel d,int id) {
        try ( PreparedStatement stmt = connection.getConnection().prepareStatement(""
                + "UPDATE cities SET yearC = ? WHERE id = ?")) {

            stmt.setInt(1,d.getYear());
            
            stmt.setInt(2, id);
            
            stmt.executeUpdate();
            //return success message
            return "update sucessfull";
            
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        }

        return null;
    }

    @Override
    public List<DataModel> getData() {
        try {
            Connection conn = connection.getConnection();

            try (Statement stmt = conn.createStatement()) 
                {
                ResultSet rs = stmt.executeQuery("SELECT * FROM cities");
                {
                    while (rs.next()) {
                        DataModel p = new DataModel();
                        
                        int id = rs.getInt("id");
                        
                        int year = rs.getInt("yearC");
                        
                        String location = rs.getString("locationC");
                        
                        p.setid(id);
                        
                        p.setYear(year);
                        
                        p.setCity(location);
                        
                        dataList.add(p);
                    }
                }
                //close the statement
                stmt.close();
            }
        } 
        //catch sql errors
        catch (SQLException s) {
            System.out.println("Sql error:" + s.toString() + " "+
                    s.getErrorCode() + " " + s.getSQLState());
        } 
        //catch other errors
        catch (Exception e){
            System.out.println("Error:" + e.toString() + e.getMessage());
        }

        //return player list with data 
        return dataList;
    }

}
