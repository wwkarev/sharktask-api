package com.github.wwkarev.sharktask.api.field

interface FieldAccessor {
    Field getById(Long id)
    Field getAtById(Long id)
}
