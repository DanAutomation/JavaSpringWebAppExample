package com.vebinar.config;

import javax.sql.DataSource;

import com.vebinar.Dao.UserDao;
import com.vebinar.Dao.UserDaoImpl;
import com.vebinar.service.TestBean;
import com.vebinar.service.UserService;
import com.vebinar.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.vebinar.service", "com.vebinar.Dao"})
public class SpringConfig {

    @Bean
    public TestBean getTestBean() {
        return new TestBean("test_name");
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
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
