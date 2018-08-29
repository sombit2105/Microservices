package com.som.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.som.model.*;

/*@Controller
public class MySMSController {
	
	@RequestMapping(value = "/smsDetails", method = RequestMethod.GET)
	@ResponseBody
	public String smsDetails(){
	//	public SMS smsDetails(@RequestParam("receiver") String receiver){
		SMS sms = new SMS();
		sms.setMessage("Hello..how r u doing!!");
		sms.setPhoneNumber("9901530041");
		sms.setReceiver("sowmya");
		
		
		return "Hii";
		
	}*/

@RestController
public class MySMSController {
	
	
	@Autowired
	public SMS sms;
	
	@GetMapping("/smsDetails")
	public SMS smsDetails(){
	//	public SMS smsDetails(@RequestParam("receiver") String receiver){
		sms.setMessage("Hello..how r u doing!!");
		sms.setPhoneNumber("9901530041");
		sms.setReceiver("sowmya");
		
		return sms;
		
	}
	
/*	public SMS getSms() {
		return sms;
	}
	@Autowired
	public void setSms(SMS sms) {
		this.sms = sms;
	}*/

}
