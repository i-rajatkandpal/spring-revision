package chapter5.eagerBean;

import org.springframework.stereotype.Service;

@Service
public class commentService {
    public commentService(){
        System.out.println("CommentService instance created");
    }
}
