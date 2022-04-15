package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "carteiraDigital", sequenceName = "SQ_TB_CARTEIRA_DIGITAL", allocationSize = 1)
@Table(name = "TB_CARTEIRA_DIGITAL")
public class CarteiraDigital {
	
	@Id
	@GeneratedValue(generator = "carteiraDigital", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_carteira")
	private Integer id;

}
