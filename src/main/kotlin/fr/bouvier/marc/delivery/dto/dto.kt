package fr.bouvier.marc.delivery.dto

import fr.bouvier.marc.delivery.domain.model.order.Order
import fr.bouvier.marc.delivery.domain.model.user.User
import java.math.BigDecimal
import java.util.*

data class UserDto(val id: Long,
                   val name: String,
                   val lastName: String)

data class ProductDto(val code: String,
                      val price: BigDecimal,
                      val currencySymbol: String,
                      val name: String)

data class OrderDto(val user: UserDto,
                    val product: ProductDto,
                    val delivery: DeliveryDto)

data class DeliveryDto(val id: Long,
                       val dateDelivered: Date,
                       val statusLabel: String)


fun User.mapToDto() = UserDto(this.userId.id, this.name, this.lastName)
