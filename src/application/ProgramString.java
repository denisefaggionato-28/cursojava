package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramString {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		Comment c1= new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2020 13:05:00")
				, "Traveling"
				,"I'm going to visit this..."
				, 12);
		p1.addComment(c1);
		p1.addComment(c2);
		System.out.println(p1);
		
		Comment c3= new Comment("Have a nice trip!");
		Comment c4 = new Comment("Wow that's awesome!");
		Post p2 = new Post(sdf.parse("22/06/2020 13:05:00")
				, "Traveling"
				,"I'm going to visit this..."
				, 4);
		p2.addComment(c1);
		p2.addComment(c2);
		System.out.println(p2);
		

	}

}
