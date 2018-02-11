package fr.bouvier.marc.delivery

import fr.bouvier.marc.delivery.domain.model.item.*
import fr.bouvier.marc.delivery.domain.model.location.*
import fr.bouvier.marc.delivery.domain.model.money.*
import fr.bouvier.marc.delivery.domain.model.order.*
import fr.bouvier.marc.delivery.domain.model.user.*

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.math.BigDecimal
import java.time.LocalDateTime

@SpringBootApplication
class DeliveryApplication

fun main(args: Array<String>) {
    runApplication<DeliveryApplication>(*args)

    // load from repo
    val user = User(UserId(1), "Marc", "Bouvier")
    val locationA1 = Location(LocationId("A1"))
    val pizza4Fromages = Product(
            ProductCode("PIZZA_4_FROMAGES"),
            Money(BigDecimal(5), Currency.EUR),
            "Pizza 4 fromages")

    // order
    val order = Order(OrderId(1),
            user.userId,
            pizza4Fromages.productCode,
            LocalDateTime.now())
    // event
    order.takeOrder()
    // event
    order.finishPreparation()
    val delivery = order.beginDelivery(locationA1.locationId)
    delivery.endDelivery()

}




