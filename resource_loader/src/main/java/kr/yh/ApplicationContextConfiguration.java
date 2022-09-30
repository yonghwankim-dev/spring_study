package kr.yh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

@Component
public class ApplicationContextConfiguration {
    @Bean
    public ClassPathXmlApplicationContext classPathXmlApplicationContext(){
        return new ClassPathXmlApplicationContext();
    }

    @Bean
    public FileSystemXmlApplicationContext fileSystemXmlApplicationContext(){
        return new FileSystemXmlApplicationContext();
    }

}
