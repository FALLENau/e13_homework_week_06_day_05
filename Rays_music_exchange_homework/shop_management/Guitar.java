package shop_management;
import behaviours.*;

public class Guitar extends Instrument implements Sellable {

  Double cost;


  public Guitar(String name, Double cost) {
    super(name);
    this.cost = cost;

  }

  public int getCost() {
    return this.cost;
  }

  // public String playInstrument() {
  //   return "Hmmmmhmmmmmmmmhmm!";
  // }


}
