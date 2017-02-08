package com.jmp.dcm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.dcm.common.controller.BaseController;
import com.jmp.dcm.common.dto.ResponseData;

@RestController
@RequestMapping("/home")
public class HomeController extends BaseController {

	@RequestMapping(value = "/")
	public @ResponseBody ResponseData list() {
		return wrapResponse("Dummy Data return");
	}

}
