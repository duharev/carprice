package ru.job4j.carpricesprboot.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.carpricesprboot.domain.description.Brand;

@Repository
public interface BrandRepository extends EntityRepository<Brand> {
}
