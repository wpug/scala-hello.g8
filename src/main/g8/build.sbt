scalaVersion := "2.13.1"
// That is, to create a valid sbt build, all you've got to do is define the
// version of Scala you'd like your project to use.
scalacOptions := Seq("-unchecked", "-deprecation", "-explaintypes", "-encoding", "utf8")

// ============================================================================

// Lines like the above defining `scalaVersion` are called "settings" Settings
// are key/value pairs. In the case of `scalaVersion`, the key is "scalaVersion"
// and the value is "2.13.1"

// It's possible to define many kinds of settings, such as:

name := "hello-world"
version := "1.0"

wartremoverErrors ++= Warts.unsafe

