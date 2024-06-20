package com.base.basesetup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.basesetup.entity.ProductsAccessibleVO;

@Repository
public interface ProductsAccessibleRepo extends JpaRepository<ProductsAccessibleVO, Long>{

}