package com.example.MyFirstApplication;

import com.example.MyFirstApplication.Dao.StudentDao;
import com.example.MyFirstApplication.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstApplication.class, args);

	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner -> {
			createStudent(studentDao);
			System.out.println("Date Inserted");
			readStudent(studentDao);
			System.out.println("Data Read");

		};


	}

	public void createStudent(StudentDao studentDao){
		Student student = new Student("Neha", "Nagpur", "Dighori");
		studentDao.save(student);

	}

	public void readStudent(StudentDao studentDao){

		System.out.println(studentDao.read(1));
	}

	public void updateStudent(StudentDao studentDao){
		Student student = new Student("Sakshi", "Nandanvan","Nagpur");
		studentDao.update(student);
	}


}
