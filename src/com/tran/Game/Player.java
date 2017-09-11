package com.tran.Game;

import com.tran.IO.Input;
import com.tran.graphics.Sprite;

import java.awt.*;
import java.util.Map;

public class Player extends Entity {

    private static final int SPRITE_SCALE = 16;

    private enum Heading {

        NORTH(0*),
        EAST,
        SOUTH,
        WEST;

        private int x, y, h, w;

        Heading(int x ,int y, int h, int w){
            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;
        }


    }

    private Heading heading;
    private Map<Heading, Sprite> spriteMap;// to draw sprite tank when
    //position is changed

    protected Player(float x, float y) {
        super(EntityType.Player, x, y);
    }

    @Override
    protected void update(Input input) {

    }

    @Override
    protected void render(Graphics g) {

    }
}
