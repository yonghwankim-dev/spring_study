package kr.yh;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class SimpleEventServiceTest {
    @Autowired
    private EventService eventService;

    @Test
    public void testCreatedEvent(){
        eventService.createEvent();
    }

    @Test
    public void testPublishedEvent(){
        eventService.publishEvent();
    }
}
