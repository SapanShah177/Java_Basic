package org.java.config;

import javax.sql.DataSource;

import org.java.DAO.AppDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

	@Bean
	public DataSource getdataDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");

		return dataSource;
	}

	@Bean(name = "DAOBean")
	public AppDAOImpl AppDAO() {

		return new AppDAOImpl(getdataDataSource());
	}
}
