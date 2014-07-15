package datacontainer;

import javax.json.JsonObject;

public class RawJsonAbility {
	
	String internalName;
	String displayName;
	String affects;
	String description;
	String notes;
	String damage;
	String attributes;
	String cooldownAndMana;
	String lore;
	String heroUrl;
	
	public RawJsonAbility() {
		super();
	}
	
	public RawJsonAbility(String internalName, String displayName,
			String affects, String description, String notes, String damage,
			String attributes, String cooldownAndMana, String lore,
			String heroUrl) {
		super();
		this.internalName = internalName;
		this.displayName = displayName;
		this.affects = affects;
		this.description = description;
		this.notes = notes;
		this.damage = damage;
		this.attributes = attributes;
		this.cooldownAndMana = cooldownAndMana;
		this.lore = lore;
		this.heroUrl = heroUrl;
	}
	
	public RawJsonAbility(String name, JsonObject data){
		super();
		this.internalName = name;
		this.displayName = data.getStringValue("dname");
		this.affects = data.getStringValue("affects");
		this.description = data.getStringValue("desc");
		this.notes = data.getStringValue("notes");
		this.damage = data.getStringValue("dmg");
		this.attributes = data.getStringValue("attrib");
		this.cooldownAndMana = data.getStringValue("cmb");
		this.lore = data.getStringValue("lore");
		this.heroUrl = data.getStringValue("hurl");
	}
	
	
	
	
	public String getInternalName() {
		return internalName;
	}
	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getAffects() {
		return affects;
	}
	public void setAffects(String affects) {
		this.affects = affects;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getDamage() {
		return damage;
	}
	public void setDamage(String damage) {
		this.damage = damage;
	}
	public String getAttributes() {
		return attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	public String getCooldownAndMana() {
		return cooldownAndMana;
	}
	public void setCooldownAndMana(String cooldownAndMana) {
		this.cooldownAndMana = cooldownAndMana;
	}
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	public String getHeroUrl() {
		return heroUrl;
	}
	public void setHeroUrl(String heroUrl) {
		this.heroUrl = heroUrl;
	}
	
}
