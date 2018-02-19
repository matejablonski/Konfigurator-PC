package mj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mj.model.Memory;
import mj.service.MemoryService;


@Controller
public class MemoryController {
	@Autowired
	private MemoryService memoryService;
	
	@RequestMapping("/listaPamieci")
	public String setupForm(Map<String, Object> map){
		Memory memory = new Memory();
		map.put("memory", memory);
		map.put("memoryList", memoryService.getAllMemory());
		return "memory";
	}
	@RequestMapping(value="/memory.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Memory memory, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Memory memoryResult = new Memory();
		switch(action.toLowerCase()){
		case "add":
			memoryService.add(memory);
			memoryResult = memory;
			break;
		case "edit":
			memoryService.edit(memory);
			memoryResult = memory;
			break;
		case "delete":
			memoryService.delete(memory.getMemoryId());
			memoryResult = new Memory();
			break;
		case "search":
			Memory searchedMemory = memoryService.getMemory(memory.getMemoryId());
			memoryResult = searchedMemory!=null ? searchedMemory : new Memory();
			break;
		}
		map.put("memory", memoryResult);
		map.put("memoryList", memoryService.getAllMemory());
		return "memory";
	}
}
