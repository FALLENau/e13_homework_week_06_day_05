package shop_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable {

  String name;


  public Guitar(String name) {
    super(name);

  }

  public String playInstrument() {
    return "Hmmmmhmmmmmmmmhmm!";
  }
}
