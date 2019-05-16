//package com.bzh.floodserver.core.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//
///**
// * 数据库连接池配置
// */
////@Configuration
//public class DataConfig {
//
//	private static final Logger logger = LoggerFactory.getLogger(DataConfig.class);
//
//	@Value("${spring.datasource.initialSize}")
//	private int initialSize;
//
//	@Value("${spring.datasource.minIdle}")
//	private int minIdle;
//
//	@Value("${spring.datasource.maxActive}")
//	private int maxActive;
//
//	@Value("${spring.datasource.maxWait}")
//	private long maxWait;
//
//	@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
//	private long timeBetweenEvictionRunsMillis;
//
//	@Value("${spring.datasource.minEvictableIdleTimeMillis}")
//	private long minEvictableIdleTimeMillis;
//
//	@Value("${spring.datasource.testWhileIdle}")
//	private boolean testWhileIdle;
//
//	@Value("${spring.datasource.testOnBorrow}")
//	private boolean testOnBorrow;
//
//	@Value("${spring.datasource.testOnReturn}")
//	private boolean testOnReturn;
//
//	@Value("${spring.datasource.poolPreparedStatements}")
//	private boolean poolPreparedStatements;
//
//	@Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
//	private int maxPoolPreparedStatementPerConnectionSize;
//
//	@Value("${spring.datasource.filters}")
//	private String filters;
//
//	@Value("${spring.datasource.connectionProperties}")
//	private String connectionProperties;
//
//	@Bean
//	@Primary
//	public DataSource dataSource() {
//		DruidDataSource ds = new DruidDataSource();
//		ds.setInitialSize(initialSize); //初始化大小
//		ds.setMinIdle(minIdle);
//		ds.setMaxActive(maxActive);
//		ds.setMaxWait(maxWait);
//		ds.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//		ds.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//		ds.setTestWhileIdle(testWhileIdle);
//		ds.setTestOnBorrow(testOnBorrow);
//		ds.setTestOnReturn(testOnReturn);
//		ds.setPoolPreparedStatements(poolPreparedStatements);
//		ds.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
//		try {
//			ds.setFilters(filters);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		ds.setConnectionProperties(connectionProperties);
//		return ds;
//	}
//
//	@Bean
//	public ServletRegistrationBean druidServlet() {
//		logger.info("init Druid Servlet Configuration ");
//		ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
//		// IP白名单
//		servletRegistrationBean.addInitParameter("allow", "192.168.1.205,127.0.0.1");
//		// IP黑名单(共同存在时，deny优先于allow)
//		servletRegistrationBean.addInitParameter("deny", "192.168.1.100");
//		//控制台管理用户
//		servletRegistrationBean.addInitParameter("loginUsername", "admin");
//		servletRegistrationBean.addInitParameter("loginPassword", "djts");
//		//是否能够重置数据 禁用HTML页面上的“Reset All”功能
//		servletRegistrationBean.addInitParameter("resetEnable", "false");
//		return servletRegistrationBean;
//	}
//
//
//	@Bean
//	public FilterRegistrationBean filterRegistrationBean() {
//		FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>(new WebStatFilter());
//		filterRegistrationBean.addUrlPatterns("/*");
//		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//		return filterRegistrationBean;
//	}
//}
