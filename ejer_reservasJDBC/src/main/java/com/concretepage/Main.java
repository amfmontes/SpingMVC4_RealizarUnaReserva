/**
 * 
 */
package com.concretepage;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Curso mañana
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
		System.out.println(encoder.encode("m123"));
		
		
	}

}
