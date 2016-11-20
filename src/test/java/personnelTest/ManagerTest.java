package personnelTest;


import hrms.personal.Address;
import hrms.personal.Person;
import hrms.personnel.Manager;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;
import java.util.GregorianCalendar;


/**
 * Created by tony on 11/19/2016.
 */
public class ManagerTest {
    private static final Logger logger = Logger.getLogger(ManagerTest.class);

    //Basic constants
    private static final String TEST_NAME = "Test Name";
    private static final String TEST_SSN = "XXX-XX-XXXX";
    private static final String TEST_STREET = "Cool St.";
    private static final Date TEST_DATE = new GregorianCalendar(2016, 11, 18).getTime();

    @Test
    public void basicEmployeeTest(){
        logger.debug("Test Complete!");
    }
}
