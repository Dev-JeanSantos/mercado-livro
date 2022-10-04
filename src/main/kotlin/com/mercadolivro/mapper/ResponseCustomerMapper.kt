package com.mercadolivro.mapper

import com.mercadolivro.model.Customer
import com.mercadolivro.response.ResponseCustomerDTO
import org.springframework.stereotype.Component

@Component
class ResponseCustomerMapper (): Mapper<Customer , ResponseCustomerDTO>
{
    override fun map(t: Customer): ResponseCustomerDTO {
        return ResponseCustomerDTO(
                id = t.id,
                name = t.name,
                email = t.email
        )
    }
}