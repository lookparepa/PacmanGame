package com.lookpare.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	private PacmanGame pacmanGame;
	private World world;
	private SpriteBatch batch;
	public WorldRenderer(PacmanGame pacmanGame, World world) {
        this.pacmanGame = pacmanGame;
        batch = pacmanGame.batch;
 
        this.world = world;
 
        GameScreen.pacmanImg = new Texture("pacman.png");
    }

	
	public void render(float delta) {
		GameScreen.pacman = world.getPacman();
    	GameScreen.update(delta);
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch = pacmanGame.batch;
        batch.begin();
        Vector2 pos = GameScreen.pacman.getPosition();
        batch.draw(GameScreen.pacmanImg, pos.x, pos.y);
        batch.end();
    }
	
}