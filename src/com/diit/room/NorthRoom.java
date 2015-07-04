package com.diit.room;

import com.diit.parser.Inventory;
import java.util.HashMap;
import java.util.Map;

public class NorthRoom extends Room{
        Inventory inventory=new Inventory();
        Map<String, String> itemInformation=new HashMap<>();

    public NorthRoom() {
        System.out.println("> It is a garden which is full of flowers.");       
    } 
    
    @Override
    public String getRoomDetails(String input) {
         if(inventory.gardenInfo.containsKey(input)){
            return inventory.gardenInfo.get(input);
        }else             
        return "> Wrong command, put one of these key words.."+inventory.gardenKey.toString();
    }   //finish method getRoomDetails   
}//finish class
