package com.github.matei.intellijpbcopy.services

import com.github.matei.intellijpbcopy.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
