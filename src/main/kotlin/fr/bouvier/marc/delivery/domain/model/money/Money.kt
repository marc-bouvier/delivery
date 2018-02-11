package fr.bouvier.marc.delivery.domain.model.money

import fr.bouvier.marc.delivery.ValueObject
import java.math.BigDecimal

@ValueObject
class Money(val amount: BigDecimal,
            val currency : Currency)