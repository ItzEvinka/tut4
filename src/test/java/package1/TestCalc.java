package package1;

//import org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCalc{

  int a = 6;
  int b = 7;

  @Test
   public void testCalc(){
    assertEquals(a+b, Calc.add(a,b), "Sums don't match");
  }

  @Test
  public void testSubstract(){
    assertEquals(a-b, Calc.substract(a, b), "Substractions don't match");
  }

}
