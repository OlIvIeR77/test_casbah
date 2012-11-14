package com.example.myproj

import com.mongodb.casbah.Imports._


object Mongo extends App {

  println("hello !! Mongo is connecting...")
  connectToMongo

  def connectToMongo {
  	val mongoConn = MongoConnection()
  	val mongoColl = mongoConn("casbah_test")("data_fetcher")
  	
		val builder = MongoDBObject.newBuilder
			builder += "foo" -> "bar"
			builder += "chewing" -> "gum"

		//val builderList = MongoDBList.newBuilder
		//	builderList += "chou"
		//	builderList += "tic" 
		//val newLst = builderList.result.toList

		mongoColl += builder.result.asDBObject
		
		println(Color.cyan("the following DBObject was successfully inserted in Mongodb"))
		println(Color.red(builder.result.asDBObject.toString)) 

		for { x <- mongoColl} yield println(x)
	}

}
