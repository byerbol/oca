class Scope{
	public static void main(String[] args) {
		String one, two;
		one = new String("a");
		two = new String("b");
		one = two;
		String three = one;
		one = null;

		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
}

/*
When you get asked a question about garbage collection on the exam, we recommend
you draw what’s going on. There’s a lot to keep track of in your head and it’s easy to make
a silly mistake trying to keep it all in your memory. Let’s try it together now. Really. Get a
pencil and paper. We’ll wait.
Got that paper? Okay, let’s get started. On line 3, we write one and two . Just the words.
No need for boxes or arrows yet since no objects have gone on the heap yet. On line 4,
we have our fi rst object. Draw a box with the string "a" in it and draw an arrow from the
word one to that box. Line 5 is similar. Draw another box with the string "b" in it this time
and an arrow from the word two . At this point, your work should look like Figure 1.2.
On line 6, the variable one changes to point to "b" . Either erase or cross out the arrow
from one and draw a new arrow from one to "b" . On line 7, we have a new variable, so
write the word three and draw an arrow from three to "b" . Notice that three points to
what one is pointing to right now and not what it was pointing to at the beginning. This
is why we are drawing pictures. It’s easy to forget something like that. At this point, your
work should look like Figure 1.3.

Finally, cross out the line between one and "b" since line 8 sets this variable to null.
Now, we were trying to fi nd out when the objects were fi rst eligible for garbage collection.
On line 6, we got rid of the only arrow pointing to "a" , making that object eligible for
garbage collection. "b" has arrows pointing to it until it goes out of scope. This means "b"
doesn’t go out of scope until the end of the method on line 9.



*/