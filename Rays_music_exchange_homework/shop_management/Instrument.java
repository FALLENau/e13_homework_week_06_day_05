package shop_management;
//Superclass, is that  what this is it?

public abstract class Instrument {

  String name;
  int cost;


  public Instrument(String name, int cost) {
    this.name = name;
    this.cost = cost;
  }

  public String getName() {
    return this.name;
  }

  public int getCost() {
    return this.cost;
  }

  

}
