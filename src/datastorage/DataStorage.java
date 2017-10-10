package datastorage;

import connections.*;
import data.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {

    private final String driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://Opetus1:3306/s1700306";
    private final String username = "s1700306";
    private final String password = "96WXEJtQ";

    //sql-lauseet 
    private final String sqlGetPerson = "select personID,name,"
            + "age from Person where PersonID=?";
    private final String sqlGetAllPersons = "SELECT personID,name,"
            + "age FROM Person";

    private final String sqlAddPerson = "INSERT INTO Person (personID,"
            + " name, age) values (?,?,?) ";

    private final String sqlDeletePerson = "DELETE FROM Person where personID=?";
    private final String sqlUpdatePersonData = "UPDATE person SET name=?, age=? WHERE henkilotunnus=?";

    public List<Person> getAllPersons() throws DataStorageError {
        Connection connect = null;
        try {
            connect = Connections.openConnection(driver, url, username, password);
        } catch (Exception e) {
            throw new DataStorageError("Datastorage is not open", e);
        }
        PreparedStatement getAllPersons
                = null;
        ResultSet result
                = null;
        try {
            List<Person> list = new ArrayList<Person>();
            getAllPersons = connect.prepareStatement(sqlGetAllPersons);
            result = getAllPersons.executeQuery();
            while (result.next()) {
                list.add(new Person(result.getString(1),
                        result.getString(2),
                        result.getInt(3)));
            }
            return list;
        } catch (SQLException sqle) {
            throw new DataStorageError("Getting data was not successful", sqle);
        } finally {
            Connections.closeResultSet(result);
            Connections.closeStatement(getAllPersons);
            Connections.closeConnection(connect);
        }
    }

    public void deletePerson(String personID) throws DataStorageError {
        Connection connect = null;
        try {
            connect = Connections.openConnection(driver, url, username, password);
        } catch (Exception e) {
            throw new DataStorageError("Datastorage is not open", e);
        }

        PreparedStatement deletePerson = null;
        try {
            deletePerson = connect.prepareStatement(sqlDeletePerson);
            deletePerson.setString(1, personID);
            deletePerson.executeUpdate();
        } catch (SQLException sqle) {
            throw new DataStorageError("Deleting was not successful", sqle);
        } finally {
            Connections.closeStatement(deletePerson);
            Connections.closeConnection(connect);
        }
    }

    public void addPerson(Person newPerson) throws DataStorageError {

        Connection connect = null;
        try {
            connect = Connections.openConnection(driver, url, username, password);
        } catch (Exception e) {
            throw new DataStorageError("Datastorage is not open", e);
        }
        PreparedStatement addPerson = null;
        try {
            addPerson = connect.prepareStatement(sqlAddPerson);
            addPerson.setString(1, newPerson.getPersonID());
            addPerson.setString(2, newPerson.getName());
            addPerson.setInt(3, newPerson.getAge());
            addPerson.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            throw new DataStorageError("Adding new person was not successful", sqle);
        } finally {
            Connections.closeStatement(addPerson);
            Connections.closeConnection(connect);
        }

    }

    public Person getPerson(String personID) throws DataStorageError {
        Connection connect = null;
        try {
            connect = Connections.openConnection(driver, url, username, password);
        } catch (Exception e) {
            throw new DataStorageError("Datastorage is not open", e);
        }
        PreparedStatement getPerson = null;
        ResultSet result = null;
        try {
            getPerson = connect.prepareStatement(sqlGetPerson);
            getPerson.setString(1, personID);
            result = getPerson.executeQuery();
            if (result.next()) {
                return new Person(result.getString(1),
                        result.getString(2),
                        result.getInt(3));
            } else {
                throw new DataStorageError("Person was not found");
            }
        } catch (SQLException sqle) {
            throw new DataStorageError("Error in getting person's info", sqle);
        } finally {
            Connections.closeResultSet(result);
            Connections.closeStatement(getPerson);
            Connections.closeConnection(connect);
        }
    }

}
