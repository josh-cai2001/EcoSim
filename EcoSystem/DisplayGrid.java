/* [DisplayGrid.java]
 * A Small program to display a 2D Life Array graphically
 * @author Mangat, Alterations: Josh Cai
 * Dec. 10, 2017
 */

// Graphics Imports
import javax.swing.*;
import javax.imageio.*;
import java.awt.*;


class DisplayGrid { 

  private JFrame frame;
  private int maxX,maxY, GridToScreenRatio;
  private Life[][] world;
  
  DisplayGrid(Life[][] w) { 
    this.world = w;
    
    maxX = Toolkit.getDefaultToolkit().getScreenSize().width;
    maxY = Toolkit.getDefaultToolkit().getScreenSize().height;
    GridToScreenRatio = maxY / (world.length+1);  //ratio to fit in screen as square map
    
    System.out.println("Map size: "+world.length+" by "+world[0].length + "\nScreen size: "+ maxX +"x"+maxY+ " Ratio: " + GridToScreenRatio);
    
    this.frame = new JFrame("Map of World");
    
    GridAreaPanel worldPanel = new GridAreaPanel();
    
    frame.getContentPane().add(BorderLayout.CENTER, worldPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
    frame.setVisible(true);
  }
  
  
  public void refresh() { 
    frame.repaint();
  }
  
  
  
  class GridAreaPanel extends JPanel {
    public void paintComponent(Graphics g) {        
      //super.repaint();
      
      Image sheep = Toolkit.getDefaultToolkit().getImage("sheep.png");
      Image wolf = Toolkit.getDefaultToolkit().getImage("wolf.png");
      Image plant = Toolkit.getDefaultToolkit().getImage("plant.png");
      Image blank = Toolkit.getDefaultToolkit().getImage("blank.png");
      Image blood = Toolkit.getDefaultToolkit().getImage("blood.png");
      Image babySheep = Toolkit.getDefaultToolkit().getImage("babySheep.png");
      
      setDoubleBuffered(true); 
      
      for(int i = 0; i<world[0].length;i=i+1)
      { 
        for(int j = 0; j<world.length;j=j+1) 
        { 
          
          if (world[i][j] == null)    //This block can be changed to match character-color pairs
            g.drawImage(blank,j*GridToScreenRatio,i*GridToScreenRatio,GridToScreenRatio,GridToScreenRatio,this);
          else if (world[i][j] instanceof Wolf)
            g.drawImage(wolf,j*GridToScreenRatio,i*GridToScreenRatio,GridToScreenRatio,GridToScreenRatio,this);
          else if (world[i][j] instanceof Sheep)
            g.drawImage(sheep,j*GridToScreenRatio,i*GridToScreenRatio,GridToScreenRatio,GridToScreenRatio,this);
          else if (world[i][j] instanceof Blood)
            g.drawImage(blood,j*GridToScreenRatio,i*GridToScreenRatio,GridToScreenRatio,GridToScreenRatio,this);
          else if (world[i][j] instanceof BabySheep)
            g.drawImage(babySheep,j*GridToScreenRatio,i*GridToScreenRatio,GridToScreenRatio,GridToScreenRatio,this);
          else 
            g.drawImage(plant,j*GridToScreenRatio,i*GridToScreenRatio,GridToScreenRatio,GridToScreenRatio,this);
          
        }
      }
    }
  }//end of GridAreaPanel
  
} //end of DisplayGrid
