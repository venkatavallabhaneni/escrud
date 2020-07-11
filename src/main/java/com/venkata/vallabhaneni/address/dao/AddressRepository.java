package com.venkata.vallabhaneni.address.dao;

import com.venkata.vallabhaneni.address.domain.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends ElasticsearchRepository<Address, Long> {

    Page<Address> findByFirstAddress(String firstAddress, Pageable pageable);


}
