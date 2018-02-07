/*
 * [Sheep.java]
 * Sheep subclass
 * Author: Josh Cai
 * Dec. 10, 2017
*/

class Sheep extends Life{
  
  Sheep(int health){
    super(health);
  }
  
  public void eat(int food){
    addHealth(food);
  }
  
  public void hunger(){
    loseHealth(1);
  }
  
  
  
}