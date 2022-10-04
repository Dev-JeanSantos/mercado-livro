package com.mercadolivro.model

import javax.persistence.*

@Entity
data class Customer (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? =  null,
    private val name: String,
    private val email: String
    )