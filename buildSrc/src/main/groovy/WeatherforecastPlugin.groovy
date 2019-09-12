import org.gradle.api.Plugin
import org.gradle.api.Project

class WeatherforecastPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {

        def extension = project.extensions.create('weather', WeatherforecastExtension)

        project.task('weatherTomorrow'){
            group = 'Weather'
            doLast{
                println 'Tomorrow it will be' + extension.forecast
            }
        }
    }
}