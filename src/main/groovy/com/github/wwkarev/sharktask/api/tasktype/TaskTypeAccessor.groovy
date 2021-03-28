package com.github.wwkarev.sharktask.api.tasktype


interface TaskTypeAccessor {
    TaskType getById(Long id)
    TaskType getAtById(Long id)
}
