package chapter4.Proxies;

import chapter4.Comment;

public class EmailNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending Comment to email : " + comment.getText());
    }
}
