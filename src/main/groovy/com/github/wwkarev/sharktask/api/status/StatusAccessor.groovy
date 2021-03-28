package com.github.wwkarev.sharktask.api.status

interface StatusAccessor {
    Status getById(Long id)
    Status getAtById(Long id)
}
