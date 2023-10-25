import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

/*public class StringThing implements StringChecker{
      boolean checkString(String s){
        return s.length() > 3;
      }
    }*/

public class ListTests {
  @Test 
  public void testPrepend() {
    LinkedList test = new LinkedList();
    test.prepend(1);
    test.prepend(2);
    assertEquals("2 1", test.toString());
  }

  @Test
  public void testAppend(){
    assertEquals(ans, ListExamples.merge(list1, list2));
  }
}
