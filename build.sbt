lazy val root = (project in file(".")).
  settings(
    organization := "tr.com.epias",
    name := "artifactId",
    version := "1.0.0",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.0",
      "com.squareup.okhttp" % "okhttp" % "2.7.2",
      "com.squareup.okhttp" % "logging-interceptor" % "2.7.2",
      "com.google.code.gson" % "gson" % "2.3.1",
      "junit" % "junit" % "4.8.1" % "test"
    )
  )
