package dewisnu.restful.service

import dewisnu.restful.model.CreateProductRequest
import dewisnu.restful.model.ProductResponse

interface ProductService {
    fun create(createProductRequest:CreateProductRequest):ProductResponse
}