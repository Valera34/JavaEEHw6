package AnikeenkoHw6;

import com.entities.Lecture;

public interface LecturesDao {

Lecture addLecture(Lecture lecture);

Lecture getLecture(int id);

void saveLecture(Lecture lecture);

}
