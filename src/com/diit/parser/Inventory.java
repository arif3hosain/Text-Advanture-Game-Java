
package com.diit.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    
        public  Map<String, String> forestInfo=new HashMap();    //creating a HashMap object to contain key and value pairs about forest
        public  Map<String, String> zooInfo=new HashMap();    //creating a HashMap object to contain key and value pairs about field
        public  Map<String, String> gardenInfo=new HashMap();    //creating a HashMap object to contain key and value pairs about garden
        public  Map<String, String> riverInfo=new HashMap();    //creating a HashMap object to contain key and value pairs about river
        public ArrayList<String> forestKey=new ArrayList<>();   //add key about forest
        public ArrayList<String> zooKey=new ArrayList<>();    //add key about field
        public ArrayList<String> gardenKey=new ArrayList<>();   //add key about garden
        public ArrayList<String> riverKey=new ArrayList<>();    //addk key about river


    public Inventory() {
        addZooInfo();    //call method addZooInfo
        addGardenInfo();     //call method addGardenInfo
        addForestInfo();    //call method addForestInfo
        addRiverInfo();     //call method addRiverInfo
    }
    
    public void addZooInfo(){
        zooKey.add("look zoo");
        zooKey.add("look animals");
        zooKey.add("animal size");
        zooInfo.put(zooKey.get(0), "> This is a public zoo with more than 2,000 animals. ");
        zooInfo.put(zooKey.get(1), "> There are 30 types of animals such as Royal Bengal Tiger, Elepent,Giraffe and more ");
        zooInfo.put(zooKey.get(2), "> The zoo contains all type of animals");
    
    }   //finish method addZooInfo
    
    public void addForestInfo(){
        forestKey.add("look tree");
        forestKey.add("look leaf");
        forestKey.add("get tree");
        forestInfo.put(forestKey.get(0), "> The trees are made of wood and leaves.");
        forestInfo.put(forestKey.get(1), "> The leaf is green");
        forestInfo.put(forestKey.get(2), "> You cannot get the tree");
        
    }   //finish method addForestInfo
    
    public void addGardenInfo(){
        gardenKey.add("look garden");
        gardenKey.add("look flower");
        gardenKey.add("look color");
        gardenInfo.put(gardenKey.get(0), "> It is a garden which is full of flowers.");
        gardenInfo.put(gardenKey.get(1), "> There are 3 types of rose devided by color.");
        gardenInfo.put(gardenKey.get(2), "> There are three colors of flowers like white rose, red rose & green rose");     
    
    }   //finish method addGardenInfo
    
    public void addRiverInfo(){
        riverKey.add("look river");
        riverKey.add("look color");
        riverKey.add("look size");
        riverInfo.put(riverKey.get(0), "> It is a river named Padma which is containing delicious Ilisha");
        riverInfo.put(riverKey.get(1), "> Silver shot, golden and purple.");
        riverInfo.put(riverKey.get(2), "> It can grow up to 60 cm in length with weights of up to 3 kg");
       
    }//finish method addRivernfInfo
     
}
