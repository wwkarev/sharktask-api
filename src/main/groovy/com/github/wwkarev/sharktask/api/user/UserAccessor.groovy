package com.github.wwkarev.sharktask.api.user

interface UserAccessor {
    User getById(Long id)
    User getByKey(String key)
    User getAtById(Long id)
    User getAtByKey(String key)
}
