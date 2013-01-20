package engine.elements;

import java.util.Set;

import com.google.common.collect.Sets;

public class WaterElement extends AbstractElement {

	@Override
	public ElementType getElementType() {
		return ElementType.water;
	}

	@Override
	public Set<ElementType> getParentElements() {
		return Sets.newHashSet();
	}
}
