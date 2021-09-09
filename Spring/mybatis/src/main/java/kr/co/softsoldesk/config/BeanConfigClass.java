package kr.co.softsoldesk.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.mapper.MapperInterface;

@Configuration
@ComponentScan(basePackages="kr.co.softsoldesk.beans")
public class BeanConfigClass {
	//Data source
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource source=new BasicDataSource();
		
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("system");
		source.setPassword("12341234");
		
		return source;
	}
	
	//SqlSessionFactory=JDBC를 처리하는 객체
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception {
		//SqlSessionFactoryBean=SqlSessionFactory를 만들기 위함
		SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
		
		factoryBean.setDataSource(source);
		
		SqlSessionFactory factory=factoryBean.getObject();
		
		return factory;
	}
	
	//Mapper
	@Bean
	public MapperFactoryBean<MapperInterface> test_mapper(SqlSessionFactory factory) throws Exception {
		MapperFactoryBean<MapperInterface> factoryBean=new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		
		factoryBean.setSqlSessionFactory(factory); //DB 연결
		
		return factoryBean; //sql query
	}
}
