package com.diit.room;

import com.diit.parser.Inventory;

public class WestRoom extends Room{
        Inventory inventory=new Inventory();

    public WestRoom() {
        System.out.println("> This is a public zoo with more than 2,000 animals. ");
    }

    @Override
    public String getRoomDetails(String input) {
 
        if(inventory.zooInfo.containsKey(input)){
            return inventory.zooInfo.get(input);
        }else             
        return "> Wrong command, put one of these key words.."+inventory.zooKey.toString();               
    }   //finish method getRoomDetails
 
}
