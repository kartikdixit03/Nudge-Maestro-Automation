```markdown
## Prerequisites

- Java
- Maven
- IntelliJ IDEA 2024.1.1

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/kartikdixit03/Nudge-Maestro-Automation.git
    ```
2. Navigate to the project directory:
    ```sh
    cd Nudge-Maestro-Automation
    ```
3. Install the dependencies:
    ```sh
    mvn install
    ```

## Usage

1. Open the project in IntelliJ IDEA.
2. Run the test scripts using the IDE's built-in test runner.

## Test Scripts

- Scripts

  - explorartory Tests
    - deleteUserOngoinQuiz.yaml
    - exploratoryTests.yaml
    - InterruptedSessions.yaml
    - RapidSequence.yaml
    - reopenAppAfterIntrupption.yaml

  - HomePageTests
    - attemptQuiz.yaml
    - homePageElements.yaml
    - quizPage.yaml
  - UserFlowTest
    - unusualNavigationSequence.yaml

Command to run:
```sh
maestro test Scripts/HomePageTests/FileName.yaml
```
```
