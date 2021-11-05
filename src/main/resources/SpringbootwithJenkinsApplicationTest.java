import org.slf4j.LoggerFactory;

import com.example.demo.SpringbootwithJenkinsApplication;

import ch.qos.logback.classic.Logger;

@runwith(springrunner.class)
@springbootTest
public class SpringbootwithJenkinsApplicationTest {
	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringbootwithJenkinsApplicationTest.class);
	
	@test
	public void test() {
		logger.info("application started..");
		assetEquals(true,true);
	}

}
