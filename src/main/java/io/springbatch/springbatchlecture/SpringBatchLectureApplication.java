package io.springbatch.springbatchlecture;

import io.springbatch.springbatchlecture.config.*;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

import static org.springframework.context.annotation.ComponentScan.Filter;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan(
        excludeFilters = {
                @Filter(
                        type = FilterType.ANNOTATION,
                        classes = {Configuration.class}
                )
        }
)
@Import(JobLauncherConfiguration.class)
public class SpringBatchLectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchLectureApplication.class, args);
    }

}
