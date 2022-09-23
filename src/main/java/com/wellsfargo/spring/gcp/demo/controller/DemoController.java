/**
 * 
 */
package com.wellsfargo.spring.gcp.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tapas
 *
 */
@RestController
public class DemoController {
	
	@GetMapping("/getHostName")
	public String getHostName() {
		try {
			return "Host Name: " + InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			return "Host Not Found";
		}
	}

}
