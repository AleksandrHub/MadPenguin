package ru.aleksandrhub.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MadPenguin extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	String tittle;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("background01.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
