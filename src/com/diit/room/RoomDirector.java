package com.diit.room;

public class RoomDirector {
    private String roomName;
    
    
    public Room getRoom(String roomName){
        if(roomName.equalsIgnoreCase("north")){
           return new NorthRoom();
        }else if(roomName.equalsIgnoreCase("south")){
           return new SouthRoom();
        }else if(roomName.equalsIgnoreCase("east")){
           return new EastRoom();
        }else if(roomName.equalsIgnoreCase("west")){
           return new WestRoom();
        }else            
           return new SouthRoom();  //default room 
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
}
