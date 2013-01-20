package engine.elements;

import java.util.Set;

import com.google.common.collect.Sets;

import engine.levels.Tier;

public class ElementFactory {

	public Set<ElementType> availableElements;
	
	public ElementFactory(){
		this(Tier.last);
	}
	
	public ElementFactory(Tier tier){
		availableElements = Sets.newHashSet();
		for(Tier t : Tier.getTiersUpTo(tier)){
			availableElements.addAll(ElementType.getElements(t));
		}
	}
	
	public AbstractElement newElement(ElementType type){
		if(availableElements.contains(type)){
			return type.newInstance();
		}
		return null;
	}
	
	public AbstractElement newElement(ElementType parent1, ElementType parent2){
		if(availableElements.contains(parent1) && availableElements.contains(parent2)){
			for(ElementType type : ElementType.values()){
				if(type.getElement().verifyParents(parent1, parent2)){
					AbstractElement targetElement = type.newInstance();
					if(availableElements.contains(targetElement)){
						return targetElement;
					}
				}
			}
		}
		return null;
	}
	
	public Set<AbstractElement> getAllElements(){
		Set<AbstractElement> allElements = Sets.newHashSet();
		for(ElementType type : availableElements){
			allElements.add(type.newInstance());
		}
		return allElements;
	}
	
	
}
