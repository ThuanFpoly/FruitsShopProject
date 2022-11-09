package com.tin.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.status.StatusConsoleListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tin.entity.Account;
import com.tin.service.AccountService;

@Controller
public class test {
	
	@Autowired
	static HttpSession session;
	

	
	private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) {
		
	}
	@RequestMapping("/checkout")
	public String test5() {
		return "user/checkout";
	}

	@RequestMapping("/contact")
	public String test8() {
		return "user/contact";
	}

	@RequestMapping("/detailorder")
	public String test12() {
		return "user/detailorder";
	}
	@RequestMapping("/listorder")
	public String test13() {
		return "user/listorder";
	}

}
