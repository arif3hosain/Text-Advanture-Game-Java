package com.diit.room;

import com.diit.parser.Inventory;

public class SouthRoom extends Room{  
    Inventory inventory=new Inventory();
    
       //when player comes to SouthRoom, he can get detail information about the room
    public SouthRoom() {
        System.out.println("> You are standing in a forest. It’s full of trees.");
         
    }   //finish constructor SouthRoom

        //this method provides forest related information
    @Override
    public String getRoomDetails(String input) {      
       if(inventory.forestInfo.containsKey(input)){
            return inventory.forestInfo.get(input);
       }else            
        return "> Wrong command, put one of these key words.."+inventory.forestKey.toString();
    }   //finish method getRoomDetails
    
}
