package devapptask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControl {
	@GetMapping("/get")
	public String get() {
		return "This is My devtask";
	}
}
