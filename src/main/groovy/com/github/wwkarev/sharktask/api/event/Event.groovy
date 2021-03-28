package com.github.wwkarev.sharktask.api.event

import com.github.wwkarev.sharktask.api.task.MutableTask

interface Event {
    EventType getEventType()

    MutableTask getTask()
}
