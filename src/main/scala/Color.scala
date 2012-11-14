package com.example.myproj

// ANSI escape sequences
object Color {
  val clean = "\033[0m"

  def bold(string: String) = "\033[1m" + string + clean

  def red(string :String) = "\033[31m" + string + clean

  def green(string :String) = "\033[32m" + string + clean
  
  def yellow(string :String) = "\033[33m" + string + clean

  def blue(string :String) = "\033[34m" + string + clean

  def magenta(string :String) = "\033[35m" + string + clean

  def cyan(string :String) = "\033[36m" + string + clean

}