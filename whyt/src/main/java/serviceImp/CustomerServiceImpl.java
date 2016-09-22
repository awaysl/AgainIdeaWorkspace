package serviceImp;

import beans.Customer;
import org.springframework.stereotype.Service;
import service.CustomerService;
import dao.CustomerMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 0100060991 on 2016/9/19.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> getCustomerByNumber(String Customer) {
        List<Customer> customerList = customerMapper.selectAllCustomer();
        return customerList;
    }

    @Override
    public int deleteCustomerByNumber(String CustomerNumber) {
        int num = customerMapper.deleteByPrimaryKey(CustomerNumber);
        return num;
    }
}
