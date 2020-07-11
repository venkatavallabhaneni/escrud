package com.venkata.vallabhaneni.address.service;

import com.venkata.vallabhaneni.address.dao.AddressRepository;
import com.venkata.vallabhaneni.address.domain.Address;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Page<Address> findByFirstAddress(String firstAddress, Pageable pageable) {

        return addressRepository.findByFirstAddress(firstAddress, pageable);

    }

    @Override
    public Address createAnAddress(Address anAddress) {
        Address address = addressRepository.save(anAddress);
        return address;
    }

    @Override
    public Address updateAnAddress(Address anAddress) {

        Address address = null;

        Optional<Address> anAddressToUpdate = addressRepository.findById(anAddress.getId());
        if (anAddressToUpdate.isPresent()) {
            BeanUtils.copyProperties(anAddress, anAddressToUpdate.get(), "id");
            address = this.createAnAddress(anAddressToUpdate.get());
        }
        return address;
    }

    @Override
    public void deleteAnAddressById(Long id) {
        addressRepository.deleteById(id);
    }


}
