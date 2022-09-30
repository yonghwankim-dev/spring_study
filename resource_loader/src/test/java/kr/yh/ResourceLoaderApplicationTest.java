package kr.yh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ResourceLoaderApplicationTest {
    @Qualifier("webApplicationContext")
    @Autowired
    private ApplicationContext ctx;
    @Autowired
    private ClassPathXmlApplicationContext classPathCtx;
    @Autowired
    private FileSystemXmlApplicationContext fileSystemCtx;
    @Autowired
    private WebApplicationContext webCtx;

    @Test
    public void getResource(){
        //given
        String location = "test.txt";
        //when
        Resource res1 = ctx.getResource(location);
        Resource res2 = classPathCtx.getResource(location);
        Resource res3 = fileSystemCtx.getResource(location);
        Resource res4 = webCtx.getResource(location);
        //then
        System.out.println("res1 : " + res1);
        System.out.println("res2 : " + res2);
        System.out.println("res3 : " + res3);
        System.out.println("res4 : " + res4);
    }

    @Test
    public void getResource_withPrefix_classpath(){
        //given
        String location = "classpath:test.txt";
        //when
        Resource res1 = ctx.getResource(location);
        Resource res2 = classPathCtx.getResource(location);
        Resource res3 = fileSystemCtx.getResource(location);
        Resource res4 = webCtx.getResource(location);
        //then
        System.out.println("res1 : " + res1);
        System.out.println("res2 : " + res2);
        System.out.println("res3 : " + res3);
        System.out.println("res4 : " + res4);
    }

    @Test
    public void getResource_withPrefix_file(){
        //given
        String location = "file:test.txt";
        //when
        Resource res1 = ctx.getResource(location);
        Resource res2 = classPathCtx.getResource(location);
        Resource res3 = fileSystemCtx.getResource(location);
        Resource res4 = webCtx.getResource(location);
        //then
        System.out.println("res1 : " + res1);
        System.out.println("res2 : " + res2);
        System.out.println("res3 : " + res3);
        System.out.println("res4 : " + res4);
    }

    @Test
    public void getResource_withPrefix_https(){
        //given
        String location = "https:test.txt";
        //when
        Resource res1 = ctx.getResource(location);
        Resource res2 = classPathCtx.getResource(location);
        Resource res3 = fileSystemCtx.getResource(location);
        Resource res4 = webCtx.getResource(location);
        //then
        System.out.println("res1 : " + res1);
        System.out.println("res2 : " + res2);
        System.out.println("res3 : " + res3);
        System.out.println("res4 : " + res4);
    }
}