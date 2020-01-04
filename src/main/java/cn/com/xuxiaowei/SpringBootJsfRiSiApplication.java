package cn.com.xuxiaowei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

import javax.servlet.ServletContainerInitializer;

/**
 * 程序执行入口
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@SpringBootApplication
public class SpringBootJsfRiSiApplication {

    public static void main(String[] args) {

//        ServletContainerInitializer
//        SpringServletContainerInitializer

        SpringApplication.run(SpringBootJsfRiSiApplication.class, args);
    }

}
