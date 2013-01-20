package engine.elements;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class AirElement extends AbstractElement {

	@Override
	public ElementType getElementType() {
		return ElementType.air;
	}

	@Override
	public Set<ElementType> getParentElements() {
		return Sets.newHashSet();
	}

}
