package mj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mj.model.Processor;
import mj.service.ProcessorService;


@Controller
public class ProcessorController {
	@Autowired
	private ProcessorService processorService;
	
    @RequestMapping("/index") 
    public String startPage(){
        return "index"; 
    }
	
	@RequestMapping("/listaProcesorow")
	public String setupForm(Map<String, Object> map){
		Processor processor = new Processor();
		map.put("processor", processor);
		map.put("processorList", processorService.getAllProcessor());
		return "processor";
	}
	@RequestMapping(value="/processor.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Processor processor, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Processor processorResult = new Processor();
		switch(action.toLowerCase()){
		case "add":
			processorService.add(processor);
			processorResult = processor;
			break;
		case "edit":
			processorService.edit(processor);
			processorResult = processor;
			break;
		case "delete":
			processorService.delete(processor.getProcessorId());
			processorResult = new Processor();
			break;
		case "search":
			Processor searchedProcessor = processorService.getProcessor(processor.getProcessorId());
			processorResult = searchedProcessor!=null ? searchedProcessor : new Processor();
			break;
		}
		map.put("processor", processorResult);
		map.put("processorList", processorService.getAllProcessor());
		return "processor";
	}
}
