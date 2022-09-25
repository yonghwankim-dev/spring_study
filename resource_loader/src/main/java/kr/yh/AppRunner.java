package kr.yh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ResourceLoader resourceLoader;

    // ApplicationContext는 ResourceLoader를 상속받았기 때문에 getResource로 자원 접근이 가능함
    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Resource resource1 = resourceLoader.getResource("classpath:test.txt");
        Resource resource2 = applicationContext.getResource("classpath:test.txt");

        System.out.println(resource1.exists());
        System.out.println(resource2.exists());

        String s = Files.readString(Path.of(resource1.getURI()));
        System.out.println(s);

    }
}
