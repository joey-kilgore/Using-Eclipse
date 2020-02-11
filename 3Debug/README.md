# Debugging  
Debugging is probably the most frustrating part of learning to code. There is no one size fits all process for debugging. This tutorial will hopefully give you the tools necessary to be able to find all the errors in your code.  

## System.out.println(variable)  
No it isn't pretty, but yes it sometimes just works. Printing a variable to the console and just seeing what it is can be extremely useful sometimes. This can be super fast and give you a start on where the problem might be. Remember to take these out when you are ready to turn your project in.  

## Using the Eclipse Debugger  
For an example copy and paste the Main.java into a sample project containing a Main.java folder.  
Go down to line 43 and double click on the line number. You should see a little blue dot appear next to the line number. This is called a breakpoint, and will be you best friend for this tutorial, and for the rest of your programming life.  
Breakpoints do exactly what they sound like, when your code is executing and it reaches a breakpoint your code will stop before it runs that line of code, and then allow you to peak inside the execution of your code to ensure everything is running smoothly.  
Since we have a breakpoint all we need to do is run the program in debug mode to see what happens.  
To run debug mode, click on the little green bug near where you normally run the program, or press F11.  
The program should start, and prompt you for a year to input. After entering in a year eclipse should ask if you want to switch to debug mode, click Switch.  
You are now in debug mode of eclipse. Notice how some of you panels have changed. Take a moment to look around and see what is available to you.  
The biggest change should be a panel called 'Variables'. This panel lets you look at all variables the current code has access to. Not only can you tell exactly what value everything is storing, but you can also change the value if you would like (which can be extremely helpful for testing specific edge cases quickly).  
To start stepping though our code we have a few options on how to keep moving.  
 * Step Into (F5) which will execute the line of code, and if it calls another method we will jump to that method.  
 * Step Over (F6) which will execute the line of code, and will NOT jump down into any called methods.  
 * Resume    (F8) which will continue execution of code like normal until another breakpoint is hit.  

*Warning about stepping into*  
Some called methods will lead you down a rabbit hole of strange code within the java.util or some other library. If you happen to find yourself in one of these strange files while quickly pressing F5 don't worry. Simply keep pressing F6 to continue through the library code until you eventually pop back to your code.  

## Proactive Debugging  
To ensure you are getting the most out of your debugging, you should be thinking about what is about to happen next. By thinking about the line of code before it executes you will be able to clearly see when your code does something unexpected/incorrect. If you thought the code should go in one direction, but then it goes in another it could be that you found where your bug is, or maybe you had something wrong in your original thought process. Either way, it is much better to be active in the debug process as opposed to simply pressing F5 repeatedly and watching variables change in hopes you might see the problem.  
