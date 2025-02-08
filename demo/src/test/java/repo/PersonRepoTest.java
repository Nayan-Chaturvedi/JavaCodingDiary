package repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import java.security.spec.PSSParameterSpec;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Person;
import com.example.demo.PersonRepo;
import com.example.demo.PersonService;


public class PersonRepoTest
{
	@Mock
	private PersonRepo personRepo;
	
	private PersonService personService;
	
	@BeforeEach
	void setUp()
	{
		this.personService = new PersonService(this.personRepo);
	}
	
	@Test
	void getAllPerson()
	{
		personService.getAllPerson();
		verify(personRepo).findAll();
	}
}
