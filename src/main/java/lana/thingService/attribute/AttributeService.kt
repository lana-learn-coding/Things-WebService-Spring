package lana.thingService.attribute

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface AttributeService {

    fun findAll(pageable: Pageable): Page<Attribute>

    fun find(id: Int): Attribute?

    fun update(attribute: Attribute): Attribute?

    fun create(attribute: Attribute): Attribute?

    fun delete(id: Int)
}
