package ru.CRUD_for_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.CRUD_for_shop.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

