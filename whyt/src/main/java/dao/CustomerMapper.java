package dao;

import beans.Customer;
import org.springframework.stereotype.Repository;

@Repository(value = "CustomerMapper")
public interface CustomerMapper {
    int deleteByPrimaryKey(String customerNumber);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String customerNumber);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}