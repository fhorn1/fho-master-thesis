package org.goafabric.personservice;

import org.goafabric.personservice.persistence.DatabaseProvisioning;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.nativex.hint.InitializationHint;
import org.springframework.nativex.hint.InitializationTime;
import org.springframework.nativex.hint.NativeHint;


/**
 * Created by amautsch on 26.06.2015.
 */

@SpringBootApplication
@NativeHint(trigger = org.flywaydb.core.Flyway.class,
        initialization = {
            @InitializationHint(types = {
                    org.flywaydb.core.internal.util.FeatureDetector.class,
                    org.flywaydb.core.internal.logging.log4j2.Log4j2LogCreator.class
            },
                    initTime = InitializationTime.BUILD)})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner init(ApplicationContext context, DatabaseProvisioning databaseProvisioning) {
        return args -> {
            databaseProvisioning.run();
            if ((args.length > 0) && ("-check-integrity".equals(args[0]))) { SpringApplication.exit(context, () -> 0);}
        };

    }

}
