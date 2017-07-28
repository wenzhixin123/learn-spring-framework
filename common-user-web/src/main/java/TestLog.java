import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/7/28.
 */
public class TestLog {
    @Test
    public void test1(){
      Logger logger = LoggerFactory.getLogger(TestLog.class);
      logger.info("ahahahdhfhasdf");

    }

}
