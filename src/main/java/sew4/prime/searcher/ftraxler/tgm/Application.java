package sew4.prime.searcher.ftraxler.tgm;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import sew4.prime.searcher.ftraxler.tgm.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-04-19
 * @project sew4-prime-searcher-ftraxler-tgm
 */

@SpringBootApplication
public class Application {



    public static void main(String[] args){
        SpringApplication.run(Application.class,args);

    }

}
