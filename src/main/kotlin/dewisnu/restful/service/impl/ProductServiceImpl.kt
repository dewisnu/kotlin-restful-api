package dewisnu.restful.service.impl

import dewisnu.restful.entity.Product
import dewisnu.restful.model.CreateProductRequest
import dewisnu.restful.model.ProductResponse
import dewisnu.restful.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.*
import dewisnu.restful.service.ProductService as ProductService1


@Service
class ProductServiceImpl(val productRepository: ProductRepository): ProductService1 {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
       val product = Product(
           id = createProductRequest.id,
           name = createProductRequest.name,
           price = createProductRequest.price,
           quantity = createProductRequest.quantity,
           createdAt = Date(),
           updatedAt = null
       )
        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAt = product.createdAt,
            updatedAt = product.updatedAt
        )
    }
}