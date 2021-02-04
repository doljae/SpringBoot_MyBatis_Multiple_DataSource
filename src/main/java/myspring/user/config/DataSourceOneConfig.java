package myspring.user.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceOneConfig {

	@Primary
	@Bean(name = "dataSource1")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "sqlSessionFactory1")
	public SqlSessionFactory sqlSessionFactoryBean(@Autowired @Qualifier("dataSource1") DataSource dataSource,
			ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setConfigLocation(applicationContext.getResource("classpath:myspring/user/config/SqlConfig1.xml"));
//		bean.setTypeAliasesPackage();
		bean.setMapperLocations(applicationContext.getResources("classpath:myspring/user/config/MovieMapper.xml"));
		return bean.getObject();
	}

	@Primary
	@Bean(name = "sqlSessionTemplate1")
	public SqlSessionTemplate sqlSessionTemplate(
			@Autowired @Qualifier("sqlSessionFactory1") SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

};