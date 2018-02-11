package fr.bouvier.marc.delivery.domain.model.item

import fr.bouvier.marc.delivery.Entity
import fr.bouvier.marc.delivery.domain.model.money.Money

@Entity
class Product(val productCode: ProductCode,
              val price: Money,
              val name: String) {
}