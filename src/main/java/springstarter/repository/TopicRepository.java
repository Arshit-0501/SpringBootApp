package springstarter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springstarter.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {
}
