package com.tran.graphics;

import com.tran.display.Display;
import com.tran.utils.ResourceLoader;
import com.tran.utils.Time;

import java.awt.image.BufferedImage;

public class TextureAtlas {

    BufferedImage image;

    Display display;

    public TextureAtlas(String imageName) {

        image = ResourceLoader.loadImage(imageName);
    }

    public BufferedImage cut(int x, int y, int w, int h) {

        return image.getSubimage(x, y, w, h);

    }

}
