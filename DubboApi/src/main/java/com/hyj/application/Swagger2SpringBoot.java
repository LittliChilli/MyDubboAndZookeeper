//package com.hyj.application;
//import javax.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.ExitCodeGenerator;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.core.convert.support.GenericConversionService;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@EnableAutoConfiguration
//@SpringBootApplication
//@EnableSwagger2
//@EnableAsync
//@ComponentScan("com.hyj")
//public class Swagger2SpringBoot extends WebMvcConfigurerAdapter implements CommandLineRunner {//
//
//    @Override
//    public void run(String... arg0) throws Exception {
//        if ((arg0.length > 0) && arg0[0].equals("exitcode")) {
//            throw new ExitException();
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        new SpringApplication(Swagger2SpringBoot.class).run(args);
//    }
//
//    class ExitException extends RuntimeException implements ExitCodeGenerator {
//        private static final long serialVersionUID = 1L;
//
//        @Override
//        public int getExitCode() {
//            return 10;
//        }
//    }
//    
//    @Autowired
//    private RequestMappingHandlerAdapter handlerAdapter;
//
//    /**
//     * 增加字符串trim的功能
//     */
//    @PostConstruct
//    public void initEditableValidation() {
//        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handlerAdapter
//                .getWebBindingInitializer();
//        if (initializer.getConversionService() != null) {
//            GenericConversionService genericConversionService = (GenericConversionService) initializer
//                    .getConversionService();
//        }
//    }
//}