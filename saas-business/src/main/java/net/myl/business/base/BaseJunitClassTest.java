package net.myl.business.base;


import net.myl.business.SpringBootApplicationStarter;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest(classes = SpringBootApplicationStarter.class)
public class BaseJunitClassTest extends AbstractTestNGSpringContextTests {

}
