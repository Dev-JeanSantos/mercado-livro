package com.mercadolivro.service

import com.mercadolivro.mapper.RequestCustomerMapper
import com.mercadolivro.mapper.ResponseCustomerMapper
import com.mercadolivro.repository.CustomerRepository
import com.mercadolivro.request.RequestCustomerDTO
import com.mercadolivro.response.ResponseCustomerDTO
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val requestCustomerMapper: RequestCustomerMapper,
    private val requestRepository: CustomerRepository,
    private val responseCustomerMapper: ResponseCustomerMapper
) {
    fun save(requestCustomer: RequestCustomerDTO): ResponseCustomerDTO {
        val customer = requestCustomerMapper.map(requestCustomer)
        requestRepository.save(customer)
        return responseCustomerMapper.map(customer)
    }

    fun getAll(): List<ResponseCustomerDTO>{
        val customers = requestRepository.findAll()
        return customers.map { t ->
            responseCustomerMapper.map(t)
        }
    }
}
