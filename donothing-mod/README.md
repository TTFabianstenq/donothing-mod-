# Do Nothing Mod

A Fabric mod for Minecraft 1.21.1 that does absolutely nothing.

## Features
- Loads successfully
- Does nothing
- Logs a message confirming it is doing nothing

## Requirements
- Java 21+
- Minecraft 1.21.1
- Fabric Loader 0.16.0+

## Building

1. Make sure you have Java 21+ installed
2. Run the following command in this directory:

```bash
./gradlew build
```

On Windows:
```cmd
gradlew.bat build
```

The compiled `.jar` will be in `build/libs/donothing-1.0.0.jar`.

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/) for Minecraft 1.21.1
2. Copy `donothing-1.0.0.jar` into your `.minecraft/mods/` folder
3. Launch Minecraft
4. Enjoy doing nothing

## First-time Gradle setup

If you don't have Gradle Wrapper files yet, run:

```bash
gradle wrapper --gradle-version 8.8
```

Then proceed with `./gradlew build`.
