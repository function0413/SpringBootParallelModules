package com.shunge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/***
 * created by fangshun 2018/04/25
 */

/**
 * 不懂为什么依赖jar项目里也要加启动类,如果不加,可以生成war包,也可以启动运行,但是build的时候会报找不到启动类的错误
 * 希望广大码友能给予理论解释,或者给出更好的解决方法
 */
@SpringBootApplication
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
