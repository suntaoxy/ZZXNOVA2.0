package nova.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import component.nova.MyMenuBar;
import gui.nova.MainPanel;
import gui.nova.SouthPanel;
import gui.nova.WestPanel;

public class MyFrame extends JFrame{
    private JPanel center = null;
    private JPanel west = null;
    private JPanel south = null;
    public MyFrame() {
        // TODO Auto-generated constructor stub
        center = new MainPanel();
        west = new WestPanel(this);
        south = new SouthPanel();
        this.setTitle("NOVA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setJMenuBar(new MyMenuBar());
        this.add(center,"Center");
        this.add(west,"West");
        this.add(south,"South");
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(1000,620);
        this.setLocationRelativeTo(null);
    }
    public JPanel getCenter() {
        return center;
    }
    public void setCenter(JPanel center) {
        this.center = center;
    }
    public JPanel getWest() {
        return west;
    }
    public void setWest(JPanel west) {
        this.west = west;
    }
    public JPanel getSouth() {
        return south;
    }
    public void setSouth(JPanel south) {
        this.south = south;
    }

}
