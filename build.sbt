lazy val root = (project in file(".")).
  settings(
    name := "valdef",
    version := "0.1.0",
    scalaVersion := "2.11.4",
    mainClass in Compile := Some("example.Main")
  )

resolvers += Resolver.sonatypeRepo("public")

libraryDependencies += "javax.annotation" % "javax.annotation-api" % "1.3.2"

