package com.meruvia.ariesWS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "personal")
@EntityListeners(AuditingEntityListener.class)
public class Personal {

	//Propiedades
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_personal")
	private int codPersonal;
	
	@Column(name = "NOMBRES_PERSONAL")
    private String nombresPersonal;
	
	@Column(name = "AP_PATERNO_PERSONAL")
    private String apPaternoPersonal;
	
	@Column(name = "AP_MATERNO_PERSONAL")
    private String apMaternoPersonal;
	
	@Column(name = "NOMBRE_USUARIO")
    private String  nombreUsuario;
	
	@Column(name = "CONTRASENA_USUARIO")
    private String  contraseniaUsuario;
	
	@Column(name = "cod_area_empresa")
    private int codAreaEmpresa;
	
	@Column(name = "nombre_area_empresa")
    private String nombreAreaEmpresa;
	
	@Column(name = "cod_cargo")
    private int codCargo;

	
	//Getters and Setters
	/**
	 * @return the codPersonal
	 */
	public int getCodPersonal() {
		return codPersonal;
	}

	/**
	 * @param codPersonal the codPersonal to set
	 */
	public void setCodPersonal(int codPersonal) {
		this.codPersonal = codPersonal;
	}

	/**
	 * @return the nombresPersonal
	 */
	public String getNombresPersonal() {
		return nombresPersonal;
	}

	/**
	 * @param nombresPersonal the nombresPersonal to set
	 */
	public void setNombresPersonal(String nombresPersonal) {
		this.nombresPersonal = nombresPersonal;
	}

	/**
	 * @return the apPaternoPersonal
	 */
	public String getApPaternoPersonal() {
		return apPaternoPersonal;
	}

	/**
	 * @param apPaternoPersonal the apPaternoPersonal to set
	 */
	public void setApPaternoPersonal(String apPaternoPersonal) {
		this.apPaternoPersonal = apPaternoPersonal;
	}

	/**
	 * @return the apMaternoPersonal
	 */
	public String getApMaternoPersonal() {
		return apMaternoPersonal;
	}

	/**
	 * @param apMaternoPersonal the apMaternoPersonal to set
	 */
	public void setApMaternoPersonal(String apMaternoPersonal) {
		this.apMaternoPersonal = apMaternoPersonal;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return the contraseniaUsuario
	 */
	public String getContraseniaUsuario() {
		return contraseniaUsuario;
	}

	/**
	 * @param contraseniaUsuario the contraseniaUsuario to set
	 */
	public void setContraseniaUsuario(String contraseniaUsuario) {
		this.contraseniaUsuario = contraseniaUsuario;
	}

	/**
	 * @return the codAreaEmpresa
	 */
	public int getCodAreaEmpresa() {
		return codAreaEmpresa;
	}

	/**
	 * @param codAreaEmpresa the codAreaEmpresa to set
	 */
	public void setCodAreaEmpresa(int codAreaEmpresa) {
		this.codAreaEmpresa = codAreaEmpresa;
	}

	/**
	 * @return the nombreAreaEmpresa
	 */
	public String getNombreAreaEmpresa() {
		return nombreAreaEmpresa;
	}

	/**
	 * @param nombreAreaEmpresa the nombreAreaEmpresa to set
	 */
	public void setNombreAreaEmpresa(String nombreAreaEmpresa) {
		this.nombreAreaEmpresa = nombreAreaEmpresa;
	}

	/**
	 * @return the codCargo
	 */
	public int getCodCargo() {
		return codCargo;
	}

	/**
	 * @param codCargo the codCargo to set
	 */
	public void setCodCargo(int codCargo) {
		this.codCargo = codCargo;
	}
	
}
