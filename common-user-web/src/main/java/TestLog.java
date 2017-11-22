import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2017/7/28.
 */
public class TestLog {
    @Test
    public void test1(){
      Logger logger = LoggerFactory.getLogger(TestLog.class);
      logger.info("ahahahdhfhasdf");

    }
    @Test
    public void test2() throws InvocationTargetException, IllegalAccessException {
        WarehouseOutEntity.Bulider bulider = new WarehouseOutEntity.Bulider("1234","123");
        WarehouseOutEntity warehouseOutEntity = bulider.companyCode("companyCode")
                                                        .expressCompany("expressCompany")
                                                        .expressListNo("expressListNo")
                                                        .submitOrderNo("submitNo").bulid();

        WarehouseEntity warehouseEntity = new WarehouseEntity();
        BeanUtils.copyProperties(warehouseEntity,warehouseOutEntity);
        System.out.println(warehouseEntity.toString());
    }

}
