package chapter6.logging;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class commentService {
    private final Logger logger = Logger.getLogger(commentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publishing Comment: " + comment.getText());
    }
}
