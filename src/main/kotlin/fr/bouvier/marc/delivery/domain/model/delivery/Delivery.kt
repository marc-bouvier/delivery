package fr.bouvier.marc.delivery.domain.model.delivery

import fr.bouvier.marc.delivery.domain.model.location.LocationId
import fr.bouvier.marc.delivery.domain.model.order.OrderId
import java.time.LocalDateTime

class Delivery(val orderId: OrderId,
               val location: LocationId,
               var dateDelivered: LocalDateTime?,
               var status: DeliveryStatus = DeliveryStatus.UNDER_DELIVERY) {
    fun endDelivery() {
        status = DeliveryStatus.DELIVERED
        dateDelivered = LocalDateTime.now()
    }

    enum class DeliveryStatus(val code: String, val label: String) {
        UNDER_DELIVERY("UNDER_DELIVERY", "Livraison en cours"),
        DELIVERED("DELIVERED", "Livraison terminée")
    }

}
