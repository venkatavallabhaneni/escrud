package com.venkata.vallabhaneni.address.service;

import com.venkata.vallabhaneni.address.domain.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface AddressService {

    Page<com.venkata.vallabhaneni.address.domain.Address> findByFirstAddress(String firstAddress, Pageable pageable);

    Address createAnAddress(Address address);

    Address updateAnAddress(Address address);

    void deleteAnAddressById(Long id);

}
