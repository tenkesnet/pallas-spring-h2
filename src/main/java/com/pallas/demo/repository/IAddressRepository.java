package com.pallas.demo.repository;

import com.pallas.demo.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepository extends CrudRepository<Address,Integer> {
}
