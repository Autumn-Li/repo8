import com.gye.domain.Detail;
import com.gye.mapper.DetailMapper;
import com.gye.service.impl.DetailServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FindAllTest {

    @Autowired
    private DetailServiceImpl detailService;

    @Test
    public void findAll(){
        List<Detail> detailList = detailService.findAll();
        for (Detail detail : detailList) {
            System.out.println(detail);
        }
    }

}
