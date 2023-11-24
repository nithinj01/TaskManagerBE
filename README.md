# TaskManagerBE
Avow Task Manager

How to run the application

This is a Task Manager web application built with Nuxt.js/Vue.js for the frontend and Spring Boot WebFlux for the backend.

Major Functionalities include:
•	An overview page with a list of the current tasks
•	Able to create a new task
•	Able to mark a task as done/completed



## Prerequisites for the Task Manager application

Before running the application, ensure that you have the following installed:

- Node.js and NPM (for the frontend)
- Java 11+ and Gradle (for the backend)

## Getting Started

### Frontend application information

1. Navigate to the `frontend` directory:

    ```bash
    cd frontend
    ```

2. Install dependencies:

    ```bash
    npm install
    ```

3. Run the application:

    ```bash
    npm run dev
    ```

4. Access the frontend at [http://localhost:3000](http://localhost:3000).

### Backend

1. Navigate to the `backend` directory:

    ```bash
    cd backend
    ```

2. Run the Spring Boot application:

    ```bash
    ./gradlew bootRun
    ```

3. The backend will be accessible at [http://localhost:8080](http://localhost:8080).

## Usage

- Visit [http://localhost:3000](http://localhost:3000) to access the Task Manager web application.
- Use the application to create, view, and complete tasks.

## Endpoints used in the applications

- Frontend: [http://localhost:3000](http://localhost:3000)
- Backend: [http://localhost:8080](http://localhost:8080)
- REST API Endpoints:
- GET: `/api/tasks` - Get a list of tasks
- POST: `/api/tasks` - Create a new task
- POST: `/api/tasks/{taskId}/complete` - Mark a task as completed

## License

This project is licensed under the [MIT License](LICENSE).
![image](https://github.com/nithinj01/TaskManagerBE/assets/47292784/563ff93a-18aa-4ab2-ad98-33db4a87fd3b)
