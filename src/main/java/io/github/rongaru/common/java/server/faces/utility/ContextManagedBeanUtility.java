package io.github.rongaru.common.java.server.faces.utility;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.context.spi.AlterableContext;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;

import java.util.List;

import io.github.rongaru.common.java.server.faces.scope.CustomSessionScopedDataModelJSF;

public class ContextManagedBeanUtility {

	public static < T > T constructContextManagedBean( BeanManager beanManager, Class< T > managedBeanClass ) {
		Bean< ? > bean = beanManager.resolve( beanManager.getBeans( managedBeanClass ) );
		CreationalContext< ? > creationContext = beanManager.createCreationalContext( bean );
		Object beanInstance = beanManager.getReference( bean, managedBeanClass, creationContext );
		creationContext.release( );
		return ( T ) beanInstance;
	}

	public static < T > void destroyContextManagedBean( BeanManager beanManager, Class< T > managedBeanClass ) {
		Bean< ? > bean = beanManager.resolve( beanManager.getBeans( managedBeanClass ) );
		AlterableContext alterableContext = ( AlterableContext ) beanManager.getContext( bean.getScope( ) );
		alterableContext.destroy( bean );
	}

	public static < T > T destroyAndConstructContextManagedBean( BeanManager beanManager, Class< T > managedBeanClass ) {
		Bean< ? > bean = beanManager.resolve( beanManager.getBeans( managedBeanClass ) );
		AlterableContext alterableContext = ( AlterableContext ) beanManager.getContext( bean.getScope( ) );
		alterableContext.destroy( bean );

		CreationalContext< ? > creationContext = beanManager.createCreationalContext( bean );
		Object beanInstance = beanManager.getReference( bean, managedBeanClass, creationContext );
		creationContext.release( );
		return ( T ) beanInstance;
	}

	public static void destroyUselessSessionScopedDataModelJSFManagedBeansNotIn( BeanManager beanManager, List< Class > protectedDataModelJSFClasses ) {
		AlterableContext alterableContext = ( AlterableContext ) beanManager.getContext( SessionScoped.class );
		for ( Bean contextMangedBean: beanManager.getBeans( CustomSessionScopedDataModelJSF.class ) ) {
			Class contextMangedBeanClass = contextMangedBean.getBeanClass( );
			if ( !protectedDataModelJSFClasses.contains( contextMangedBeanClass ) ) {
				alterableContext.destroy( contextMangedBean );
			}
		}
	}

}
