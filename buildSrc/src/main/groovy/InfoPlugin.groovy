import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.Task

class InfoPlugin implements Plugin<Project> {
    void apply(Project project) {
        Task infoTask = project.task("info", type: InfoTask)
    }
}