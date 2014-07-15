package datacontainer;

import java.util.ArrayList;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.json.JsonNumber;

public class RawJsonItem {

	String internalName;
	int id;
	String imgUrl;
	String displayName;
	String quality;
	int cost;
	String description;
	String notes;
	String attributes;
	int manacost;
	double cooldown;
	String lore;
	String[] components;
	boolean created;
	
	public RawJsonItem() {
		super();
	}
	
	public RawJsonItem(String internalName, int id, String imgUrl,
			String displayName, String quality, int cost, String description,
			String notes, String attributes, int manacost, int cooldown,
			String lore, String[] components, boolean created) {
		super();
		this.internalName = internalName;
		this.id = id;
		this.imgUrl = imgUrl;
		this.displayName = displayName;
		this.quality = quality;
		this.cost = cost;
		this.description = description;
		this.notes = notes;
		this.attributes = attributes;
		this.manacost = manacost;
		this.cooldown = cooldown;
		this.lore = lore;
		this.components = components;
		this.created = created;
	}
	
	public RawJsonItem(String name, JsonObject data){
		super();
		this.internalName = name;
		this.id = data.getIntValue("id");
		this.imgUrl = data.getStringValue("img");
		this.displayName = data.getStringValue("dname");
		this.quality = data.getStringValue("qual");
		this.cost = data.getIntValue("cost");
		this.description = data.getStringValue("desc");
		this.notes = data.getStringValue("notes");
		this.attributes = data.getStringValue("attrib");
		this.lore = data.getStringValue("lore");

		Object maybeMana = data.get("mc");
		if (maybeMana.equals(JsonValue.FALSE))
			this.manacost = -1;
		else if (maybeMana instanceof JsonNumber)
			this.manacost = ((JsonNumber)maybeMana).getIntValue();
		else if (this.id == 200)
			this.manacost = 180;
		else if (this.id == 201)
			this.manacost = 160;
		else if (this.id == 202)
			this.manacost = 140;
		else if (this.id == 203)
			this.manacost = 120;
		else
			this.manacost = 100;
		
		Object maybeCd = data.get("cd");
		if (maybeCd.equals(JsonValue.FALSE))
			this.cooldown = -1;
		else
			this.cooldown = maybeCd instanceof Number ? ((Number)maybeCd).doubleValue()
	                        : ((JsonNumber) maybeCd).getDoubleValue();
				
		Object maybeComponents = data.get("components");
		//JsonArray compArray = (JsonArray)data.get("components");
		if(maybeComponents.equals(JsonValue.NULL)){
			this.components = null;
		}
		else{
			JsonArray compArray = (JsonArray)maybeComponents;
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < compArray.size(); i++)
				list.add(compArray.getStringValue(i));
			this.components =  list.toArray(new String[list.size()]);
		}
		
				
		this.created = data.get("created").equals(JsonValue.TRUE);;
	}
		
	public String getInternalName() {
		return internalName;
	}
	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
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
	public String getAttributes() {
		return attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	public int getManacost() {
		return manacost;
	}
	public void setManacost(int manacost) {
		this.manacost = manacost;
	}
	public double getCooldown() {
		return cooldown;
	}
	public void setCooldown(double cooldown) {
		this.cooldown = cooldown;
	}
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	public String[] getComponents() {
		return components;
	}
	public void setComponents(String[] components) {
		this.components = components;
	}
	public boolean isCreated() {
		return created;
	}
	public void setCreated(boolean created) {
		this.created = created;
	}
	
	
}
