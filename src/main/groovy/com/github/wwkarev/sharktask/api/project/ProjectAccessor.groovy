package com.github.wwkarev.sharktask.api.project

interface ProjectAccessor {
    Project getById(Long id)
    Project getByKey(String key)
    Project getAtById(Long id)
    Project getAtByKey(String key)
}
