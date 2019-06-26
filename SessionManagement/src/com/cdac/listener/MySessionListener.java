/**
 * 
 */
package com.cdac.listener;

import java.util.Date;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author HP
 *
 */
public class MySessionListener implements HttpSessionListener{

	/**
	 * 
	 */
	public MySessionListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Session Created at:"+new Date());
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Session detroyed at:"+new Date());
		
	}

}
