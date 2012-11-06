MavenTemplateProjects
=====================

This project contains Template projects that you can use with Maven and Eclipse. It represents an entire workspace with (at this moment) one project. The project itselfs and a tutorial how you should use it is documented in the MD file.

# How to use this?
To use this project you should Fork or duplicate this repository and configure it for your needs. 

Read https://help.github.com/articles/fork-a-repo for everything about forking. 
And read https://help.github.com/articles/duplicating-a-repo for everything about duplicating this to a private repo

# What should I configure per project?
When you have forked or duplicated this project you should do the following things:
- Add it to the eclipse Git Repository Exploring perspective

- On the command-line with git
  - git rm README.md (this file)
  - git mv &lt;projecttemplatename&gt; &lt;newprojectname&gt;
  - git mv &lt;projecttemplatename&gt;.md &lt;newprojectname&gt;.md
  - git commit
  - git push

- Right click the project n Git Repository Exploring and click "Fetch from upstream"

- Import the project into Eclipse (as a general project, check the MD file for instructions)
- Type in a terminal "mvn eclipse:eclipse -Dwtpversion=1.5", refresh in eclipse 

- Open the pom.xml file, and  change following things:
  - Give a new group and artifact id. Best practice is to name these after your package and projectname
  - Change the name and description
  - Change the list of developers
  - Change the SCM connection, point to your own Git repository

In some (at this moment all ;-)) cases (the web projects)
- The web.xml file, the following things:
  - Give your project a display name. Something that resembles your project name will be nice

Add to readme file instructions to start

To test the project local, just run "mvn eclipse:eclipse -Dwtpversion=1.5" again to update the web project to your new settings.



