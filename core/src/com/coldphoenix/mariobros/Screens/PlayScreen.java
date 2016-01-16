package com.coldphoenix.mariobros.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.coldphoenix.mariobros.MarioBros;
import com.coldphoenix.mariobros.Scenes.HUD;

/**
 * Created by adamk on 1/11/2016.
 */
public class PlayScreen implements Screen
{
    private MarioBros game;
    Texture texture;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    public HUD HUD;

    public PlayScreen(MarioBros game)
    {
        this.game = game;
        texture = new Texture("badlogic.jpg");
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(MarioBros.V_WIDTH, MarioBros.V_HEIGHT, gamecam);
        HUD = new HUD(game.batch);
    }
    @Override
    public void show()
    {

    }

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.setProjectionMatrix(HUD);

    }

    @Override
    public void resize(int width, int height)
    {
        gamePort.update(width,height);
    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void hide()
    {

    }

    @Override
    public void dispose()
    {

    }
}
