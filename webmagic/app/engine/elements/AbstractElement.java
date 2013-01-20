package engine.elements;

import java.util.Set;

import com.google.common.collect.Sets;

import engine.spells.AbstractSpell;

public abstract class AbstractElement {
	
	protected Set<AbstractSpell> offensiveSpell;
	protected Set<AbstractSpell> defensiveSpell;
	
	protected Set<ElementType> parents;	
	
	protected ElementType type;
	AbstractElement(){
		offensiveSpell = Sets.newHashSet();
		defensiveSpell = Sets.newHashSet();
		parents = Sets.newHashSet();
	}
	
	public abstract ElementType getElementType(); 
	public abstract Set<ElementType> getParentElements();
	
	public boolean verifyParents(ElementType... types){
		if(types.length!=parents.size()){
			return false;
		}
		Set<ElementType> set = Sets.newHashSet(types);
		for(ElementType type : parents){
			if(!parents.contains(type)){
				return false;
			}
		}
		return true;
	}
	
	
}
