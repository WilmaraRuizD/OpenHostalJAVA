package com.example.openHostal;

import com.example.openHostal.Repository.HostalRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class HostalTest {

    @Autowired
    private HostalRepo hostalRepo;

}
