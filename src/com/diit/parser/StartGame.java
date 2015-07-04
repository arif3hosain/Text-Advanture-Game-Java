package com.diit.parser;

import static com.diit.parser.StartGame.roomManager;
import com.diit.room.EastRoom;
import com.diit.room.NorthRoom;
import com.diit.room.Room;
import com.diit.room.RoomDirector;
import com.diit.room.SouthRoom;
import com.diit.room.WestRoom;
import java.util.Scanner;

public class StartGame {
    
    private String userCommand;
    static  RoomDirector roomManager=new RoomDirector();
    private Room room=null;
    private String selectedRoom="southRoom";
    
         //StartGame default constructor
    public StartGame() {
       Inventory in= new Inventory();
        System.out.println("Size: "+in.forestInfo.size());
        Scanner scanner=new Scanner(System.in);
        System.out.println(">There are four rooms available. You can move from one to another room by putting one of the directions(east, west, south, north)."
                + "\nWrite the word 'exit' to stop the game.\n\n");
        room= roomManager.getRoom("south");   //player will enter into the south room by default when he/she start the game.              
        
        while (true) {   
            System.out.print("> ");
            userCommand=scanner.nextLine();
            userCommand.toLowerCase();
            if(userCommand.equalsIgnoreCase("exit")){
                System.out.println(">Game successfully closed");
                System.exit(0);                
            }if(userCommand.equalsIgnoreCase("north") || userCommand.equalsIgnoreCase("south") || userCommand.equalsIgnoreCase("east") || userCommand.equalsIgnoreCase("west") ){
                selectedRoom=currentRoom(userCommand);
            }else{
                if(room instanceof SouthRoom){
                    String roomInfo=room.getRoomDetails(userCommand);
                    System.out.println(roomInfo);
                }else if(room instanceof NorthRoom){
                    String roomInfo=room.getRoomDetails(userCommand);
                    System.out.println(roomInfo);
                }else if(room instanceof WestRoom){
                    String roomInfo=room.getRoomDetails(userCommand);
                    System.out.println(roomInfo);
                }else if(room instanceof EastRoom){
                    String roomInfo=room.getRoomDetails(userCommand);
                    System.out.println(roomInfo);
                }
            }                          
        } //finish while loop                               
    }//constructor
    
    
    public static void main(String[] args) {
        new StartGame();
    }  //finish main
    

   public String currentRoom(String command){       
       if(command.equalsIgnoreCase("west")){
           selectedRoom="west";
           room=roomManager.getRoom(command);
        }else if(userCommand.equalsIgnoreCase("east")){
           selectedRoom="east";
           room=roomManager.getRoom(command);
        }else if(command.equalsIgnoreCase("south")){
           selectedRoom="south";
           room=roomManager.getRoom(command);
        }else if(command.equalsIgnoreCase("north")){
           selectedRoom="north"; 
           room=roomManager.getRoom(command);
        }
       return selectedRoom;
   }//finish currentRoom
     
}
