# Android Fragments Hub 📱

Une application Android moderne démontrant l'utilisation des **Fragments dynamiques**, de la gestion du **cycle de vie**, et de la communication entre composants. Ce projet utilise les composants de **Google Material Design** pour une interface épurée.

## 🚀 Objectifs Pédagogiques
* **Navigation Dynamique** : Utilisation du `FragmentManager` pour permuter les interfaces.
* **Gestion d'État** : Conservation des données (SeekBar) lors des rotations d'écran avec `onSaveInstanceState`.
* **Cycle de Vie** : Maîtrise des étapes `onViewCreated` et `onAttach`.
* **UI Avancée** : Mise en œuvre de `CardView` et `MaterialButtonToggleGroup`.

---

## 📸 Aperçu de l'Interface

### 1. Module Accueil (`HomeFragment`)
Ce module gère les interactions simples. L'interface change d'état dynamiquement sans recharger l'Activité principale.

| État Initial | Après Action (Clic) |
| :---: | :---: |
|  <img width="395" height="868" alt="Screenshot 2026-04-09 212123" src="https://github.com/user-attachments/assets/815ab232-3348-42a9-a2c2-91d7abfd48fd" />|  <img width="393" height="868" alt="Screenshot 2026-04-09 212145" src="https://github.com/user-attachments/assets/2bf96029-6466-4dc7-adda-af1cc0545ecf" />|

### 2. Module Options (`SettingsFragment`)
Démonstration de la persistance des données. La valeur du niveau de signal est sauvegardée et restaurée automatiquement.

| Niveau Bas (13%) | Niveau Haut (69%) |
| :---: | :---: |
| ]<img width="395" height="870" alt="Screenshot 2026-04-09 212202" src="https://github.com/user-attachments/assets/d39019f8-eca4-4e09-a87f-9902d9a9aef3" />|  <img width="394" height="866" alt="Screenshot 2026-04-09 212214" src="https://github.com/user-attachments/assets/f7798006-584b-4b8d-8b00-4aa70ca1b7af" />


---

## 🛠 Structure du Projet

### Architecture Technique
* **MainActivity** : Gère le conteneur `FrameLayout` et les animations de transition.
* **HomeFragment** : Logique d'accueil et feedback textuel.
* **SettingsFragment** : Contrôle du signal via `SeekBar` avec gestion du `Bundle` pour l'état.

### Fragment Lifecycle (Concept clé)
L'application respecte la hiérarchie du cycle de vie Android pour garantir la stabilité du système.



---

## ⚙️ Installation et Configuration

### Prérequis
* **Android Studio** (Koala | 2024.1.1 ou supérieur)
* **JDK 17** ou supérieur
* **SDK Android** (API 24 minimum)

### Étapes d'installation
1.  **Cloner le dépôt** :
    ```bash
    git clone [https://github.com/MAITO465/Lab4.git](https://github.com/MAITO465/Lab4.git)
    ```
2.  **Importer le projet** : Ouvrez Android Studio et sélectionnez le dossier du projet.
3.  **Synchronisation Gradle** : Laissez Android Studio télécharger les dépendances suivantes :
    ```gradle
    // build.gradle (Module :app)
    dependencies {
        implementation 'com.google.android.material:material:1.12.0'
        implementation 'androidx.cardview:cardview:1.0.0'
        implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    }
    ```
4.  **Exécution** : Cliquez sur le bouton "Run" (Triangle vert) pour lancer sur votre émulateur ou appareil physique.

---

## 📂 Organisation des fichiers
* `java/com/example/maitofragment/` : Contient le code source (Activity et Fragments).
* `res/layout/` : Contient les fichiers XML de l'interface utilisateur.
* `screenshots/` : Dossier contenant les images d'illustration du README.

---
*Projet réalisé à des fins d'apprentissage du développement mobile Android.*
