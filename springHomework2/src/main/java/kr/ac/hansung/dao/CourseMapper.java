package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.Course;

public class CourseMapper implements RowMapper<Course> {

	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {

		Course course = new Course();

		course.setYear(rs.getInt("year"));
		course.setTerm(rs.getInt("term"));
		course.setSubject(rs.getString("subject"));
		course.setSubjectCode(rs.getString("subjectCode"));
		course.setSeparation(rs.getString("separation"));
		course.setCredit(rs.getInt("credit"));

		return course;

	}

}