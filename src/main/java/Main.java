import com.sparkTutorial.rdd.WordCount;
import scala.Int;
import scala.collection.immutable.Map;

import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String [] args){

        Map<String, Object> map=WordCount.countWords();
       System.out.print(map.values());
    }
}
