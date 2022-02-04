package springstarter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springstarter.model.Topic;
import springstarter.repository.TopicRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring","Spring Framework","Spring Framework description"),
//                new Topic("java", "Core Java","Core Java description"),
//                new Topic("javascript", "Javascript","Javascript description")));

    public List<Topic> getAllTopics() {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        Optional<Topic> optionalTopic = topicRepository.findById(id);
        Topic t = optionalTopic.get();
        return t;
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
