package ro.ase.cts.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DummyTests.class, FakeTests.class, GrupaTests.class, 
	GrupaTestsSetUp.class, StubTests.class })
public class AllTests {
	
}
