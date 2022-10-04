package com.mercadolivro.controller

import com.mercadolivro.model.Customer
import com.mercadolivro.request.RequestCustomerDTO
import com.mercadolivro.response.ResponseCustomerDTO
import com.mercadolivro.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder

@RestController()
@RequestMapping("customers")
class CustomerController(val customerService: CustomerService) {

    @GetMapping
    fun getCustomer(): List<ResponseCustomerDTO>{
        val customers = customerService.getAll()
        return customers
    }

    @PostMapping
    fun insertCustomer (@RequestBody requestCustomer: RequestCustomerDTO,
                        uriBuilder: UriComponentsBuilder) : ResponseEntity<ResponseCustomerDTO> {
        val customer = customerService.save(requestCustomer)
        val uri = uriBuilder.path("/customer/${customer.id}").build().toUri()
        return ResponseEntity.created(uri).body(customer)
    }
}