package org.tutev.cagri.web.dto.uygulama;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="UYG_ALTMENU")
public class AltMenu implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long id;
	String adi;
	Menu menu;
	AltMenu altMenu;
	int gosterimSirasi;
	
	@Id
	@SequenceGenerator(allocationSize=1,initialValue=1,name="ALTMENU_ID_SEQ",sequenceName="ALTMENU_ID_SEQ")
	@GeneratedValue(generator="ALTMENU_ID_SEQ",strategy=GenerationType.SEQUENCE)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="AD",length=150,nullable=false)
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	@JoinColumn(name="MENU_ID",nullable=false)
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	@Column(name="SIRA",nullable=false)
	public int getGosterimSirasi() {
		return gosterimSirasi;
	}
	public void setGosterimSirasi(int gosterimSirasi) {
		this.gosterimSirasi = gosterimSirasi;
	}
	
	@JoinColumn(name="ALTMENU_ID")
	@OneToOne(fetch=FetchType.LAZY,optional=true)
	public AltMenu getAltMenu() {
		return altMenu;
	}
	public void setAltMenu(AltMenu altMenu) {
		this.altMenu = altMenu;
	}
	

}
