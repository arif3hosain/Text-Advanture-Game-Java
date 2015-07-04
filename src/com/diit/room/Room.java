package com.diit.room;

public abstract class Room {
    
    private String itemName;
    private String itemDescription;
    
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    
    public abstract String getRoomDetails(String input);
 
}
