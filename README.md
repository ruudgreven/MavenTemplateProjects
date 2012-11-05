# Prerequisites 
This project is meant to run under Java 7 and Tomcat 7. Please make sure you have these installed.

- Install Eclipse JEE (we tested it with Juno)
- Install GIT
- Install Maven


# Add Eclipse plugins
- Start Eclipse, just choose a workspace (I suggest an empty one)
- Open Eclipse Market Place (Help -> Eclipse Market Eclipse)
- Find the following plugins and install them:
    - eGit
    - Checkstyle Plug-in
    - FindBugs Eclipse Plugin
- Go to Preferences -> Java -> BuildPath -> Classpath Variables and add M2_REPO refering to your local Maven2 repository (e.g. ~/.m2/repository )
- Set JAVA_HOME environmental variable (on Mac or Linux add the line "export JAVA_HOME=\`/usr/libexec/java_home\`" to .profile, additionally for mac run the following command in a terminal "defaults write $HOME/.MacOSX/environment JAVA_HOME "/Library/Java/Home"". For Windows check http://www.robertsindall.co.uk/blog/setting-java-home-variable-in-windows/ )
- Restart Eclipse


# Load the project
- Start with a new workspace
- Go to the "Git Repository Exploring" perspective.
- Choose "Clone a Git repository and add the clone to this view" (One of the small buttons on top of the Git repositories view).
- Add the HTTPS path from your Git repository (e.g. https://github.com/ruudgreven/MavenTemplateProjects.git )
- Click next, your project should be found, then finish
- Open the GIT repository, then go to Working Directory and right click on JerseyWebProjectTemplate and choose "Import projects..."
- Choose "Import as general project". Click Next and Finish.
- Open a command prompt and go to the directory of your project (under workspace).
- type "mvn eclipse:eclipse -Dwtpversion=1.5".
- Go back to eclipse, JEE Perspective, Right click on your project and click refresh.

As you can see checkstyle is already configured, you just need to add a link to tomcat and the project should run like a charm!

# Run the project
- Just run the project in the same way as always, just click the run button, choose run on server.

# Commit code
- Right click on project -> Team -> Commit
- Enable the checkbox "Push changes to GitHub" to push changes immediately to GitHub

# Clean up project using Maven
- Open a terminal and go to your project directory
- Type "mvn clean"

# Build a war with Maven
- Open a terminal and go to your project directory
- Type "mvn install". Under the target directory you find your war file.

# Run a unit test
- Right click on your unittest class and choose "Run As Unit test"