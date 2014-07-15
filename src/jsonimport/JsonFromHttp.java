package jsonimport;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;







//import javax.json.Json;
//import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import datacontainer.RawJsonAbility;
import datacontainer.RawJsonHero;
import datacontainer.RawJsonItem;

public class JsonFromHttp {
		
	public static void main(String[] args) {
		JsonObject itemData = getJSONFromUrl("http://www.dota2.com/jsfeed/itemdata");
		//List<RawJsonItem> items = parseJsonItemData(itemData);
		
		JsonObject abilityData = getJSONFromUrl("http://www.dota2.com/jsfeed/abilitydata");
		List<RawJsonAbility> abilities = parseJsonAbilityData(abilityData);
		
		JsonObject heroData = getJSONFromUrl("http://www.dota2.com/jsfeed/heropediadata?feeds=herodata");
		List<RawJsonHero> heroes = parseJsonHeroData(heroData);
				
		
		//int itemLength = items.size();
		//System.out.println("Number of items: " + itemLength);
		int abilityLength = abilities.size();
		System.out.println("Number of abilities: " + abilityLength);
		int heroLength = heroes.size();
		System.out.println("Number of items: " + heroLength);
		
		
		//JsonObject blinkDagger = items.getIntValue(0);
		
	
	}
	
	public static JsonObject getJSONFromUrl(String url) {
		Client client = ClientBuilder.newClient();
		WebTarget myResource = client.target(url);
		String jsonData = myResource.request(MediaType.TEXT_PLAIN).get(String.class);
		
		JsonReader jsonReader = new JsonReader(new StringReader(jsonData));
		JsonObject json = jsonReader.readObject();
		jsonReader.close();
		
		return json;

	}
	
	public static List<RawJsonItem> parseJsonItemData(JsonObject itemData){
		List<RawJsonItem> rjiList = new ArrayList<RawJsonItem>();
		
		JsonObject items = itemData.getValue("itemdata", JsonObject.class);
		for (Map.Entry<String, JsonValue> oneItem: items.entrySet())
		{
		    String internalName = oneItem.getKey();
		    JsonObject oneItemData = (JsonObject)oneItem.getValue();
			RawJsonItem oneRji = new RawJsonItem(internalName, oneItemData);
			rjiList.add(oneRji);
		}
		
		return rjiList;
	}
	
	public static List<RawJsonAbility> parseJsonAbilityData(JsonObject abilityData){
		List<RawJsonAbility> rjaList = new ArrayList<RawJsonAbility>();
		
		JsonObject abilities = abilityData.getValue("abilitydata", JsonObject.class);
		for (Map.Entry<String, JsonValue> oneAbility: abilities.entrySet())
		{
		    String internalName = oneAbility.getKey();
		    JsonObject oneAbilityData = (JsonObject)oneAbility.getValue();
			RawJsonAbility oneRja = new RawJsonAbility(internalName, oneAbilityData);
			rjaList.add(oneRja);
		}
		
		return rjaList;
	}
	
	public static List<RawJsonHero> parseJsonHeroData(JsonObject heroData){
		List<RawJsonHero> rjhList = new ArrayList<RawJsonHero>();
		
		JsonObject heroes = heroData.getValue("herodata", JsonObject.class);
		for (Map.Entry<String, JsonValue> oneHero: heroes.entrySet())
		{
		    String internalName = oneHero.getKey();
		    JsonObject oneHeroData = (JsonObject)oneHero.getValue();
			RawJsonHero oneRjh = new RawJsonHero(internalName, oneHeroData);
			rjhList.add(oneRjh);
		}
		
		return rjhList;
	}

}
