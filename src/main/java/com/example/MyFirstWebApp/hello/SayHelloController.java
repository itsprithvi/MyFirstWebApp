package com.example.MyFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello, how are you ? ";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html lang=\"en\">");
		sb.append("<head>");
		sb.append("<title>demo Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Hello world using HTML</h1>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	// \src\main\resources\META-INF\resources\WEB-INF\jsp\sayHello.jsp
	// \src\main\resources\META-INF\resources\WEB-INF\jsp\welcome.jsp
	// \src\main\resources\META-INF\resources\WEB-INF\jsp\login.jsp
	// \src\main\resources\META-INF\resources\WEB-INF\jsp\todos.jsp
	// \src\main\resources\META-INF\resources\WEB-INF\jsp\sayHello.jsp
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	

}
