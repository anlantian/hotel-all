import com.huchen.service.HotalServiceImpl;
import com.huchen.service.IHotalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.huchen.config.application.class)
public class test {
    @Autowired
    IHotalService ihotalService;
    @Test
    public  void ts(){
        ihotalService.getHotelList();
    }
}
