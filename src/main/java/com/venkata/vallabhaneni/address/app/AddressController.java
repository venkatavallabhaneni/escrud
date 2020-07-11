package com.venkata.vallabhaneni.address.app;

import com.venkata.vallabhaneni.address.domain.Address;
import com.venkata.vallabhaneni.address.service.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {


    private static final Logger log = LoggerFactory.getLogger(AddressController.class);

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{name}/{pages}")
    @ResponseBody
    public Page<Address> getAddress(@PathVariable(name = "name") String name, @PathVariable(name = "pages") Integer pages) {
        return addressService.findByFirstAddress(name, PageRequest.of(0, pages));
    }

    @PostMapping
    @ResponseBody
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAnAddress(address);
    }

    @PutMapping
    @ResponseBody
    public Address updateAddress(@RequestBody Address address) {


        return addressService.updateAnAddress(address);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteAddress(@PathVariable("id") Long id) {
        addressService.deleteAnAddressById(id);
    }
}
