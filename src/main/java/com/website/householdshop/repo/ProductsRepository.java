package com.website.householdshop.repo;

import com.website.householdshop.models.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Long> {
}
