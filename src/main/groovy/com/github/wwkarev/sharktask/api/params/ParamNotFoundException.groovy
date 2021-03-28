package com.github.wwkarev.sharktask.api.params

import groovy.transform.InheritConstructors

@InheritConstructors
class ParamNotFoundException extends Exception {
    Long paramId
}
