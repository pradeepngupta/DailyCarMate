package com.dailycarmate.basecomponent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycarmate.basecomponent.codes.ResponseData;

@RestController
@RequestMapping("/")
public class HomeController extends BaseController {

	public @ResponseBody ResponseData list() {
		return wrapResponse("Dummy Data return");
	}

}
