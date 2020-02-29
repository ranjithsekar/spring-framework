package jbr.spring5core.annotations;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = { CollectionsAnnoation.class })
public class CollectionsAnnotationTest {

	// keep the variable name same as bean variable name
	@Autowired
	private List<String> persons;

	// keep the variable name same as qualifier
	@Autowired
	private List<String> animals;

	// if variable name is different, then add Qualifier
	@Autowired
	@Qualifier("birds")
	private List<String> bird;

	@Autowired
	@Qualifier("vehicle")
	private List<String> vehicle;

	@Autowired
	@Qualifier("transport")
	private List<String> transport;

	@Autowired
	private List<Integer> ranks;

	@Autowired
	private List<Integer> ran;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Persons: " + persons);
		System.out.println("Animals: " + animals);
		System.out.println("Birds: " + bird);
		System.out.println("Vehicles: " + vehicle);
		System.out.println("Transport: " + transport);
		System.out.println("Rank: " + ranks);
		System.out.println("Ran: " + ran);
	}

}
