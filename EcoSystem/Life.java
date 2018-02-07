/*
 * [Life.java]
 * Life superclass
 * Author: Josh Cai
 * Dec. 10, 2017
*/

abstract class Life implements Comparable<Life>{

  private int health;
  private boolean move;
  
  Life(int health){
    this.health = health;
    this.move = true;
  }
  
  public boolean returnMove(){
    return this.move;
  }
  
  public void changeMove(boolean b){
    this.move = b;
  }
  
  public int returnHealth(){
    return this.health;
  }
  
  public void addHealth(int change){
    this.health = this.health + change;
  }
  
  public void loseHealth(int change){
    this.health = this.health - change;
  }
  
  public void eat(int food){
  }
  abstract void hunger();
  
  public int compareTo(Life w){
    if(this.health < w.returnHealth()){
      return -1;
    }
    else if (this.health > w.returnHealth()){
      return 1;
    }
    else {
      return 0;
    }
  }
  
  public int returnAge(){
    return 0;
  }
  public void grow(){}
  
}