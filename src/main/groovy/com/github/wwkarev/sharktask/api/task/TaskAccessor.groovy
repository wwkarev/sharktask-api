package com.github.wwkarev.sharktask.api.task

interface TaskAccessor {
    abstract MutableTask getTaskById(Long taskId)
}
