package me.xueyao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("me.xueyao.mapper")
@SpringBootApplication
public class DuGuSpringBootMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuGuSpringBootMybatisPlusApplication.class, args);
    }

}
