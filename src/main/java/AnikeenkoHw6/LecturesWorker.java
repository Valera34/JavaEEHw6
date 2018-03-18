package AnikeenkoHw6;

import org.springframework.beans.factory.annotation.Autowired;

import com.entities.Lecture;

public class LecturesWorker {
@Autowired
LecturesDao lecturesDao;
public Lecture addLecture(Lecture lecture){
lecture = lecturesDao.addLecture(lecture);
System.out.println(lecture);
return lecture;
}
}
