package ie.com.chatbot.repository;

import org.springframework.data.repository.CrudRepository;
import ie.com.chatbot.entity.User;

public interface UserRepository extends CrudRepository<User, String> {
}
