package fr.bouvier.marc.delivery.domain.model.order

enum class OrderStatus(val code: String, val label: String) {
    ORDERED("ORDERED", "Commandé"),
    IN_PREPARATION("IN_PREPARATION", "En cours de préparation"),
    PREPARED("PREPARED", "Préparé"),
    UNDER_DELIVERY("UNDER_DELIVERY", "Livraison en cours"),
    DELIVERED("DELIVERED", "Livré")

}