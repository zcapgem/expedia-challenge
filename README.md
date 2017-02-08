Welcome to the 2017 Expedia challenge!
====================================================================
Challenge
----------
Build a simple standalone SEO content editing application.
Constraints
------------
* Java based console application
* Coded in a git repository

Requirements
------------
* On start up, the application displays an options menu with three options:
    1. Edit a web page
    2. Editing report
    3. Exit application
* Edit a web page:
    1. Ask user for the URL that they wish to edit
    2. Display the current `<title>`, `<meta name="description" content="" />` and `<meta name="keywords" content"" />` to the user
    3. Ask which element they would like to edit
    4. Ask what the user wants the new content for that element to be
    5. Save the old value and new value (in memory is fine)
    6. Ask the user if they wish to continue editing, if yes, return to step 2, else return to the options menu
* Editing report:
    * Show what the user has edited to far. For example URL | TITLE | OLD VALUE | NEW VALUE 

Instructions
-------------
* Fork and clone <https://github.com/lshilleto/expedia-challenge>
* Add team members names in [MEMBERS.md](MEMBERS.md)
* Push your solution back to your github fork once the challenge is complete.

Importing into your IDE
-------------------
### Intellij:
1. Run the following command from the expedia-challenge directory to create the Intellij project files: `./gradlew idea`
2. Choose import project from external model: gradle.
3. Accept the default options
### Eclipse:
1. Run the following command from the expedia-challenge directory to create the Eclipse project files: `./gradlew eclipse`
2. Choose Import existing projects option from the launch screen and select expedia-challenge as the root directory.   