package sun.xiaolei.pgyer

import org.gradle.api.Plugin
import org.gradle.api.Project

class PgyerPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        //参数
        project.extensions.create('pgyer_config', PgyerConfig)
        //Task
        project.tasks.create('pgyerUpload', PgyerUploadTask)
    }
}
