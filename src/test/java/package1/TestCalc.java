package package1;

//import org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCalc{

  int a = 6;
  int b = 7;

  @Test
   public void testCalc(){

     int c;
     c = Calc.add(a,b);

    assertEquals(a+b, c, "Sums don't match");

  }

}
