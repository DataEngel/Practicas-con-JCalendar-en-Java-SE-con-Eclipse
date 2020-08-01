package com.tesji.model;

//Importamos la vista
import com.tesji.view.CalendarView;   

public class Model {  
	
	//Asignamos los atrubutos iguales nombres de la vista para obtener los datos de ahi
	public int days;
	public int days_born;
	public int days_actual;
	public int month_actual;
	public int mes_nacimiento;  
	public int year_actual;
	public int year_born;

	public String total() {
		
		//Creamos atributos locales para hacer ciertas operaciones 
		int days1;
		int yearTotal;
		int monthTotal;
		int daysTotal;
		
		//Comprobamos de acuerdo a los meses 
		if (year_born % 4 == 0) {
			days -= 1;
		} else {
			days -= 2;
		}

		//Obtenermos un promedio de los dias del ano en ano biciesto 
		yearTotal = (int) (days / 365.25);
		//Obtenemos el total de dias 
		days1 = (int) (days - (yearTotal * 365.25));
		
		//Obtenemos el total de meses
		monthTotal = days1 / 30;  
		
		//Obtenemos los dias de tu edad 
		daysTotal = days1 - (monthTotal * 30);
		
		//Comapramos cuando se introducen las mismas fechas 
		if (daysTotal == -1) {
			daysTotal = 0;
		}

		//retornamos el mensaje que ira al textArea
		return "Tu edad es :" + "\n" + " years: " + yearTotal + "\n" + " mes: "
		+ monthTotal + "\n" + " Dias: " + daysTotal;
	}

}

