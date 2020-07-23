package rooms;

import enemies.Enemy;
import enemies.Orc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Room {

    private ArrayList<Exit> exits;
    private Enemy enemy;

    public Room(){
        exits = new ArrayList<Exit>();
        enemy = new Orc(10);
    }

    public void generateExits(){
        for(Exit exit : Exit.values()){
            exits.add(exit);
        }
        Collections.shuffle(exits);
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public Exit returnExit(int choice){
        return exits.get(choice);
    }

    public boolean isRoomCompleted(){
        if(enemy.getHealthPoints() <= 0){
            System.out.println("Room has been completed!");
            return true;
        }else{return false;}
    }
}
