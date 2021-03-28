package com.github.wwkarev.sharktask.api.task

import com.github.wwkarev.sharktask.api.params.Params

interface TaskCreator {
    MutableTask create(Long projectId, Long taskTypeId, Params params)
}
