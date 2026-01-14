package chapter4;

import chapter4.Proxies.CommentNotificationProxy;
import chapter4.Proxies.EmailNotificationProxy;
import chapter4.Repository.CommentRepository;
import chapter4.Repository.DBCommentRepository;
import chapter4.Service.CommentService;

public class Main {
    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailNotificationProxy();

        CommentService commentService = new CommentService(commentNotificationProxy,commentRepository);

        Comment comment = new Comment();
        comment.setAuthor("Rajat Kandpal");
        comment.setText("Hey! There I am using Whatsapp.");


        commentService.publishComment(comment);


    }
}
