package br.com.facisa.atividadep3;

public class ConversorDeTemperatura {
	
	private double fahrenheit;
	private static final double ABSOLUTO=-459.69;
	
	
	public ConversorDeTemperatura() {
		// TODO Auto-generated constructor stub
	}
	public ConversorDeTemperatura(double fahrenheit){
		super();
		this.fahrenheit = fahrenheit;
	}
	public double getFahrenheit()throws FahrenheitException {
		return fahrenheit;
	}
	public void setFahrenheit(double fahrenheit) throws FahrenheitException {
		if(this.fahrenheit< ABSOLUTO){
			throw new FahrenheitException();
		}else{
			this.fahrenheit = fahrenheit;
		}
		
		this.fahrenheit = fahrenheit;
	}
	

}
