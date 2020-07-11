package com.venkata.vallabhaneni.address.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "people", type = "address")
public class Address {

    private String firstAddress;
    private String secondAddress;
    private Integer pin;
    private Long id;
}
