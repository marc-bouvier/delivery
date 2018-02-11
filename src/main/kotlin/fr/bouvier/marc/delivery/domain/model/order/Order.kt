package fr.bouvier.marc.delivery.domain.model.order

import fr.bouvier.marc.delivery.domain.model.delivery.Delivery
import fr.bouvier.marc.delivery.domain.model.item.ProductCode
import fr.bouvier.marc.delivery.domain.model.location.LocationId
import fr.bouvier.marc.delivery.domain.model.user.UserId
import java.time.LocalDateTime

class Order(val orderId: OrderId,
            val userId: UserId,
            val productId: ProductCode,
            val dateOrder: LocalDateTime,
            var status: OrderStatus = OrderStatus.ORDERED) {
    fun takeOrder() {
        status = OrderStatus.IN_PREPARATION
    }

    fun finishPreparation() {
        status = OrderStatus.PREPARED
    }

    fun beginDelivery(locationId: LocationId): Delivery {
        status = OrderStatus.UNDER_DELIVERY
        return Delivery(orderId, locationId, LocalDateTime.now())
    }
}
