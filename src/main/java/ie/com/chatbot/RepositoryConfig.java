package ie.com.chatbot;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import ie.com.chatbot.entity.Item;
import ie.com.chatbot.entity.Rating;
import ie.com.chatbot.entity.User;

@Configuration
public class RepositoryConfig {
	@Autowired
	RepositoryRestMvcConfiguration restMVC;
	
	@PostConstruct
	public void afterPropertiesSet() {		
			restMVC.config().exposeIdsFor(User.class);
			restMVC.config().exposeIdsFor(Rating.class);
			restMVC.config().exposeIdsFor(Item.class);
	}
}
