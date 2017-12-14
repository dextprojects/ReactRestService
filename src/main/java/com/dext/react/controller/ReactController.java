package com.dext.react.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dext.react.dto.StudentDTO;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/react/service")
@Import(com.dext.react.RootConfig.class)
public class ReactController {

	@RequestMapping(value = "/getTableData/", method = RequestMethod.GET)
	@ResponseStatus(code = HttpStatus.OK)
	public @ResponseBody Object getLeaves() throws Exception {
		System.out.println("Hit");
		List<StudentDTO> list = new ArrayList<>();
		StudentDTO s = new StudentDTO();
		s.setId(1);
		s.setName("Deep");
		s.setAge(24);
		list.add(s);
		return list;
	}

}
