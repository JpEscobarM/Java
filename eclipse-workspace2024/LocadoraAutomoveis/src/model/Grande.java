package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Grande extends Carro implements Serializable{
	
	
	public Grande(String placa, String tipo, int ano, double valor,Cliente cliente) {
		super(placa, tipo, ano, valor,cliente);

		
	}
	@Override
	public double valorBase() {
			int idade=LocalDate.now().getYear()-this.getAno();
			double desconto=idade*0.02;
			if(desconto>0.08) {
				desconto=0.08;
				
			}
			return this.getValorDiaria()*(1-desconto);
		}
	}

