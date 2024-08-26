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
    cd Nudge-Maestro-Automatio
    ```
3. Install the dependencies:
    ```sh
    mvn install
    ```

## Usage

1. Open the project in IntelliJ IDEA.
2. Run the test scripts using the IDE's built-in test runner.

## Test Scripts

### `attemptQuiz.yaml`

This script will:
- Clear the app state
- Launch the app
- Navigate through the app to the quiz page
- Select answers for the quiz
- Return to the home page
- Delete the user
- Verify the quiz page is displayed again

### `homePageElements.yaml`

This script will:
- Clear the app state
- Launch the app
- Verify that the "Track Story", "User Identifier", "Track Quiz", and "Delete User" buttons are displayed on the home page

### `quizPage.yaml`

This script will:
- Clear the app state
- Launch the app
- Navigate through the app to the quiz page
- Verify the quiz page is displayed
