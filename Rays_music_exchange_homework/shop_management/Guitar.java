package shop_management;
import behaviours.*;

public class Guitar extends Instrument implements Sellable, Playable {

  int cost;


  public Guitar(String name, int cost) {
    super(name, cost);
  }

  public int calculateMarkup() {
    // note add calculateMarkup method
  }

  public String playInstrument() {
    return "Hmmmmhmmmmmmmmhmm!";
  }

}
