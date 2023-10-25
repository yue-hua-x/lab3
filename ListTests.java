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
  public void testReverseInPlace() {

    List<String> list = Arrays.asList("cookie", "is", "number", "1", "in", "every", "way", "possible");
    List<String> ans = Arrays.asList("cookie", "number", "every", "possible");
    assertEquals(ans, ListExamples.filter(list, new StringThing()));
  }

  @Test
  public void testMerge(){
    List<String> list1 = Arrays.asList("carrot", "potato", "tomato");
    List<String> list2 = Arrays.asList("chicken", "turkey", "wombat");

    List<String> ans = Arrays.asList("carrot", "chicken", "potato", "tomato", "turkey", "wombat");
    assertEquals(ans, ListExamples.merge(list1, list2));
  }
}
