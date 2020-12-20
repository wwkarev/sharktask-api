package com.github.wwkarev.sharktask.api.task


import com.github.wwkarev.sharktask.api.eventdispatchoption.EventDispatchOption
import com.github.wwkarev.sharktask.api.user.User

interface MutableTask extends Task {
    abstract void updateValue(Long fieldId, value, User user, EventDispatchOption eventDispatchOption)
    abstract void addInwardLinkedTask(MutableTask sourceTask, Long linkTypeId, User user, EventDispatchOption eventDispatchOption)
    abstract void addOutwardLinkedTask(MutableTask destinationTask, Long linkTypeId, User user, EventDispatchOption eventDispatchOption)
    abstract void removeAllOutwardLinks(Long linkTypeId, User user, EventDispatchOption eventDispatchOption)
    abstract void transit(Long transtionId, User user)
    abstract void addAttachment(String filePath, String attachmentName, User user, EventDispatchOption eventDispatchOption)
    abstract void addComment(String body, User user, EventDispatchOption eventDispatchOption)
    abstract void delete(User user)
}

