import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class InfoTask extends DefaultTask {
    @TaskAction
    void printInfo() {
        println project.name
    }
}