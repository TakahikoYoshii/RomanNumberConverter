package ReversePolish;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReversePolishTest {

    @Before
    public void setUp(){
    }

    @Test
    public void test������łP����͂����琔���̂P��Ԃ�() {
      ReversePolish reversepolish = new ReversePolish();
      int x = reversepolish.calc("1");
      assertEquals(1, x);  
    }
    @Test 
    public void test������ 
}
