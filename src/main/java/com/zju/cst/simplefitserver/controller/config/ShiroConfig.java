package com.zju.cst.simplefitserver.controller.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;


@Configuration
public class ShiroConfig {

  @Bean(name = "userShiroRealm")
  public UserShiroRealm getUserRealm() {

    return new UserShiroRealm();
  }

  @Bean(name = "userSecurityManager")
  public DefaultWebSecurityManager getUserWebSecurityManager(@Qualifier("userShiroRealm") UserShiroRealm userShiroRealm) {

    DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();

    securityManager.setRealm(userShiroRealm);
    return securityManager;
  }

  @Bean(name = "userShiroFilterFactoryBean")
  public ShiroFilterFactoryBean getUserShiroFilterFactoryBean(@Qualifier("userSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager) {

    ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

    shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);

        /*
            添加过滤器拦截(url)
                常用过滤器
                    anon: 无需拦截
                    authc: 必须认证才能访问
                    user: 如果使用rememberMe的功能可以直接访问
                    perms: 该资源必须得到资源权限才可以访问
                    role: 该资源必须得到角色权限才可以访问
         */


    Map<String, String> filterMap = new LinkedHashMap<String, String>();

    filterMap.put("/user/*/info", "authc");
    filterMap.put("company/*/info", "authc");


        /*

            或者
            filterMap.put("/company/*","authc");
            放行某个请求  filterMap.put("/company/login","anon");


         */


    //设置登录页面，authc没通过会跳转

    shiroFilterFactoryBean.setLoginUrl("/user/unlogin");

    shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);

    return shiroFilterFactoryBean;

  }


}
