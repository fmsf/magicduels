package engine.elements;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class LavaElement extends AbstractElement {

	@Override
	public ElementType getElementType() {
		return ElementType.lava;
	}

	@Override
	public Set<ElementType> getParentElements() {
		Set<ElementType> parents = Sets.newHashSet();
		parents.add(ElementType.fire);
		parents.add(ElementType.earth);
		return parents;
	}

}
