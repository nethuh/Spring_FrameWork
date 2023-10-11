package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,String> {
    //Spring Query Methods
    List<Customer> findCustomerByAddress(String address);

    Customer findByAddress(String address);
    Customer readByAddress(String address);
    Customer getByAddress(String address);
    Customer queryByAddress(String address);
    Customer searchByAddress(String address);
    Customer streamByAddress(String address);
    Long countByAddress(String address);
    Customer findBySalaryAndName(String salary,String name);

    //Native SQL Supported
    @Query(value = "select * from Customer",nativeQuery = true)
    List<Customer> getAllCustomers1();

    //JPQL
    @Query(value = "select c from Customer c")
    List<Customer> getAllCustomers2();

    //HQL
    @Query(value = "from Customer c")
    List<Customer> getAllCustomers3();


    //what about params.?
    //we need to search a customer by name
    //With Named params :nm
    //:address
    //here you can set the parameters by name
    @Query(value = "select * from Customer where name=:nm",nativeQuery = true)
    Customer searchCustomerWithName(@Param("nm") String name);


    //positional parameters
    //you can set the parameters by position
    @Query(value = "select * from Customer where name=?1 and address=?2",nativeQuery = true)
    Customer searchCustomerWithName2(String name,String address);

}