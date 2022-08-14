package dewisnu.restful.repository

import dewisnu.restful.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository :JpaRepository<Product, String>{

}