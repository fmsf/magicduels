package engine.elements;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class DustElement extends AbstractElement {

	@Override
	public ElementType getElementType() {
		return ElementType.dust;
	}
	
	@Override
	public Set<ElementType> getParentElements() {
		Set<ElementType> parents = Sets.newHashSet();
		parents.add(ElementType.earth);
		parents.add(ElementType.air);
		return parents;
	}

}
