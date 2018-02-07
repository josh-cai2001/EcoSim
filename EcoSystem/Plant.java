/*
 * [Plant.java]
 * Plant subclass
 * Author: Josh Cai
 * Dec. 10, 2017
*/

class Plant extends Life{
  
  Plant(int health){
    super(health);
  }
  
  public void hunger(){
    loseHealth(1);
  }
}