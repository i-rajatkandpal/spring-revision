package Chapter4_2.Service;

import Chapter4_2.Comment;
import Chapter4_2.Proxies.CommentNotificationProxy;
import Chapter4_2.Repository.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;

    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
