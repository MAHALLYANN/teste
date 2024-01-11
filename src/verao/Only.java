package verao;

public class Only {
		String Nome;
        Double Nota1;
        Double Nota2;
	    Double Result;
	    String Situation;
	    
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
		public Double getNota1() {
			if(Nota1 >10.0) {
				Nota1 = 10.0;
			}if(Nota1 <0.0) {
				Nota1 = 0.0;
			} return Nota1;
		}
		public void setNota1(Double nota1) {
			Nota1 = nota1;
		}
		public Double getNota2() {
			if(Nota2 >10.0) {
				Nota2 = 10.0;
			}if(Nota2 <0.0) {
				Nota2 = 0.0;
			} return Nota2;
		}
		public void setNota2(Double nota2) {
			Nota2 = nota2;
		}
		public Double getResult() {
			return Result = Nota1 + Nota2/2;
		}
		public void setResult(Double result) {
			Result = result;
		}
		public String getSituation() {
			return Situation;
		}
		public void setSituation(String situation) {
			Situation = situation;
		}
	    
	    

}
