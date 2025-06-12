package com.github.leeyazhou.trip.mcp.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@RequestMapping("/chat")
	public String chat(@RequestParam(value = "msg", defaultValue = "今天天气如何？") String msg) {
		return null;
	}

}