package engine.elements;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class EarthElement extends AbstractElement {

	@Override
	public ElementType getElementType() {
		return ElementType.earth;
	}
	
	@Override
	public Set<ElementType> getParentElements() {
		return Sets.newHashSet();
	}

}
