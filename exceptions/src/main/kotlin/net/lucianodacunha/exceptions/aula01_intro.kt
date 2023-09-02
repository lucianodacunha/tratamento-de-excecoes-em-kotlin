package net.lucianodacunha.exceptions

fun main(){
    throw Exception("Olá")
}

// Saída do código acima.
/*
/home/luciano/.sdkman/candidates/java/17.0.6-zulu/bin/java -javaagent:/opt/idea_IU/lib/idea_rt.jar=40043:/opt/idea_IU/bin -Dfile.encoding=UTF-8 -classpath /home/luciano/workspace/lucianodacunha/dio/code-update-tqi-java-kotlin/tratamento-de-excecoes-em-kotlin/exceptions/out/production/exceptions:/home/luciano/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib-jdk8/1.9.0/kotlin-stdlib-jdk8-1.9.0.jar:/home/luciano/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib/1.9.0/kotlin-stdlib-1.9.0.jar:/home/luciano/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib-common/1.9.0/kotlin-stdlib-common-1.9.0.jar:/home/luciano/.m2/repository/org/jetbrains/annotations/13.0/annotations-13.0.jar:/home/luciano/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib-jdk7/1.9.0/kotlin-stdlib-jdk7-1.9.0.jar net.lucianodacunha.exceptions.Aula01_introKt
Exception in thread "main" java.lang.Exception: Olá
	at net.lucianodacunha.exceptions.Aula01_introKt.main(aula01_intro.kt:4)
	at net.lucianodacunha.exceptions.Aula01_introKt.main(aula01_intro.kt)
 */

fun demoHandling(){
    try {
        // some code
    } catch (e: Exception) {
        // handler
    } finally {
        // optional finally block
    }
}
