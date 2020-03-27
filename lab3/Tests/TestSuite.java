package Tests;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Platform Suite Demo")
@SelectPackages("Tests")
@SelectClasses({

       TestSubstring.class,
        TestSolution.class,
       TestSolution2.class,
        TestSorting.class,
        TestMatrix.class


})
public class TestSuite {

}
