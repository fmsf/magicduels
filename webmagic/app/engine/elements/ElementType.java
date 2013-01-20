package engine.elements;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import engine.levels.Tier;

public enum ElementType {
	fire(Tier.one, FireElement.class),
	water(Tier.one, WaterElement.class),
	air(Tier.one, AirElement.class),
	earth(Tier.one, EarthElement.class),
	
	steam(Tier.two, SteamElement.class),
	smoke(Tier.two, SmokeElement.class),
	lava(Tier.two, LavaElement.class),
	ice(Tier.two, IceElement.class),
	mud(Tier.two, MudElement.class),
	dust(Tier.two, DustElement.class);
	
	private Tier tier;
	private Class clazz;
	private AbstractElement element;
	
	ElementType(Tier tier, Class clazz){
		this.tier = tier;
		this.clazz = clazz;
		this.element = null;
	}
	
	public static Set<ElementType> getElements(Tier tier){
		Set<ElementType> l = Sets.newHashSet();
		for(ElementType element : ElementType.values()){
			if(element.tier == tier){
				l.add(element);
			}
		}
		return l;
	}
	
	protected AbstractElement getElement(){
		if(element==null){
			try {
				element = (AbstractElement) clazz.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {				
				e.printStackTrace();
			}
		}
		return element;
	}
	
	protected AbstractElement newInstance(){
		try {
			return (AbstractElement) clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
