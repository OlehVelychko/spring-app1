# Spring Music Player Application 🎶

## Project Overview

This project is a simple music player application built with **Spring Core**. The main goal is to showcase my understanding of Spring Framework basics, including dependency injection, annotations, and XML/Java-based configuration. 

This project is my first experience with Spring, and I've implemented core logic using Spring annotations, dependency injection, and bean management.

## Features

- **Play music from different genres**: The application supports three genres — `CLASSICAL`, `ROCK`, and `SUPER`.
- **Random track selection**: For each genre, the application randomly picks a track from a list.
- **Initialization and destruction**: Demonstrates bean lifecycle methods in Spring using `@PostConstruct` and `@PreDestroy` annotations.
- **Enum-based genre selection**: Each genre is represented as an enum, making genre selection simple and type-safe.
- **External configuration with properties file**: Settings like the MusicPlayer name and volume are loaded from an external configuration file.

## Tech Stack

- **Java 17** — the main language for the project.
- **Spring Core (v6.1)** — for dependency injection and lifecycle management.
- **Maven** — for dependency management and project building.
- **JUnit 5** — for testing.

## Learning Outcomes

Through this project, I gained hands-on experience with:
- **Spring Core** concepts like dependency injection and bean lifecycle.
- **Java Annotations** and **enum-based logic** for better code organization.
- **Configuration Management** using properties files.
- **JUnit Testing** to verify core functionality.
