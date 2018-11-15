package model;

import javax.swing.ImageIcon;

public interface Member {

    public void set(ImageIcon image, int ID, String name, String time);

    public ImageIcon getImage();

    public String getfName();
}
