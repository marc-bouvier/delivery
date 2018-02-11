package fr.bouvier.marc.delivery.domain.model.money

import fr.bouvier.marc.delivery.ValueObject

@ValueObject
enum class Currency(
        val isoCode: String,
        val symbol: String) {
    EUR("EUR", "€")
}