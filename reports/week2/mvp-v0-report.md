[//]: # (Purpose and description of the MVP v0 foundation)
## Purpose and Description of the MVP v0
The goal of this MVP is to introduce 3 fully functional cantrips into the game, complete with their respective visual assets and icons. At this stage, the MVP v0 simply registers the 3 new cantrips within the registry system of the original mod (the base mod our project is building an addon for).

[//]: # (Deployment URL or runnable-artifact link)
## Deployement link (CurseForge)
The compiled, runnable mod can be downloaded directly from CurseForge mod hosting service (once they approve it), or you can download our mod directly via Google Drive

CurseForge link: [CurseForge link]()<br>
Google Drive: [Google Drive]()

[//]: # (Public video demonstration link)
## Demo link (YouTube)
[Demo link](https://youtu.be/MfrgAQUkPyk)

[//]: # (Relationship to the prototype and proposed MVP v1 stories, where applicable)
## Relationship to the Prototype and Proposed MVP v1 Stories
From the proposed pool of user stories, our MVP implements a small selection of Must Have stories. Implemented user stories are: US-03 (Spectral bed), US-04 (Lightning spell) and US-06 (Spectral Boat)

[//]: # (Current limitations, placeholders, and mocks)
## Current Placeholders
As every spell must have a name, description and an icon, these spell assets and spell effects are currently utilizing placeholders.

[//]: # (Link to local setup instructions)
## Local Setup Instructions
- Clone the repo
- Setup JDK17 for the project
- Run `./gradlew build`

modding 1.20.1 tutorial https://youtu.be/55qUIf3GMss


[//]: # (Repeatable smoke-check scenario)
## Repeatable Smoke-Check Scenario

This minimal check demonstrates that the game with the mod starts, spells are registered correctly and can be cast.

### Execution Steps
1. Launch the game client from your development environment.
2. From the main menu, select **Singleplayer** and join or create a new testing world (don't forget to enable cheats, aka commands).
3. Give yourself a **Manaweaver's Wand** and open its gui (Left ctrl + RMB).
4. Use the interface to select one of the three newly cantrips.
5. Close the menu, and attempt to cast the cantrip by drawing its corresponding symbols in the air (RMB to draw).

### Expected Results
* The game client launches successfully without crashing on startup (validating core mod registration).
* The world loads successfully, and the custom assets in **Manaweaver's Wand** gui render properly.
* Drawing the symbols generates a visual feedback confirming a successful cast.