import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("Yamaha F310 Acoustic Guitar");
  }

@Test
public void guitarHasName() {
  assertEquals("Yamaha F310 Acoustic Guitar", guitar.getName());
  }

  public String playGuitar(){
    return "Hmmmmhmmmmmmmmhmm!";
  }
}
