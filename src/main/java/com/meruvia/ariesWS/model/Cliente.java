package com.meruvia.ariesWS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "clientes")
@EntityListeners(AuditingEntityListener.class)
public class Cliente {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_cliente")
	private int codCliente;
	
	@Column(name = "nit_cliente")
	private String nitCliente;
	
	@Column(name = "nombre_cliente")
	private String nombreCliente;
	
	@Column(name = "cod_tipo_cliente")
	private int codTipoCliente;
	
	@Column(name = "nombre_factura")
	private String nombreFactura;
	
	@Column(name = "cod_modalidad")
	private int codModalidadVenta;
	
	@Column(name = "nombre_modalidad")
	private String nombreModalidadVenta;
	
	@Column(name = "cod_tipoventa")
	private int codTipoVenta;
	
	@Column(name = "cod_cadenacliente")
	private int codCadenaCliente;
	
	@Column(name = "aplica_oferta")
	private String aplicarOferta;
	
	@Column(name = "tiene_convenio")
	private boolean tieneConvenio;
	
	@Column(name = "cod_area_empresa")
	private int codAreaEmpresa;
	
	@Column(name = "zona_viaje")
	private String zonaViaje="";
	
	@Column(name = "descuento_catalogo")
	private double descuentoCatalogo;
	
	@Column(name = "descuento_fidelidad")
	private double descuentoFidelidad;
	
	//@Column(name = "descuento_fidelidad_copia")
	//private double descuentoFidelidadCopia;
	
	@Column(name = "descuento_contado")
	private double descuentoContado;

	//@Column(name = "descuento_contado_copia")
	//private double descuentoContadoCopia;
	
	@Column(name = "descuento_jr")
	private double descuentoJR;
	
	@Column(name = "descuento_preferencial")
	private double descuentoPreferencial;

	/**
	 * @return the codCliente
	 */
	public int getCodCliente() {
		return codCliente;
	}

	/**
	 * @param codCliente the codCliente to set
	 */
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	/**
	 * @return the nitCliente
	 */
	public String getNitCliente() {
		return nitCliente;
	}

	/**
	 * @param nitCliente the nitCliente to set
	 */
	public void setNitCliente(String nitCliente) {
		this.nitCliente = nitCliente;
	}

	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	/**
	 * @return the codTipoCliente
	 */
	public int getCodTipoCliente() {
		return codTipoCliente;
	}

	/**
	 * @param codTipoCliente the codTipoCliente to set
	 */
	public void setCodTipoCliente(int codTipoCliente) {
		this.codTipoCliente = codTipoCliente;
	}

	/**
	 * @return the nombreFactura
	 */
	public String getNombreFactura() {
		return nombreFactura;
	}

	/**
	 * @param nombreFactura the nombreFactura to set
	 */
	public void setNombreFactura(String nombreFactura) {
		this.nombreFactura = nombreFactura;
	}

	/**
	 * @return the codModalidadVenta
	 */
	public int getCodModalidadVenta() {
		return codModalidadVenta;
	}

	/**
	 * @param codModalidadVenta the codModalidadVenta to set
	 */
	public void setCodModalidadVenta(int codModalidadVenta) {
		this.codModalidadVenta = codModalidadVenta;
	}

	/**
	 * @return the nombreModalidadVenta
	 */
	public String getNombreModalidadVenta() {
		return nombreModalidadVenta;
	}

	/**
	 * @param nombreModalidadVenta the nombreModalidadVenta to set
	 */
	public void setNombreModalidadVenta(String nombreModalidadVenta) {
		this.nombreModalidadVenta = nombreModalidadVenta;
	}

	/**
	 * @return the codTipoVenta
	 */
	public int getCodTipoVenta() {
		return codTipoVenta;
	}

	/**
	 * @param codTipoVenta the codTipoVenta to set
	 */
	public void setCodTipoVenta(int codTipoVenta) {
		this.codTipoVenta = codTipoVenta;
	}

	/**
	 * @return the codCadenaCliente
	 */
	public int getCodCadenaCliente() {
		return codCadenaCliente;
	}

	/**
	 * @param codCadenaCliente the codCadenaCliente to set
	 */
	public void setCodCadenaCliente(int codCadenaCliente) {
		this.codCadenaCliente = codCadenaCliente;
	}

	/**
	 * @return the aplicarOferta
	 */
	public String getAplicarOferta() {
		return aplicarOferta;
	}

	/**
	 * @param aplicarOferta the aplicarOferta to set
	 */
	public void setAplicarOferta(String aplicarOferta) {
		this.aplicarOferta = aplicarOferta;
	}

	/**
	 * @return the tieneConvenio
	 */
	public boolean isTieneConvenio() {
		return tieneConvenio;
	}

	/**
	 * @param tieneConvenio the tieneConvenio to set
	 */
	public void setTieneConvenio(boolean tieneConvenio) {
		this.tieneConvenio = tieneConvenio;
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
	 * @return the zonaViaje
	 */
	public String getZonaViaje() {
		return zonaViaje;
	}

	/**
	 * @param zonaViaje the zonaViaje to set
	 */
	public void setZonaViaje(String zonaViaje) {
		this.zonaViaje = zonaViaje;
	}

	/**
	 * @return the descuentoCatalogo
	 */
	public double getDescuentoCatalogo() {
		return descuentoCatalogo;
	}

	/**
	 * @param descuentoCatalogo the descuentoCatalogo to set
	 */
	public void setDescuentoCatalogo(double descuentoCatalogo) {
		this.descuentoCatalogo = descuentoCatalogo;
	}

	/**
	 * @return the descuentoFidelidad
	 */
	public double getDescuentoFidelidad() {
		return descuentoFidelidad;
	}

	/**
	 * @param descuentoFidelidad the descuentoFidelidad to set
	 */
	public void setDescuentoFidelidad(double descuentoFidelidad) {
		this.descuentoFidelidad = descuentoFidelidad;
	}

	/**
	 * @return the descuentoFidelidadCopia
	 */
	/*public double getDescuentoFidelidadCopia() {
		return descuentoFidelidadCopia;
	}*/

	/**
	 * @param descuentoFidelidadCopia the descuentoFidelidadCopia to set
	 */
	/*public void setDescuentoFidelidadCopia(double descuentoFidelidadCopia) {
		this.descuentoFidelidadCopia = descuentoFidelidadCopia;
	}*/

	/**
	 * @return the descuentoContado
	 */
	public double getDescuentoContado() {
		return descuentoContado;
	}

	/**
	 * @param descuentoContado the descuentoContado to set
	 */
	public void setDescuentoContado(double descuentoContado) {
		this.descuentoContado = descuentoContado;
	}

	/**
	 * @return the descuentoContadoCopia
	 */
	/*public double getDescuentoContadoCopia() {
		return descuentoContadoCopia;
	}*/

	/**
	 * @param descuentoContadoCopia the descuentoContadoCopia to set
	 */
	/*public void setDescuentoContadoCopia(double descuentoContadoCopia) {
		this.descuentoContadoCopia = descuentoContadoCopia;
	}*/

	/**
	 * @return the descuentoJR
	 */
	public double getDescuentoJR() {
		return descuentoJR;
	}

	/**
	 * @param descuentoJR the descuentoJR to set
	 */
	public void setDescuentoJR(double descuentoJR) {
		this.descuentoJR = descuentoJR;
	}

	/**
	 * @return the descuentoPreferencial
	 */
	public double getDescuentoPreferencial() {
		return descuentoPreferencial;
	}

	/**
	 * @param descuentoPreferencial the descuentoPreferencial to set
	 */
	public void setDescuentoPreferencial(double descuentoPreferencial) {
		this.descuentoPreferencial = descuentoPreferencial;
	}

}
