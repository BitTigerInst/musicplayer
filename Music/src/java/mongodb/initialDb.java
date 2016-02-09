/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodb;
import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.WriteResult;

/**
 *
 * @author aznable
 */
public class initialDb {
    static void main(String arg[]){
        Mongo mongo=new Mongo();
        DB database=new DB(mongo, "music");
        char[] password={'1','2','3'};
        WriteResult User = database.addUser("admin", password);
    }
}
