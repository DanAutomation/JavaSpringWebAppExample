package com.vebinar.config;

import javax.sql.DataSource;

import com.vebinar.service.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration   // after run application, firstly will start this class
@ComponentScan(basePackages = {"com.vebinar.service", "com.vebinar.Dao"})
public class SpringConfig {

    @Bean
    public TestBean getBean() {
        return new TestBean("sTring");
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {  // connection to JDBC
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {   // connection to data base
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/webinar?useSll=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

//    @Bean
//    public UserDao getUserDao(){
//        return new UserDaoImpl(getJdbcTemplate());
//    }

//    @Bean
//    public UserService getUserService() {
//        return new UserServiceImpl();
//    }
}
