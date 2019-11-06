package com.allAboutScala.chapter.one.sample_3

object HelloWorldWithArguments extends App {
  println("Hello world with arguments")

  println("Command line arguments:")
  println(args.mkString(", "))
}
