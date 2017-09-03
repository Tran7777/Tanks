package com.tran.IO;

import javax.swing.*;
import java.util.Arrays;

public class Input extends JComponent {

    private boolean [] map;

    public Input(){

        map = new boolean[256];

        for(int i = 0; i<map.length ; i++){

            final int KEY_CODE = i;

            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        }


    }

    public boolean[] getMap(){
        return Arrays.copyOf(map, map.length);
    }

    public boolean getKey(int keyCode){
        return map[keyCode];

    }
}
