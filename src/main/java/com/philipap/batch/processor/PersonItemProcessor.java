package com.philipap.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.philipap.model.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person>{
	
	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

	@Override
	public Person process(final Person person) throws Exception {
		return person;	
		
	}

	
	

}
