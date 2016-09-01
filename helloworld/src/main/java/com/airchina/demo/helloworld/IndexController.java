/**
 * 
 */
package com.airchina.demo.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dengdeying
 *
 */
@Controller
@EnableAutoConfiguration
public class IndexController {
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "hello here!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(IndexController.class, args);
	}
}
