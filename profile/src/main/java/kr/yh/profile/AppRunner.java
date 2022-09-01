package kr.yh.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext ctx;

    @Autowired
    TestBookRepository testBookRepository;

    @Autowired
    BookRepository bookRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //given
        Environment environment = ctx.getEnvironment();
        //when
        String[] activeProfiles  = environment.getActiveProfiles();
        String[] defaultProfiles = environment.getDefaultProfiles();
        //then
        System.out.println(Arrays.toString(activeProfiles)); // [test]
        System.out.println(Arrays.toString(defaultProfiles)); // [default]
    }
}
