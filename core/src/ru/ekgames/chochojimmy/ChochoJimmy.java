package ru.ekgames.chochojimmy;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class ChochoJimmy extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Rectangle man;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("man.png");
		man = new Rectangle(0, 0, 150, 150);
	}



	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) man.y += 200 * Gdx.graphics.getDeltaTime();
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) man.y -= 200 * Gdx.graphics.getDeltaTime();
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) man.x += 200 * Gdx.graphics.getDeltaTime();
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) man.x -= 200 * Gdx.graphics.getDeltaTime();
		batch.draw(img, man.x, man.y,  man.width, man.height);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
