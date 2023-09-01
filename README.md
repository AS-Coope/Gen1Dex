# Gen 1 Dex
## Overview
This is an Android application that simulates a PokéDex for Generation 1. I always wanted to create games as a kid, and even though the PokéDex isn't the main mechanic of Pokémon games, I would've still found it cool to implement something similar to it back then. That ended up being my drive to start this project. It will essentially act just like a PokéDex, with a screen where you can scroll through the different 'mons and another screen that comes up when you click on a specific 'mon.  
It is built using the Kotlin programming language and developed in Android Studio and is tested on an emulator of the Google Pixel 3A and a physical Samsung Galaxy Tab A 8.0 (2019) SM-T290.

## Usage
To use this project:
- Download and install [Android Studio](https://developer.android.com/studio).
- Clone this repository to your machine.
- Open Android Studio and click on File in the menu bar at the top of Android Studio, click Open and navigate to the directory where you cloned the project.
- Open the project.

## Deliverables
For v1.0:  
|Functional Requirements | Non-Functional Requirements |
|---|---|
| <ul><li>- [X] The app shall display the PokéDex entry for a Generation 1 Pokémon. This includes the Pokémon's picture, a description of the Pokémon (referenced from an official Generation 1 PokéDex), and other details such as weight and height.</ul></li> | <ul><li>- [X] The app shall show the correct PokéDex entry for a Pokémon within 3 seconds of the Pokémon being tapped on the list screen.</ul></li> |
| <ul><li>- [X] The app shall allow the user to scroll through a list of all the Generation 1 Pokémon, where each item in the list consists of a small icon of the Pokémon, its number in the PokéDex and its name.</ul></li> | <ul><li>- [X] The app shall resume on whatever screen the user was last on, once the app was paused. If the app is closed then it starts from the Pokémon list screen.</ul></li> |
| <ul><li>- [X] The app shall allow the user to view the PokéDex entry when a Pokémon is tapped on the list screen.</ul></li> | <ul><li>- [X] The app shall allow the user to use all the app's functionality regardless of screen configuration/orientation (screen rotation, specifically).</ul></li> |