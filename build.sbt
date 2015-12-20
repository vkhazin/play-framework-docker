name := """play-framework-docker"""

version := "1.0"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

fork in run := true