package com.mercadolivro.model

import javax.persistence.*

@Entity
data class Customer (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? =  null,
    val name: String,
    val email: String
    )