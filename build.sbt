name := "cpg-dsl-tutorial"
scalaVersion := "2.12.3"

libraryDependencies += "com.lihaoyi" % "ammonite" % "1.0.2" cross CrossVersion.full
enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)
