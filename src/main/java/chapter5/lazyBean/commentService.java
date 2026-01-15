package chapter5.lazyBean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class commentService {
    public commentService() {
        System.out.println("commentService instance created!");
    }
}
