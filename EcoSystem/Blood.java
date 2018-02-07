/*
 * [Blood.java]
 * Blood subclass
 * Author: Josh Cai
 * Dec. 10, 2017
*/

class Blood extends Life{
  
  Blood(int health){
    super(health);
  }
  
  public void hunger(){
    loseHealth(1);
  }
}