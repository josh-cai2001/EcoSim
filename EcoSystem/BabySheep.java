/*
 * [BabySheep.java]
 * BabySheep subclass
 * Author: Josh Cai
 * Dec. 10, 2017
*/

class BabySheep extends Life{
  
  private int age;
  
  BabySheep(int health){
    super(health);
    this.age = 0;
  }
  
  public int returnAge(){
    return this.age;
  }
  
  public void eat(int food){
    addHealth(food);
  }
  
  public void hunger(){
    loseHealth(1);
  }
  
  public void grow(){
    this.age++;
  }
  
}