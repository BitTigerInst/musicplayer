/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.databaseOp;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author aznable
 */
public class database {
    public MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
    public MongoDatabase database = mongoClient.getDatabase("test");
    public MongoCollection<Document> collection = database.getCollection("music");
}
