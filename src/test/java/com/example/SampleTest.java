package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.base.CharMatcher;

public class SampleTest {

	@Test
	public void testname() throws Exception {
		
		assertTrue(CharMatcher.ASCII.matchesAllOf("a-a_a_!#$%&()=~|b@example.com"));
		
		// 短いenダッシュ「–」(Unicode U+2013、JIS X 0213 1-1-30) 
		System.out.println(Character.codePointAt("–", 0));
		assertFalse(CharMatcher.ASCII.matchesAllOf("a–a@example.com"));

		// 長いemダッシュ「—」(Unicode U+2014、JIS X 0213 1-1-29)
		System.out.println(Character.codePointAt("—", 0));
		assertFalse(CharMatcher.ASCII.matchesAllOf("a—a@example.com"));
		
	}
}
