package com.penta.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void giveSuccess() {
        assert true;
    }

    @Test
    void giveFailure() {
        assert false;
    }

}
