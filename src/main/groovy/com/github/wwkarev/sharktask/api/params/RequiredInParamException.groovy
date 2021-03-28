package com.github.wwkarev.sharktask.api.params

import groovy.transform.InheritConstructors

@InheritConstructors
class RequiredInParamException extends Exception {
    Long paramId
    String paramName
}
