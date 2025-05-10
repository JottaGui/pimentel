package pimentel;

public class Secretarias extends Funcionario{

		public Secretarias(String ramal) {
		super();
		this.ramal = ramal;
	}

		public Secretarias() {
			super();
		}

		public String ramal;

		public String getRamal() {
			return ramal;
		}

		public void setRamal(String ramal) {
			this.ramal = ramal;
		}
}
