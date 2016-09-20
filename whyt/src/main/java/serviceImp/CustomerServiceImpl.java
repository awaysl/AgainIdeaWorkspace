package serviceImp;

import beans.Customer;
import org.springframework.stereotype.Service;
import service.CustomerService;
import dao.CustomerMapper;

import javax.annotation.Resource;

/**
 * Created by 0100060991 on 2016/9/19.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public Customer getCustomerByNumber(String Customer) {
        Customer customer = customerMapper.selectByPrimaryKey(Customer);
        return customer;
    }

    @Override
    public int deleteCustomerByNumber(String CustomerNumber) {
        int num = customerMapper.deleteByPrimaryKey(CustomerNumber);
        return num;
    }
}
