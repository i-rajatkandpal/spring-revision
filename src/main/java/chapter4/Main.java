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

        Comment comment1 = new Comment();
        comment1.setAuthor("Sumit Kandpal");
        comment1.setText("Hey! There I am using Telegram.");

        commentService.publishComment(comment);
        commentService.publishComment(comment1);

    }
}
