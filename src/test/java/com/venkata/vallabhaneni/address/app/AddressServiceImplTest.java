package com.venkata.vallabhaneni.address.app;

import com.venkata.vallabhaneni.address.dao.AddressRepository;
import com.venkata.vallabhaneni.address.domain.Address;
import com.venkata.vallabhaneni.address.service.AddressServiceImpl;
import org.junit.Before;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@RunWith(MockitoJUnitRunner.class)
public class AddressServiceImplTest {


    Logger logger = LoggerFactory.getLogger(AddressServiceImplTest.class);
    @Mock
    private AddressRepository addressRepository;

    @InjectMocks
    private AddressServiceImpl serviceMock;
    PodamFactory factory = null;

    private Address address = null;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        factory = new PodamFactoryImpl();
    }


}
