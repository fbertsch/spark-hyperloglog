name := "spark-hyperloglog"

version := "1.2.0"

scalaVersion := "2.11.8"

spName := "vitillo/spark-hyperloglog"

spIncludeMaven := false

sparkVersion := "2.1.1"

sparkComponents ++= Seq("core", "sql")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "com.twitter" %% "algebird-core" % "0.12.0"
)

credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials")

licenses += "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")
