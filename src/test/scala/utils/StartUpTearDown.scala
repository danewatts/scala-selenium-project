package utils

trait StartUpTearDown {
  implicit  lazy val webDriver = Driver.instance
}
