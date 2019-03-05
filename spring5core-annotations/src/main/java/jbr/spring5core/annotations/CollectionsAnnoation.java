package jbr.spring5core.annotations;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionsAnnoation {

	@Bean
	public List<String> persons() {
		return Arrays.asList(new String[] { "Ram", "Raja" });
	}

	@Bean(name = "animals")
	public List<String> animals() {
		return Arrays.asList(new String[] { "Tiger", "Lion" });
	}

	@Bean(name = { "vehicle", "transport" })
	public List<String> vehichles() {
		return Arrays.asList(new String[] { "Car", "Bus" });
	}

	@Bean
	@Qualifier("birds")
	public List<String> birds() {
		return Arrays.asList(new String[] { "Crow", "Peacock" });
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public List<Integer> rank() {
		return Arrays.asList(new Integer[] { 1, 2, 3 });
	}
}
