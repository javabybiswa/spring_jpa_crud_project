package com.biswa;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
@EnableJpaRepositories("com.*")
public class SpringJpaConfiguration {

	@Bean
	   
	    public DataSource getDataSource() {
		 
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		  
		 datasource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		 datasource.setUsername("system");
		 datasource.setPassword("tiger");
		  
		  return datasource;
		 }
	  @Bean("entityManagerFactory")
	     
	       LocalContainerEntityManagerFactoryBean createEntityManagerFactory() {
	  
		  LocalContainerEntityManagerFactoryBean factory=new LocalContainerEntityManagerFactoryBean();
		   
		     factory.setDataSource(getDataSource());
		     factory.setPackagesToScan("com.*");
		     factory.setJpaProperties(hibernateProperties());
		     
		     HibernateJpaVendorAdapter adapter=new HibernateJpaVendorAdapter();
		     
		        factory.setJpaVendorAdapter(adapter);
		     
		        return factory;
	       }
	           @Bean("transactionManager")
	           
	                 public PlatformTransactionManager createTransactionManager() {
	        	   
	        	   JpaTransactionManager transacctionmanager=new JpaTransactionManager();
	        	    
	        	   transacctionmanager.setEntityManagerFactory(createEntityManagerFactory().getObject());
	        	     return transacctionmanager;
	           }
	              Properties hibernateProperties() {
	            	    
	            	   Properties  hibernateProperties=new Properties();
	            	  
	            	   hibernateProperties.setProperty("hibernate.hbm2ddl.auto","update");
	            	   hibernateProperties.setProperty("hibernate.show_sql","true");
	            	   
	            	   return  hibernateProperties;
	              }
}
