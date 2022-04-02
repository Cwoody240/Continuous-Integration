package edu.odu.cs.cs350;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class TestBook {

	@Test
	void testBook() {
		// Author myAuthor = new Author("", "");
		Author[] au = { new Author("", "") };
		Book book1 = new Book();
		assertThat(book1.getTitle(), is(""));
		assertThat(book1.getPublisher(), is(""));
		assertThat(book1.getISBN(), is(""));
		assertArrayEquals(au, au);

	}

	@Test
	void testBookStringStringStringAuthorArray() {

		// Author myAuthor = new Author("Tolstoy", "Leo");
		Author[] au = { new Author("Tolstoy", "Leo") };

		Book book2 = new Book("War and Peace", "Tolstoy", "9783863523817", au);

		assertThat(book2.getTitle(), is("War and Peace"));
		assertThat(book2.getPublisher(), is("Tolstoy"));
		assertThat(book2.getISBN(), is("9783863523817"));
		assertArrayEquals(au, au);
	}

	@Test
	void testGetTitle() {
		Book bk = new Book();
		bk.setTitle("War and Peace");
		assertThat(bk.getTitle(), is("War and Peace"));

	}

	@Test
	void testSetTitle() {
		Book bk = new Book();
		bk.setTitle("War and Peace");
		assertThat(bk.getTitle(), is("War and Peace"));
	}

	@Test
	void testGetISBN() {
		Book bn = new Book();
		bn.setISBN("9783863523817");
		assertThat(bn.getISBN(), is("9783863523817"));
	}

	@Test
	void testSetISBN() {
		Book bn = new Book();
		bn.setISBN("9783863523817");
		assertThat(bn.getISBN(), is("9783863523817"));
	}

	@Test
	void testGetPublisher() {
		Book p = new Book();
		p.setPublisher("Tolstoy");
		assertThat(p.getPublisher(), is("Tolstoy"));
	}

	@Test
	void testSetPublisher() {
		Book p = new Book();
		p.setPublisher("Tolstoy");
		assertThat(p.getPublisher(), is("Tolstoy"));
	}

	@Test
	void testNumAuthors() {
		Author[] au = { new Author("Tolstoy", "Leo") };
		assertArrayEquals(au, au);

	}

	@Test
	void testAddAuthor() {
		Author myAuthor = new Author("Tolstoy", "Leo");
		System.out.println(myAuthor);

	}

	@Test
	void testToString() {
		fail("Not yet implemented");

	}

	@Test
	void testEqualsObject() {

		Author[] au = { new Author("Tolstoy", "Leo") };

		Book book1 = new Book("War and Peace", "Tolstoy", "9783863523817", au);
		Book book2 = new Book("War and Peace", "Tolstoy", "9783863523817", au);
		assertEquals(book1, book2);
	}

	@Test
	void testClone() {
		Book book1 = new Book();
		Author[] au = { new Author("Tolstoy", "Leo") };
		Author myAuthor = new Author("Tolstoy", "Leo");
		for (int i = 0; i < au.length; ++i) {
			book1.addAuthor(myAuthor);
		}

		Book book2 = (Book) book1.clone();

		assertThat(book1, equalTo(book2));
		assertThat(book1.hashCode(), equalTo(book2.hashCode()));
		assertIterableEquals(book1, book2);
		assertThat(book1.toString(), is(book2.toString()));

	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testIterator() {
		Author au = new Author("Tolstoy", "Leo");
		Book bk = new Book();
		bk.addAuthor(au);
		bk.iterator();
	}

}
