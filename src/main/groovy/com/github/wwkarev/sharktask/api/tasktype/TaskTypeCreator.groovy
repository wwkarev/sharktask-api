package com.github.wwkarev.sharktask.api.tasktype

import com.github.wwkarev.sharktask.api.params.Params

interface TaskTypeCreator {
    TaskType create(Long id, String name, Params params)
    TaskType create(String name, Params params)
}
