package Chapter4_2.Proxies;

import Chapter4_2.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {

        System.out.println("Sending Comment to email : " + comment.getText()
        );
    }
}
