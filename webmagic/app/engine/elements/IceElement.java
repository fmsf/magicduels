package engine.elements;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class IceElement extends AbstractElement {

	@Override
	public ElementType getElementType() {
		return ElementType.ice;
	}

	@Override
	public Set<ElementType> getParentElements() {
		Set<ElementType> parents = Sets.newHashSet();
		parents.add(ElementType.water);
		parents.add(ElementType.air);
		return parents;
	}

}
