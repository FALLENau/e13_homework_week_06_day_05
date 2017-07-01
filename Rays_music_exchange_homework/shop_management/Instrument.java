package shop_management;
//Superclass, is that  what this is it?

public abstract class Instrument {

  String name;


  public Instrument(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
