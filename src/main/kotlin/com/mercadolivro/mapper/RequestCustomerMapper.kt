package com.mercadolivro.mapper

import com.mercadolivro.model.Customer
import com.mercadolivro.request.RequestCustomerDTO

class RequestCustomerMapper (): Mapper<RequestCustomerDTO, Customer>
{
    override fun map(t: RequestCustomerDTO): Customer {
        return Customer(
                name = t.name,
                email = t.email
        )
    }
}