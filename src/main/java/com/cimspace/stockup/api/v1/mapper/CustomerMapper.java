package com.cimspace.stockup.api.v1.mapper;

import com.cimspace.stockup.api.v1.dto.CustomerDTO;
import com.cimspace.stockup.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);

}
