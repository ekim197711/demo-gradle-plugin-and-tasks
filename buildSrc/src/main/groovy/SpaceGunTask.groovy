import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SpaceGunTask extends DefaultTask {
    def myfile = 'filenamenotset.txt'

    @TaskAction
    def fire(){
        def spacefile = project.file('spaceoutput/' + myfile)
        spacefile.parentFile.mkdirs()
        spacefile.write('Tjiiuu wommpaaa')
        println 'Look in to the file my friend: ' + spacefile.path
    }
}
