package com.lookpare.game;

import com.badlogic.gdx.math.Vector2;

public class Pacman {
	private Vector2 position;
 
    public Pacman(int x, int y) {
        position = new Vector2(x,y);
    }    
 
    public Vector2 getPosition() {
        return position;    
    }
    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_LEFT = 4;
    public static final int DIRECTION_STILL = 0;
    
    private static final int [][] DIR_OFFSETS = new int [][] {
        {0,0},
        {0,-1},
        {1,0},
        {0,1},
        {-1,0}
    };

    public static final int SPEED = 10;
    
    public void move(int dir) { 
	position.x += SPEED * DIR_OFFSETS[dir][0];
    position.y += SPEED * DIR_OFFSETS[dir][1];
   }

}

