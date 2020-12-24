package com.github.wwkarev.sharktask.api.user

interface UserAccessor {
    abstract User getById(Long id)
    abstract User getByKey(String key)
}
