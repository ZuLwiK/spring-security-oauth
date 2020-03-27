package com.baeldung.jwt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.baeldung.jwt.JWTClientApplication;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = { JWTClientApplication.class })
public class ContextIntegrationTest {

    @Test
    public void whenLoadApplication_thenSuccess() {

    }

}