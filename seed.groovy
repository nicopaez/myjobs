import groovy.io.FileType
import org.yaml.snakeyaml.Yaml

def list = []

def dir = new File("csharp-projects")
dir.eachFileRecurse (FileType.FILES) { file ->
  list << file
}

list.each {
  println it.path
  InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(it.path);
  Yaml configFileYml = new Yaml()
  configFileYml.load(configFile).each { 
    println name 
  }

}