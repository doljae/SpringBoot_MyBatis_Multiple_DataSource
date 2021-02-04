//package myspring.user.config;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Scope;
//
//@Configuration
//public class DataSourceTwoConfig {
//
//	@Bean(name = "dataSource2")
//	@ConfigurationProperties(prefix = "spring.datasource2")
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().build();
//	}
//
//	@Bean(name = "sqlSessionFactory2")
//	public SqlSessionFactory sqlSessionFactoryBean(@Autowired @Qualifier("dataSource2") DataSource dataSource,
//			ApplicationContext applicationContext) throws Exception {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		bean.setDataSource(dataSource);
//		bean.setConfigLocation(applicationContext.getResource("classpath:myspring/user/config/SqlConfig2.xml"));
////		bean.setTypeAliasesPackage();
//		bean.setMapperLocations(applicationContext.getResources("classpath:myspring/user/config/UserMapper.xml"));
//		return bean.getObject();
//	}
//
//	@Bean(name = "sqlSessionTemplate2")
//	public SqlSessionTemplate sqlSessionTemplate(
//			@Autowired @Qualifier("sqlSessionFactory2") SqlSessionFactory sqlSessionFactory) {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
//
//};