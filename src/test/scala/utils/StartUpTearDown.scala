package utils

/**
  * Created by tom on 03/01/17.
  */
trait StartUpTearDown {
  implicit  lazy val webDriver = Driver.instance
}
