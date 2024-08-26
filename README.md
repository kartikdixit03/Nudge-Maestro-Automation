## Prerequisites

- Java
- Maven
- IntelliJ IDEA 2024.1.1

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/Kartikxcode/your-repo-name.git
    ```
2. Navigate to the project directory:
    ```sh
    cd your-repo-name
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

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a pull request.

## License

This project is licensed under the MIT License.
