package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id: String, val firstName: String, val lastName: String, val email: String)

// To save data when you restart application
val customerStorage = mutableListOf<Customer>()