import com.whw.domain.Customer;
import com.whw.mapper.CustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerMapperTest {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void testSave(){
        Customer customer = new Customer();
        customer.setName("aaaa");
        customer.setAge(18);
        customer.setGender("男");

        customerMapper.save(customer);
    }
}
