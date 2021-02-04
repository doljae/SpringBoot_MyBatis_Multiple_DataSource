package myspring.user.movie.vo;

import java.sql.Date;

public class MovieVo {
	private int id;
	private String title;
	private String genre;
	private String director;
	private int runningtime;
	private Date openDate;

	public MovieVo() {

	}

	public MovieVo(String title, String genre, String director, int runningtime) {
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.runningtime = runningtime;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRunningtime() {
		return runningtime;
	}

	public void setRunningtime(int runningtime) {
		this.runningtime = runningtime;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	@Override
	public String toString() {
		return "MovieVo [id=" + id + ", title=" + title + ", genre=" + genre + ", director=" + director
				+ ", runningtime=" + runningtime + ", openDate=" + openDate + "]";
	}
	

}
