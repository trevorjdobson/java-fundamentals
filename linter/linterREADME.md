## Linter
This linter takes in a javascript file and reads through it line by line.  It will do a println for every line that does not have a semicolon except for lines that contain if or else, lines that end in a curly brace, or if the line is empty.  When running the App it should run the linter on one file and you should see a series of prints that say "Line number has no semicolon".  When running the test it will run the same method on a series of files and you should see similar behavoir except some files only contain a few or one errors and one file doesn't contain any errors.