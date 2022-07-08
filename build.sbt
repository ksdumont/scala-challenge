ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

val akkaVersion = "2.5.26"
val akkaHttpVersion = "10.1.11"

libraryDependencies ++= Seq(
  // akka streams
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  // akka http
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
)


lazy val root = (project in file("."))
  .settings(
    name := "scala-challenge",
    assembly / assemblyJarName := "q01.jar"
  )


