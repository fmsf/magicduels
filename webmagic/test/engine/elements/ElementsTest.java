package engine.elements;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

import com.google.common.collect.Sets;

import engine.levels.Tier;

public class ElementsTest {

	@Test
	public void TestTier1Contents() {
		Set<ElementType> types = ElementType.getElements(Tier.one);
		assertTrue(types.contains(ElementType.fire));
		assertTrue(types.contains(ElementType.water));
		assertTrue(types.contains(ElementType.air));
		assertTrue(types.contains(ElementType.earth));
	}

	@Test
	public void TestTier2Contents(){
		Set<ElementType> types = ElementType.getElements(Tier.two);
		assertTrue(types.contains(ElementType.dust));
		assertTrue(types.contains(ElementType.lava));
		assertTrue(types.contains(ElementType.ice));
		assertTrue(types.contains(ElementType.mud));
		assertTrue(types.contains(ElementType.smoke));
		assertTrue(types.contains(ElementType.steam));
	}
	
	@Test
	public void TestFactory(){
		ElementFactory factory = new ElementFactory(Tier.one);
		assertEquals(factory.newElement(ElementType.steam), factory.newElement(ElementType.fire, ElementType.water));
		assertEquals(factory.newElement(ElementType.smoke), factory.newElement(ElementType.fire, ElementType.air));
		assertEquals(factory.newElement(ElementType.lava), factory.newElement(ElementType.fire, ElementType.earth));
		assertEquals(factory.newElement(ElementType.ice), factory.newElement(ElementType.water, ElementType.air));
		assertEquals(factory.newElement(ElementType.mud), factory.newElement(ElementType.water, ElementType.earth));
		assertEquals(factory.newElement(ElementType.dust), factory.newElement(ElementType.air, ElementType.earth));
				
		assertNotSame(factory.newElement(ElementType.fire), factory.newElement(ElementType.air, ElementType.earth));
		assertNotSame(factory.newElement(ElementType.water), factory.newElement(ElementType.air, ElementType.earth));
		assertNotSame(factory.newElement(ElementType.air), factory.newElement(ElementType.air, ElementType.earth));
		assertNotSame(factory.newElement(ElementType.earth), factory.newElement(ElementType.water, ElementType.air));
	}
}
