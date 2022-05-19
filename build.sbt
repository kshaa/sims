lazy val root =
  (project in file("."))
    .aggregate(simsJS, simsJVM)

lazy val sims =
  (crossProject(JSPlatform, JVMPlatform) in file("sims"))
    .settings(
      name := "sims",
      organization := "com.odersky.jakob",
      version := "1.2.1",
      scalaVersion := "3.1.1",
      scalacOptions ++= Seq("-deprecation", "-feature")
    )
    .jsSettings(
      Test / scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.CommonJSModule))
    )

lazy val simsJS = sims.js
lazy val simsJVM = sims.jvm