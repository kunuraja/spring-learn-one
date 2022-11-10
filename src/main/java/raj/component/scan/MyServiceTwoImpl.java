package raj.component.scan;

import org.springframework.stereotype.Service;
import raj.component.scan.MyService;

@Service
public class MyServiceTwoImpl implements MyService {
    @Override
    public String getMyService() {
        return "My Service - MyServiceTwoImpl";
    }
}
