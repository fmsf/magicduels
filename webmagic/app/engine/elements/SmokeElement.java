package engine.elements;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class SmokeElement extends AbstractElement {

	@Override
	public ElementType getElementType() {
		return ElementType.smoke;
	}

	@Override
	public Set<ElementType> getParentElements() {
		Set<ElementType> parents = Sets.newHashSet();
		parents.add(ElementType.fire);
		parents.add(ElementType.air);
		return parents;
	}
}
