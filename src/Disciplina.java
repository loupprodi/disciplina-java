
public class Disciplina 
{
	private String disciplina;
	private String professor;
	private int qtdAlunos;
	private double tempoSemestre;
	private float sala;
	
	public Disciplina(String disciplina, String professor, int qtdAlunos, double tempoSemestre, float sala)
	{
		setDisciplina(disciplina);
		setProfessor(professor);
		setQtdAlunos(qtdAlunos);
		setTempoSemestre(tempoSemestre);
		setSala(sala);
	}

	public String getDisciplina() {
		return disciplina;
	}
	public String getProfessor() {
		return professor;
	}
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public double getTempoSemestre() {
		return tempoSemestre;
	}
	public float getSala() {
		return sala;
	}
	

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public void setTempoSemestre(double tempoSemestre) {
		this.tempoSemestre = tempoSemestre;
	}
	public void setSala(float sala) {
		this.sala = sala;
	}
	
	public String toString()
	{
		return String.format("\nA disciplina %s ira ser lecionada pelo professor %s.\nA aula acontecerá na sala %.0f. \nA disciplina tem %d de alunos matriculados e a quantidade de hora total é %.2f.",getDisciplina(),getProfessor(),getSala(),getQtdAlunos(),getTempoSemestre());
	}
	
}
