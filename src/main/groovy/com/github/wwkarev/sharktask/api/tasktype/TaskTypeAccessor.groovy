package com.github.wwkarev.sharktask.api.tasktype


interface TaskTypeAccessor {
    abstract TaskType getById(Long id)
}
