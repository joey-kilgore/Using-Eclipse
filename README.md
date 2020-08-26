# Using-Eclipse
Learn how to use the Eclipse IDE

Now we can start programming  
## Creating the Hello World Project  
To create the actual java project simply:  
1. Click File  
2. Click New >  
3. Click Java Project  
4. Name your project. Usually this should just relate to the project at hand. (ex. Lab 1, Calculator, etc)  
5. Check the Location of your project. Make sure you know where your project will be saved!  
6. Check that the project is using the correct jre  
7. Click Finish  
8. If prompted to 'Create module-info.java' then select 'Don't Create'  

You should see in the Package Explorer Pane your new project. From here we will create a java file, and try and run it!  

1. Right click on your project  
2. Click New >  
3. Click Class  
4. Fill in the "Name:" field. The name of your class will also be the name of the file. Note that for your projects to run with the automated script Josh has made, taht you will need to name your file that contains the main method Main  
5. There should now be a new .java file in your project, it should be in the following structure in your Package Explorer pane  
  Project > src > (default package) > Main.java  
6. Now we can open that file and put the following code in it  
  ```{java}
  // This is a simple Hello World Program
public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("HELLO WORLD");
	}
}
```  
7. To run your program click on the green play button at the top, or press F11
You should see HELLO WORLD pop up on the console window.  
Congratulations if you got this far then you have successfully setup Eclipse, and wrote what is likely your first java program!  

## More Help :)  
For more help check out the different folder put together. They each have a README.md file with instructions that should walk you through more tips and tricks while writing code.  
Remember have fun, and don't beat yourself up when your code doesn't work. There are professionals who have been writing code for decades that still make mistakes and have trouble compiling their code. Also use the issues tab on this repository to ask questions!
