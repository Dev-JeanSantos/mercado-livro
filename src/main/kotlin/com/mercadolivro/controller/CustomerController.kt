package com.mercadolivro.controller

import com.mercadolivro.model.Customer
import com.mercadolivro.request.RequestCustomerDTO
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("customers")
class CustomerController {

    @GetMapping
    fun getCustomer(): Customer {
        return Customer(1, "Jean", "email@gmail.com.br")
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun insertCustomer (@RequestBody requestCustomer: RequestCustomerDTO)  {
        println(requestCustomer)
    }
}