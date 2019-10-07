package com.meruvia.ariesWS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "presentaciones_producto")
@EntityListeners(AuditingEntityListener.class)
public class PresentacionesProducto {
	
	@Id
	@Column(name = "cod_presentacion")
	private int codPresentacion;
	
	@Column(name = "cantidad_existencia")
	private int cantidadExistencia;
	
	@Column(name = "nombre_producto_presentacion")
	private String nombreProductoPresentacion;
	
	@Column(name = "cantidad_presentacion")
	private int cantidadPresentacion;
	
	@Column(name = "precio_lista")
	private double precioLista;
	
	@Column(name = "precio_corriente")
	private double precioCorriente;
	
	@Column(name = "precio_minimo")
	private double precioMinimo;
	
	@Column(name = "precio_zona_viaje")
	private double precioZonaViaje;
	
	@Column(name = "cod_lineamkt")
	private int codLineaMKT;
	
	@Column(name = "CANTIDAD_MINIMA_BLISTER")
	private int cantidadMinimaBlister;

	/**
	 * @return the codPresentacion
	 */
	public int getCodPresentacion() {
		return codPresentacion;
	}

	/**
	 * @param codPresentacion the codPresentacion to set
	 */
	public void setCodPresentacion(int codPresentacion) {
		this.codPresentacion = codPresentacion;
	}

	/**
	 * @return the cantidadExistencia
	 */
	public int getCantidadExistencia() {
		return cantidadExistencia;
	}

	/**
	 * @param cantidadExistencia the cantidadExistencia to set
	 */
	public void setCantidadExistencia(int cantidadExistencia) {
		this.cantidadExistencia = cantidadExistencia;
	}

	/**
	 * @return the nombreProductoPresentacion
	 */
	public String getNombreProductoPresentacion() {
		return nombreProductoPresentacion;
	}

	/**
	 * @param nombreProductoPresentacion the nombreProductoPresentacion to set
	 */
	public void setNombreProductoPresentacion(String nombreProductoPresentacion) {
		this.nombreProductoPresentacion = nombreProductoPresentacion;
	}

	/**
	 * @return the cantidadPresentacion
	 */
	public int getCantidadPresentacion() {
		return cantidadPresentacion;
	}

	/**
	 * @param cantidadPresentacion the cantidadPresentacion to set
	 */
	public void setCantidadPresentacion(int cantidadPresentacion) {
		this.cantidadPresentacion = cantidadPresentacion;
	}

	/**
	 * @return the precioLista
	 */
	public double getPrecioLista() {
		return precioLista;
	}

	/**
	 * @param precioLista the precioLista to set
	 */
	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}

	/**
	 * @return the precioCorriente
	 */
	public double getPrecioCorriente() {
		return precioCorriente;
	}

	/**
	 * @param precioCorriente the precioCorriente to set
	 */
	public void setPrecioCorriente(double precioCorriente) {
		this.precioCorriente = precioCorriente;
	}

	/**
	 * @return the precioMinimo
	 */
	public double getPrecioMinimo() {
		return precioMinimo;
	}

	/**
	 * @param precioMinimo the precioMinimo to set
	 */
	public void setPrecioMinimo(double precioMinimo) {
		this.precioMinimo = precioMinimo;
	}

	/**
	 * @return the precioZonaViaje
	 */
	public double getPrecioZonaViaje() {
		return precioZonaViaje;
	}

	/**
	 * @param precioZonaViaje the precioZonaViaje to set
	 */
	public void setPrecioZonaViaje(double precioZonaViaje) {
		this.precioZonaViaje = precioZonaViaje;
	}

	/**
	 * @return the codLineaMKT
	 */
	public int getCodLineaMKT() {
		return codLineaMKT;
	}

	/**
	 * @param codLineaMKT the codLineaMKT to set
	 */
	public void setCodLineaMKT(int codLineaMKT) {
		this.codLineaMKT = codLineaMKT;
	}

	/**
	 * @return the cantidadMinimaBlister
	 */
	public int getCantidadMinimaBlister() {
		return cantidadMinimaBlister;
	}

	/**
	 * @param cantidadMinimaBlister the cantidadMinimaBlister to set
	 */
	public void setCantidadMinimaBlister(int cantidadMinimaBlister) {
		this.cantidadMinimaBlister = cantidadMinimaBlister;
	}
	
	
	
	
/*
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_presentacion")
	private int codPresentacion;
	
	@Column(name = "nombre_producto_presentacion")
	private String nombreProductoPresentacion = "";
	
	@Column(name = "cantidad_presentacion")
	private int cantidadPresentacion;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "cantidad_unitaria")
	private int cantidadUnitaria;
	
	@Column(name = "cod_linea_mkt")
    private int codLineaMKT;
	
	@Column(name = "cod_area_empresa")
    private int codAreaEmpresa;
	
	@Column(name = "precio_lista")
    private double precioLista;
	
	@Column(name = "precio_corriente")
    private double precioCorriente;
	
	@Column(name = "precio_minimo")
    private double precioMinimo;
	
	@Column(name = "precio_zona_viaje")
    private double precioZonaViaje;
	
	@Column(name = "precio_final")
    private double precioFinal;
	
	@Column(name = "precio_fidelidad")
    private double precioFidelidad;
	
	@Column(name = "importe_producto")
    private double importeProducto;
	
	@Column(name = "cod_oferta")
    private int codOferta;
	
	@Column(name = "cod_tipo_oferta")
    private int codTipoOferta;
	
	@Column(name = "cod_presentacion_bonifi")
    private int codPresentacionBonifi;
	
	@Column(name = "cantidad_existencia")
    private int cantidadExistencia;
	
	@Column(name = "cantidad_unitaria_pedido")
    private int cantidadUnitariaPedido;
	
	@Column(name = "cantidad_bonificacion")
    private int cantidadBonificacion;
	
	@Column(name = "cantidad_unitaria_bonificacion")
    private int cantidadUnitariaBonificacion;
	
	@Column(name = "cantidad_unitaria_total")
    private int cantidadUnitariaTotal;
	
	@Column(name = "cantidad_unitaria_compra")
	private int cantidadUnitariaCompra;
	
	@Column(name = "cantidad_unitaria_bonificacion_compra")
	private int cantidadUnitariaBonificacionCompra;
	
	@Column(name = "cantidad_minima_blister")
	private int cantidadMinimaBlister;
	
	@Column(name = "porcentaje_descuento_JR2")
    private double porcentajeDescuentoJR2;
	
	@Column(name = "porcentaje_descuento_estandar")
    private double porcentajeDescuentoEstandar;
	
	@Column(name = "porcentaje_descuento_final")
    private double porcentajeDescuentoFinal;
	
	@Column(name = "porcentaje_descuento_JR")
    private double porcentajeDescuentoJR;
	
	@Column(name = "porcentaje_descuento_oferta")
    private double porcentajeDescuentoOferta;
	
	@Column(name = "porcentaje_descuento_oferta2")
    private double porcentajeDescuentoOferta2;
	
	@Column(name = "nombre_campania_oferta")
    private String nombreCampaniaOferta;
	
	@Column(name = "cod_campania_aplicar")
    private int codCampaniaAplicar;
	
	@Column(name = "aplicar_oferta_MP")
    private boolean aplicarOfertaMP=true;
	
	@Column(name = "cod_pedido")
    private int codPedido;
	
	@Column(name = "cod_pedido_detalle")
	private int codPedidoDetalle;
	
	@Column(name = "checked")
	private boolean checked;
	//ArrayList ofertas = new ArrayList<CampaniasOfertaDetalle>();
	
	*/
}
