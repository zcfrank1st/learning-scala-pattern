name := "scala-pattern"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq (
  "org.scalaz" %% "scalaz-core" % "7.2.3",
  "com.github.finagle" %% "finch-jackson" % "0.10.0"
)

scalacOptions += "-feature"
initialCommands in console := "import scalaz._, Scalaz._"