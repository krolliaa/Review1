package com.kk.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 参数设置优先级：代码优先级 > 设置中的 VM Options 优先级 >
        // resources/config/application.properties > resources/config/application.yml > resources/config/application.yaml >
        // application.properties > application.yml > application.yaml

        // 若运行的是打包文件，优先级如下：
        // 硬编码方式 > 临时设置 >
        // 跟 jar 包相同路径下的 config/application.properties[8086] > 跟 jar 包相同路径下的 config/application.yml[8087] > 跟 jar 包相同路径下的 config/application.yaml[8088]
        // resources/config/application.properties[8083] > resources/config/application.yml[8084] > resources/config/application.yaml[8085]
        // resources/application.properties[8080] > resources/application.yml[8081] > resources/application.yaml[8082]
        // 结果在 8086 端口运行

        // 如果有设置 spring.config.name=ebank,application,ebank-server 【都在 resources 目录下】
        // 那么此时的优先级为：ebank-server > application > ebank
        // 如果存在 resources/config 目录或者更高的，则优先级依然是 jar同级config/ > resources/config > resources 这个是大前提
        // 最后才是小前提：spring.config.name 并且仍然遵循 properties > yml > yaml 规则
        // 比如在 resources/config 目录中有 ebank ebank-server，设置仍然为
        // 则优先级为：
        // 硬编码方式 > 临时设置 > 跟 jar 包相同路径下的 config/ebank-server.yml[8092] > 跟 jar 包相同路径下的 config/ebank.yml[8091]
        // 跟 jar 包相同路径下的 config/application.properties[8086] > 跟 jar 包相同路径下的 config/application.yml[8087] > 跟 jar 包相同路径下的 config/application.yaml[8088]
        // resources/config/application.properties[8083] > resources/config/application.yml[8084] > resources/config/application.yaml[8085]
        // resources/application.properties[8080] > resources/application.yml[8081] > resources/application.yaml[8082]
        // 结果在 8086 端口运行

        //最后还可以指定特定的配置文件，这种优先级的方式比硬编码方式低但是比临时编码的方式高，就是我指定是你，除了硬编码我谁都不用管
        //不过如果定义了多个，仍然是最后一个配置文件的优先级最高
        String[] arg = {"--server.port=9528", "--a=b"};
        SpringApplication.run(Application.class, arg);
    }

}
