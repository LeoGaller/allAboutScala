package com.allAboutScala.chapter.one.sample_4

object HelloWorldWithArgsDebug extends App {
  println("Hello world with arguments for debugging")

  println("Command line arguments are:")
  println(args.mkString(", "))
}
