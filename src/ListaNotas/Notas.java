package ListaNotas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notas {
	public String textoNota;
	public String fechaCreacion;
	public String categoria;
	
	public Notas()
	{
		
	}

	public Notas(String texto, String categoria)
	{
		Date date = new Date();
		DateFormat fechaActual = new SimpleDateFormat("dd/MM/yyyy");
		this.fechaCreacion=fechaActual.format(date);
		this.textoNota = texto;
		this.categoria = categoria;
	}
	
	public String getFechaCreacion()
	{
		return this.fechaCreacion;
	}
	
	public String getTextoNota()
	{
		return this.textoNota;
	}
	
	public void setTextoNota(String texto)
	{
		this.textoNota = texto;
	}
	
	public String getCategoria()
	{
		return this.categoria;
	}
	
	public void setCategoria(String categoria)
	{
		this.categoria = categoria;
	}
	
	public String toString()
	{
		return this.getFechaCreacion() + " " + this.getTextoNota() + " " + this.getTextoNota();
	}
}
