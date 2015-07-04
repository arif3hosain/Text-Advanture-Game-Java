package com.diit.room;

import com.diit.parser.Inventory;

public class EastRoom extends Room{
        Inventory inventory=new Inventory();

    public EastRoom() {
        System.out.println("> You are standing by a river named Magna");
    }

    @Override   //this method provides information about river
    public String getRoomDetails(String input) {
        if(inventory.riverInfo.containsKey(input)){
            return inventory.riverInfo.get(input);
        }else             
        return "> Wrong command, put one of these key words.."+inventory.riverKey.toString();               
    }   //finish method getRoomDetails
}
 
