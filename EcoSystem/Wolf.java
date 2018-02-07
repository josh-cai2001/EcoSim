/*
 * [Wolf.java]
 * Wolf subclass
 * Author: Josh Cai
 * Dec. 10, 2017
*/

class Wolf extends Life {
  
  Wolf(int health){
    super(health);
  }
  
  public void eat(int food){
    addHealth(food);
  }
  
  public void hunger(){
    loseHealth(1);
  }
  

}