package mj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mj.model.GraphicsCard;
import mj.service.GraphicsCardService;


@Controller
public class GraphicsCardController {
	@Autowired
	private GraphicsCardService graphicsCardService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		GraphicsCard graphicsCard = new GraphicsCard();
		map.put("graphicsCard", graphicsCard);
		map.put("graphicsCardList", graphicsCardService.getAllGraphicsCard());
		return "graphicsCard";
	}
	@RequestMapping(value="/graphicsCard.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute GraphicsCard graphicsCard, BindingResult result, @RequestParam String action, Map<String, Object> map){
		GraphicsCard graphicsCardResult = new GraphicsCard();
		switch(action.toLowerCase()){
		case "add":
			graphicsCardService.add(graphicsCard);
			graphicsCardResult = graphicsCard;
			break;
		case "edit":
			graphicsCardService.edit(graphicsCard);
			graphicsCardResult = graphicsCard;
			break;
		case "delete":
			graphicsCardService.delete(graphicsCard.getGraphicsCardId());
			graphicsCardResult = new GraphicsCard();
			break;
		case "search":
			GraphicsCard searchedGraphicsCard = graphicsCardService.getGraphicsCard(graphicsCard.getGraphicsCardId());
			graphicsCardResult = searchedGraphicsCard!=null ? searchedGraphicsCard : new GraphicsCard();
			break;
		}
		map.put("graphicsCard", graphicsCardResult);
		map.put("graphicsCardList", graphicsCardService.getAllGraphicsCard());
		return "graphicsCard";
	}
}
