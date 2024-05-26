package dev.fmartinez.practiceprometheus.config;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimedConfiguration {
    /**
     * To enable the @Timed annotation to work as you would like it to, you probably need to configure a TimedAspect bean.
     *
     * @param registry MeterRegistry
     * @return TimedAspect
     */
    @Bean
    public TimedAspect timedAspect(MeterRegistry registry) {
        return new TimedAspect(registry);
    }
}
