call mvn verify -Drunner="**/*ParallelRunner.java" -Dbrowser="firefox"
call mvn verify -Drunner="**/*ParallelRunner.java" -Dbrowser="edge"
call mvn verify -Drunner="**/*ParallelRunner.java" -Dbrowser="chrome"

