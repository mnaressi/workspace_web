package br.com.isidrocorp.eventdash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;




@Entity                           
@Table(name="itmn_evento")       
public class Evento {

	@Column(name="num_seq")                              
	@Id                                                      
	@GeneratedValue(strategy=GenerationType.IDENTITY)       
	private int num_seq;
	
	@Column(name="data_evt", nullable=true)  
	private Date data_evt;
	
	@Column(name="id_alarme", nullable=false)  
	private int id_alarme;
	
	@Column(name="id_equip", nullable=false)  
	private int id_equip;

	public int getNum_seq() {
		return num_seq;
	}
	public void setNum_seq(int num_seq) {
		this.num_seq = num_seq;
	}
	public Date getData_evt() {
		return data_evt;
	}
	public void setData_evt(Date data_evt) {
		this.data_evt = data_evt;
	}
	public int getId_alarme() {
		return id_alarme;
	}
	public void setId_alarme(int id_alarme) {
		this.id_alarme = id_alarme;
	}
	public int getId_equip() {
		return id_equip;
	}
	public void setId_equip(int id_equip) {
		this.id_equip = id_equip;
	}
	
	
	
}