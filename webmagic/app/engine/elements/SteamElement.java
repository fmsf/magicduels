package engine.elements;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class SteamElement extends AbstractElement{

	@Override
	public ElementType getElementType() {
		return ElementType.steam;
	}
	
	@Override
	public Set<ElementType> getParentElements() {
		Set<ElementType> parents = Sets.newHashSet();
		parents.add(ElementType.fire);
		parents.add(ElementType.water);
		return parents;
	}

}
