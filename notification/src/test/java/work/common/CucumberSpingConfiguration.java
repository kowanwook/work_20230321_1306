package work.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import work.NotificationApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotificationApplication.class })
public class CucumberSpingConfiguration {}
