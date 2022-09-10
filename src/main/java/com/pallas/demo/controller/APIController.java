package com.pallas.demo.controller;

import com.pallas.demo.model.Address;
import com.pallas.demo.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class APIController {

    @Autowired
    private IAddressRepository addressrepo;

    @GetMapping("/address/{id}")
    public Optional<Address> getAddress(@PathVariable Integer id) {
        return addressrepo.findById(id);
    }

}
