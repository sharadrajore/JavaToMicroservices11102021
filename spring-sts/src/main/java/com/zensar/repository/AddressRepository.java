package com.zensar.repository;

import org.springframework.data.repository.CrudRepository;

import com.zensar.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
