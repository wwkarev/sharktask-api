package com.github.wwkarev.sharktask.api.project

interface ProjectAccessor {
    abstract Project getById(Long id)
    abstract Project getByKey(String key)
}
