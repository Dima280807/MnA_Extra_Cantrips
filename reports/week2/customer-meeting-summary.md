## 📅 Meeting Overview

> **Project:** Mana and Artifice Extra Cantrips<br>
> **Date:** 2026-06-13<br>
> **Location/Platform:** in-person<br>
> **Recording:** Yes  -  customer consented to recording and private sharing with instructors<br>
> **Publication:** Yes  -  customer consented to publishing the sanitized transcript in the repository

## Participants

| Name | Role |
|---|---|
| ultradood | Interviewer |
| alexm-gh | Interviewer |
| l1n0n | Note taker |
| Dima280807 | Note taker |

---

## 🗣️ Discussion Points & Feedback

### 1. Proposed Cantrip Mechanics (User Stories Context)

* **Left-Hand Forced Consumption:** A spell designed for travelers to force-consume an item in their left hand to gain eating benefits even when not hungry. The customer validated this utility, explaining a mod mechanic where mana regeneration relies on *saturation* rather than *hunger*.
* **Spell Amplification:** A cantrip that amplifies the next spell cast. The customer suggested gating this or altering its limits based on the player’s tier progression (e.g., fewer amplifications at Tier 1, more at Tier 2).
* **Spectral Bed:** Allows players to sleep without resetting their world spawn point. The customer strongly supported this, noting it is highly useful in the late-game when traveling far distances to avoid annoying phantom spawns.
* **Lightning Spell:** A vanilla-style lightning spell to help farm charged creepers and mob heads. The customer found it fun and suggested it could also be used to spawn witches.
* **Summonable Donkey & Astral Boat:** . Summons spectral donkey and boat with chests attached. The customer suggested making the inventory a continuous inventory system ("Ender-style") across a summoned donkey and boat.
* **Villager Level Reset:** A spell to reset a villager's trade level back to zero to change their profession. The customer found this useful and suggested an advanced alternative (storing/loading trade data via items), though it remains optional.
* **Spectral Armor:** Armor that scales with the magic tier and doesn't break, serving "mage-knight" players.

### 2. Dropped Community Ideas

* **Sword Summoning Slot:** Dropped due to irrelevancy, reliance on outside mods, and low situational usage (combating specific disarmament spells).
* **Slow Falling Cantrip:** Rejected because an equivalent potion effect and spell already exist early in the base mod.

### 3. Study & Unlock Architecture

* The customer heavily emphasized developing the "technology of studying" (unlock progression) as early as possible to ensure it is technically feasible within the base mod's architecture.

### 4. Release Strategy (CurseForge & Modrinth)

* The customer recommended uploading early beta versions to CurseForge/Modrinth to gather regular community feedback, which will strengthen the project's academic evaluation. They advised on icon design consistency (matching the paper/spell component style of existing addons).

---

## 🛠️ Artifacts & Evidence

* **User Stories & Priorities Document:** Formalized in `reports/week2/user-stories.md`.
* **MVP Scope:** Established as **MVP v1**, encompassing three initial spells:
* Spectral Bed (`US-03`)
* Lightning (`US-04`)
* Astral Boat (`US-06`)



---

## 🎯 Decisions

1. **Inventory Behavior:** The summoned donkey and boat will function like a localized Ender Chest unique to each player. Items will persist inside the shared inventory even if the entity disappears or dies.
2. **Feature Cut:** Dropped the sword-summoning slot and the slow-falling cantrip from the scope.
3. **Phased Release:** The project will release early beta versions on CurseForge with the MVP spells available by default in Creative mode before the progression/study system is fully coded.

---

## 📋 Action Points

* [ ] **Development:** Implement MVP v1 (Spectral Bed, Lightning, and Astral Boat).
* [ ] **Art:** Tweak entity textures (e.g., semi-transparent spectral look) and draw custom icons matching the established spell-component paper style.
* [ ] **Research:** Deep-dive into the mod's architecture to verify how to gate spells behind a custom "study/unlock" system.
* [ ] **Deployment:** Create a CurseForge project profile, set up an addon icon, and upload the primary beta build once MVP testing passes.

---

## ⚡ Risks & Resulting Changes

* **Architectural Constraint (High Risk):** The team is unsure if the base mod framework natively supports restricting spell availability until a "study tech" is completed.
* *Resulting Change:* The customer ordered the team to research this immediately so a backup implementation path can be designed if the primary approach fails.


* **Inventory Duping (Low Risk):** Spawning a physical bag upon donkey death poses a duplication risk.
* *Resulting Change:* Swapped to the Ender-inventory design instead.



---

## ✅ Customer Approvals

* **[✓]** User stories and MoSCoW priorities.
* **[✓]** Initial proposed MVP v1 scope.
* **[✓]** Written consent for the MIT-licensed public development model (obtained June 13, 2026 via Telegram).
* **[✓]** Permission to record the meeting and publish this sanitized transcript in the repository.