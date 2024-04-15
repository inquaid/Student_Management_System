# Student Management System

Welcome to the repository for the Student Management System, a comprehensive Java application designed to streamline the management of student records. This system allows for robust operations such as adding, updating, deleting, and sorting student information, as well as capabilities for data persistence through both SQL databases and file serialization.

## Features

The Student Management System boasts a variety of features to efficiently manage student data:

- **CRUD Operations**: Create, read, update, and delete student records seamlessly.
- **Sorting**: Organize student data by names, IDs, addresses, or CGPA.
- **Data Persistence**:
  - **SQL Database**: Leverage a robust SQL database to store and manage data reliably.
  - **File Serialization**: Utilize .ser files to save and retrieve data, ensuring data persistence across sessions.
- **Graphical User Interface**: Built with Java Swing and AWT, the interface is user-friendly, facilitating easy navigation and management of student data.
- **Reset Functionality**: Easily reset student information to manage records effectively.
- **Exit Option**: Safely close the application at any time.

## System Components

The application architecture includes several key components:

- **Database**: Handles SQL operations for data persistence.
- **Item & Item_List**: Basic structures for managing data entries.
- **Student & Student_List**: Classes specifically designed for handling student information.
- **jFrame_Edit_List & jFrame_Menu**: GUI components created with Swing for editing and menu navigation.
- **Main**: Entry point of the application, bootstrapping the GUI and functionality.

## Technologies

- **Java**: Core programming language used.
- **Swing & AWT**: Utilized for crafting the Graphical User Interface.
- **SQL Database**: For structured data storage and retrieval.
- **Serialization**: Implements Java serialization for data storage in files.

## Getting Started

To get a local copy up and running, follow these simple steps:

1. **Clone the repo**

   ```sh
   git clone https://github.com/inquaid/Student_Management_System.git
   ```

2. **Database Setup**

   - Ensure you have a SQL server running.
   - Create a database named `student_database` and import the initial schema from `database_schema.sql`.

3. **Running the Application**

   - Compile the Java files in your IDE or using the Java compiler.
   - Run the `Main.java` file to start the application.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Contact

Your Name - [@Azmain Inquaid haque](https://www.facebook.com/azmaininquaid007/)

Project Link: [https://github.com/inquaid/Student_Management_System](https://github.com/inquaid/Student_Management_System)

---
