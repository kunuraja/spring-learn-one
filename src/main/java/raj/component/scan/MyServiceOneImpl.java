package raj.component.scan;

import org.springframework.stereotype.Service;
import raj.component.scan.MyService;

@Service
public class MyServiceOneImpl implements MyService {
    @Override
    public String getMyService() {
        return "My service - MyServiceOneImpl";
    }
}
