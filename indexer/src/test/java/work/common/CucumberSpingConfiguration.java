package work.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import work.IndexerApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { IndexerApplication.class })
public class CucumberSpingConfiguration {}
