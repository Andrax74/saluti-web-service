package com.xantrix.webapp.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@Log
@RestController
@RequestMapping("/api/saluti")
public class SalutiController 
{
	@GetMapping()
	public ResponseEntity<InfoMsg> getSaluti() throws UnknownHostException
	{
		String hostName = InetAddress.getLocalHost().getHostName();
		
		String message = String.format("Saluti sono la tua prima web api in cloud dalla VM %s", hostName);
		
		log.info("Usato end point di base");
		return new ResponseEntity<InfoMsg>(new InfoMsg("101", message), HttpStatus.OK);
	}
	
	/*
	@GetMapping(value = "{name}",produces = "application/json")
	public ResponseEntity<InfoMsg> getSaluti2(@PathVariable("name") String Name) 
			throws UnknownHostException	 
	{
		 
	    String hostName = InetAddress.getLocalHost().getHostName();
	    
	    String message = String.format("Saluti %s, sono la tua web api aggiornata 2 in cloud dalla VM %s",Name, hostName);
	    
		return new ResponseEntity<InfoMsg>(new InfoMsg("101", message), HttpStatus.OK);
	} 
	*/
	
}
