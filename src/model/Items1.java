package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;

/**
 * The persistent class for the items1 database table.
 * 
 */
@Entity
@NamedQuery(name="Items1.findAll", query="SELECT i FROM Items1 i")
public class Items1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attrib;

	private Integer cd;

	private Array components;

	private Integer cost;

	private Boolean created;

	private String description;

	private String dname;
	
	@Id
	private Integer id;

	private String img;

	private String lore;

	private Integer mc;

	private String notes;

	private String quality;

	public Items1() {
	}

	public String getAttrib() {
		return this.attrib;
	}

	public void setAttrib(String attrib) {
		this.attrib = attrib;
	}

	public Integer getCd() {
		return this.cd;
	}

	public void setCd(Integer cd) {
		this.cd = cd;
	}

	public Array getComponents() {
		return this.components;
	}

	public void setComponents(Array components) {
		this.components = components;
	}

	public Integer getCost() {
		return this.cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Boolean getCreated() {
		return this.created;
	}

	public void setCreated(Boolean created) {
		this.created = created;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getLore() {
		return this.lore;
	}

	public void setLore(String lore) {
		this.lore = lore;
	}

	public Integer getMc() {
		return this.mc;
	}

	public void setMc(Integer mc) {
		this.mc = mc;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getQuality() {
		return this.quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

}