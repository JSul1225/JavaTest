package sungjuk.model.DTO;

public class SungjuckDTO {

	private String name;
	private String kor;
	private String eng;
	private String mat;
	private String sci;
	private String his;
	private String total;
	private String ave;
	private String grade;
	
	public SungjuckDTO() {
		
	}
	
	public SungjuckDTO(String name, String kor, String eng, String mat, String sci, String his) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sci = sci;
		this.his = his;
		
		int total_ = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(mat) + Integer.parseInt(sci) + Integer.parseInt(his);
		this.total = Integer.toString(total_);
		
		double ave_ = total_ / 5.0;
		this.ave = Double.toString(ave_);
		
		this.grade = "가";
		if(ave_ > 90) this.grade = "수";
		else if(ave_ > 80) this.grade = "우";
		else if(ave_ > 70) this.grade = "미";
		else if(ave_ > 60) this.grade = "양";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getSci() {
		return sci;
	}
	public void setSci(String sci) {
		this.sci = sci;
	}
	public String getHis() {
		return his;
	}
	public void setHis(String his) {
		this.his = his;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getAve() {
		return ave;
	}
	public void setAve(String ave) {
		this.ave = ave;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String display() {
		return name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sci + "\t" + his + "\t" + total + "\t" + ave + "\t" + grade;
	}
}
