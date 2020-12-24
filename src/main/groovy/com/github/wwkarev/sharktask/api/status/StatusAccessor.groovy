package com.github.wwkarev.sharktask.api.status

interface StatusAccessor {
    abstract Status getById(Long id)
}
