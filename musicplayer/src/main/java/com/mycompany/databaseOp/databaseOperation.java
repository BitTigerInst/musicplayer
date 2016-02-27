/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.databaseOp;

import org.bson.Document;

/**
 *
 * @author aznable
 */
public class databaseOperation {
    private database db=new database();
    public void insertion(String musicName, String url){
        Document doc=new Document("name", musicName).append("url", url);
        db.collection.insertOne(doc);
    }
}
