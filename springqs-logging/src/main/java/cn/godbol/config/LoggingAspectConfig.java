//package cn.godbol.config;
//
//import cn.godbol.aop.FindAspect;
//import cn.godbol.aop.LoggingAspect;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.core.env.Environment;
//
///**
// * Created by li on 17-3-12.
// */
//@Configuration
//@EnableAspectJAutoProxy
//public class LoggingAspectConfig {
//    @Bean
//    public FindAspect findAspect(){
//        return new FindAspect();
//    }
//
//    @Bean
//    public LoggingAspect loggingAspect(Environment environment){
//        return new LoggingAspect(environment);
//    }
//}
