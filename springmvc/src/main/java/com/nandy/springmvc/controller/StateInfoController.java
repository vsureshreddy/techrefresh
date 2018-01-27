package com.nandy.springmvc.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.asm.TypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nandy.springmvc.model.StateInfo;

@RestController
@RequestMapping("/states")
public class StateInfoController {
	
	Log log = LogFactory.getLog(StateInfoController.class);
	
	//@RequestMapping(method = RequestMethod.GET )
	@GetMapping()
	public ModelAndView showStatesForm() {
		log.debug("showStatesForm called");
		ModelAndView modelAndView = new ModelAndView("getStates");
		modelAndView.addObject("country", new String());
		return modelAndView;
	}
	
	@RequestMapping(value = "/byCountry", method = RequestMethod.POST)
	public List<StateInfo> getAllStates(@RequestParam String country) {
		log.debug("getAllStates called for "+country);
		String url = "http://services.groupkt.com/state/get/"+country+"/all";
		
		RestTemplate restTemplate = new RestTemplate();
		@SuppressWarnings("unchecked")
		ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(url, Object[].class);
		log.debug(""+responseEntity);
		ObjectMapper mapper = new ObjectMapper();
		List<StateInfo> stateInfoList = null;
				//mapper.readValues(responseEntity.getBody(), new com.fasterxml.jackson.core.type.TypeReference() {};<List<StateInfo>><List<StateInfo>>(){});
		log.debug("StateInfo : "+stateInfoList);
		return stateInfoList;
	}

}
