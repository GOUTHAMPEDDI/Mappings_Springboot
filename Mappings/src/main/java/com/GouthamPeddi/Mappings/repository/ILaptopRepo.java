package com.GouthamPeddi.Mappings.repository;

import com.GouthamPeddi.Mappings.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,Long> {
    Laptop findByLaptopId(Long laptopId);
}
