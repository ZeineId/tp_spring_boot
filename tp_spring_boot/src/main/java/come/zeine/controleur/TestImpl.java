package come.zeine.controleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestImpl implements Test{

	@GetMapping("/test")
	@Override
	public String toutvabien() {
		// TODO Auto-generated method stub
		
		return "Tout va bien";
	}

	
	
}
