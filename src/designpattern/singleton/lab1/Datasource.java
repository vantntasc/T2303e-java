package designpattern.singleton.lab1;

import designpattern.singleton.lab1.Connection;

public class Datasource {
    private static Connection connection;

    public static Connection getConnection(){
        if(connection == null){
            System.err.println("Init connection to DB ");
            connection = new Connection();
        }
        return connection;
    }

}
