package datacontainer;

import javax.json.JsonObject;

public class RawJsonHero {
	
	String internalName;
	String displayName;
	String heroToken;
	String primaryAttribute;
	int strB;
	int strG;
	int intB;
	int intG;
	int agiB;
	int agiG;
	int moveSpeed;
	int baseDmgMin;
	int baseDmgMax;
	int baseArmor;
	String rangedOrMelee;
	String roles;
	
	public RawJsonHero(String internalName, String displayName,
			String heroToken, String primaryAttribute, int strB, int strG,
			int intB, int intG, int agiB, int agiG, int moveSpeed,
			int baseDmgMin, int baseDmgMax, int baseArmor,
			String rangedOrMelee, String roles) {
		super();
		this.internalName = internalName;
		this.displayName = displayName;
		this.heroToken = heroToken;
		this.primaryAttribute = primaryAttribute;
		this.strB = strB;
		this.strG = strG;
		this.intB = intB;
		this.intG = intG;
		this.agiB = agiB;
		this.agiG = agiG;
		this.moveSpeed = moveSpeed;
		this.baseDmgMin = baseDmgMin;
		this.baseDmgMax = baseDmgMax;
		this.baseArmor = baseArmor;
		this.rangedOrMelee = rangedOrMelee;
		this.roles = roles;
	}
	
	public RawJsonHero() {
		super();
	}
	
	public RawJsonHero(String name, JsonObject data){
		super();
		this.internalName = name;
		this.displayName = data.getStringValue("dname");
		this.heroToken = data.getStringValue("u");
		this.primaryAttribute = data.getStringValue("pa");
		JsonObject attributes = (JsonObject)data.get("attribs");
		JsonObject str = (JsonObject)attributes.get("str");
		JsonObject intel = (JsonObject)attributes.get("int");
		JsonObject agi = (JsonObject)attributes.get("agi");
		JsonObject dmg = (JsonObject)attributes.get("dmg");
		this.strB = str.getIntValue("b");
		this.strG = str.getIntValue("g");
		this.intB = intel.getIntValue("b");
		this.intG = intel.getIntValue("g");
		this.agiB = agi.getIntValue("b");
		this.agiG = agi.getIntValue("g");
		this.moveSpeed = attributes.getIntValue("ms");
		this.baseDmgMin = dmg.getIntValue("min");
		this.baseDmgMax = dmg.getIntValue("max");
		this.baseArmor = attributes.getIntValue("armor");
		this.rangedOrMelee = data.getStringValue("dac");
		this.roles = data.getStringValue("droles");
		
		
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
	public String getHeroToken() {
		return heroToken;
	}
	public void setHeroToken(String heroToken) {
		this.heroToken = heroToken;
	}
	public String getPrimaryAttribute() {
		return primaryAttribute;
	}
	public void setPrimaryAttribute(String primaryAttribute) {
		this.primaryAttribute = primaryAttribute;
	}
	public int getStrB() {
		return strB;
	}
	public void setStrB(int strB) {
		this.strB = strB;
	}
	public int getStrG() {
		return strG;
	}
	public void setStrG(int strG) {
		this.strG = strG;
	}
	public int getIntB() {
		return intB;
	}
	public void setIntB(int intB) {
		this.intB = intB;
	}
	public int getIntG() {
		return intG;
	}
	public void setIntG(int intG) {
		this.intG = intG;
	}
	public int getAgiB() {
		return agiB;
	}
	public void setAgiB(int agiB) {
		this.agiB = agiB;
	}
	public int getAgiG() {
		return agiG;
	}
	public void setAgiG(int agiG) {
		this.agiG = agiG;
	}
	public int getMoveSpeed() {
		return moveSpeed;
	}
	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}
	public int getBaseDmgMin() {
		return baseDmgMin;
	}
	public void setBaseDmgMin(int baseDmgMin) {
		this.baseDmgMin = baseDmgMin;
	}
	public int getBaseDmgMax() {
		return baseDmgMax;
	}
	public void setBaseDmgMax(int baseDmgMax) {
		this.baseDmgMax = baseDmgMax;
	}
	public int getBaseArmor() {
		return baseArmor;
	}
	public void setBaseArmor(int baseArmor) {
		this.baseArmor = baseArmor;
	}
	public String getRangedOrMelee() {
		return rangedOrMelee;
	}
	public void setRangedOrMelee(String rangedOrMelee) {
		this.rangedOrMelee = rangedOrMelee;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	

}
