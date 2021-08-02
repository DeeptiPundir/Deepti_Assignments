package deepti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleinterestController {
	

	
	@RequestMapping(value="/login" , method = RequestMethod.GET)
	public String simpleInt() {
		return "SIForm";
	}
	
	@RequestMapping(value="/login", method =RequestMethod.POST)
	public String calSI(@RequestParam int p,@RequestParam int r,
			@RequestParam int t , ModelMap model ) {
		
		
		int res = (p*r*t)/100;
	
		model.put("result", res);
		
		return "SIResult";
		
	}

}
