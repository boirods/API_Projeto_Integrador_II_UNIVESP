name := """ProjetoIntegrador2"""
organization := "br.univesp.projeto_integrador"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.8"

libraryDependencies += guice
