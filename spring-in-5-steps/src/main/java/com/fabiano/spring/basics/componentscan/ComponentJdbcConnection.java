package com.fabiano.spring.basics.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//only prototype does not assure it will give different bean each time. create a proxy
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {
	public ComponentJdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
