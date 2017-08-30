package com.tran.display;

import javax.swing.*;
import java.awt.*;
//класс для создания окна (рамка и  лист) в любой момет времени существует только
//одно окно
public abstract class Display {

    private static boolean created = false;//созданно ли окно проверка
    private static JFrame window; //создание рамки
    private static Canvas content;//добавление листа в рамку



    public  static void create(int width, int height, String title){

        if(created)//если окно уже созданно то не создаем новое
            return;
        window = new JFrame(title); //создание рамки
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//пр нажатии на крестик окно не только закрывается но и программаа открывается
        content = new Canvas(){// когда создается конвас автоматически создается
            //функция паинт и в нее передается графический обьекс с помощью канваса



        };

        Dimension size = new Dimension(width, height);//задание размеров окна с помоощью этого класса. тк влоб нельзя
        content.setPreferredSize(size);//вставка параметров размера листа


        window.setResizable(false);
        window.getContentPane().add(content);//вставка листа в рамку чтобы информация была только в ней
        window.pack();// изменнение размиеров окна так чтобы он подходит тоочно под размер нащего контента
        window.setLocationRelativeTo(null);//поялвение окна по центру
        window.setVisible(true);


    }



}
