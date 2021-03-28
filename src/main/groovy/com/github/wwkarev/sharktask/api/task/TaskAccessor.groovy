package com.github.wwkarev.sharktask.api.task

interface TaskAccessor {
    MutableTask getById(Long id)
    MutableTask getByKey(String key)

    MutableTask getAtById(Long id)
    MutableTask getAtByKey(String key)
}
