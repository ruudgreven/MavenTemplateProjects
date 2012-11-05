MavenTemplateProjects
=====================

This project contains Template projects that you can use with Maven and Eclipse. It represents an entire workspace with (at this moment) one project. The project itselfs and a tutorial how you should use it is documented in the MD file.

# How to use this?
- Fork or mirror this repository and configure it for your needs.

# What should I configure per project?
When you have forked or mirrored this project you should edited the following things:
- The pom.xml file, the following things:
  - Give a new group and artifact id. Best practice is to name these after your package and projectname
  - Change the list of developers
  - Change the SCM connection, point to your own Git repository

In some (at this moment all ;-)) cases (the web projects)
- The web.xml file, the following things:
  - Give your project a display name. Something that resembles your project name will be nice
