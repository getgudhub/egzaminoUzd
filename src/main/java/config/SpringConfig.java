package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dao.PatiekalasDao;
import dao.PatiekalasDaoImpl;
import service.MeniuService;
import service.MeniuServiceImpl;

@Configuration
public class SpringConfig {

	@Bean
	public JdbcTemplate getJdbcTemplate(){
		return new JdbcTemplate(getDataSource());
	}
	
	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/duombaze");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}
	
	@Bean
	public PatiekalasDao getFilmDao() {
		return new PatiekalasDaoImpl(getJdbcTemplate());
	}
	
	@Bean
	public MeniuService getFoodService(){
		return new MeniuServiceImpl();
	}
}
