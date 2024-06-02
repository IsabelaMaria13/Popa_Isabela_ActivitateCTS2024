package tests.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.PachetTuristicTest;
import tests.PersoanaTest;
import tests.categorii.Mock;
import tests.categorii.WithoutMock;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(WithoutMock.class)
public class SuitaCustom {
}
