package rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    private Room room;

    @Before
    public void before(){
        room = new Room();
    }

    @Test
    public void roomHasExits(){
        room.generateExits();
        assertEquals(4, room.getExits().size());
    }



}