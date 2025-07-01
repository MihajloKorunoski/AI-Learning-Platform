package uikt.project.webapplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import uikt.project.webapplication.web.UserController;

@SpringBootTest
class WebApplicationTests {

    @Autowired
    private UserController userController;

    @Test
    void contextLoads() {
        assertNotNull(userController);
    }

}
