package ro.ase.cts.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.tests.categories.TesteGetPromovabilitate;
import ro.ase.cts.tests.categories.TesteNormale;

@RunWith(Categories.class)
@SuiteClasses({ DummyTests.class, FakeTests.class, GrupaTests.class, 
	GrupaTestsSetUp.class, StubTests.class })
@IncludeCategory(TesteGetPromovabilitate.class)
@ExcludeCategory(TesteNormale.class)
public class SuitaCostum {

}
