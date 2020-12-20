package com.github.wwkarev.sharktask.api.task

import com.github.wwkarev.sharktask.api.attachment.Attachment
import com.github.wwkarev.sharktask.api.comment.Comment
import com.github.wwkarev.sharktask.api.project.Project
import com.github.wwkarev.sharktask.api.status.Status
import com.github.wwkarev.sharktask.api.tasktype.TaskType
import com.github.wwkarev.sharktask.api.user.User

interface Task {
    abstract Long getId()
    abstract String getKey()
    abstract Project getProject()
    abstract TaskType getTaskType()
    abstract Status getStatus()


    abstract String getSummary()
    abstract User getCreator()
    abstract User getAssignee()
    abstract Date getCreatedDate()

    abstract Object getFieldValue(Long fieldId)
    abstract List<Long> getInwardLinkedTaskId(Long linkTypeId)
    abstract List<Long> getOutwardLinkedTaskId(Long linkTypeId)
    abstract List<Attachment> getAttachments()
    abstract List<Comment> getComments()
}
