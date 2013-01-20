package engine.levels;

import java.util.List;

import com.google.common.collect.Lists;

public enum Tier {
	one(10),
	two(20),
	three(30),
	four(40),
	five(50),
	last(Integer.MAX_VALUE);
	
	private int maximumPlayerLevel;
	
	Tier(int maxLevel){
		maximumPlayerLevel = maxLevel;
	}
	
	public static Tier getTier(int level){
		for(Tier t : Tier.values()){
			if(level < t.maximumPlayerLevel){
				return t;
			}
		}
		return Tier.last;
	}
	
	public static List<Tier> getTiersUpTo(Tier tier){
		List<Tier> tiers = Lists.newArrayList();
		for(Tier t : Tier.values()){
			if(tier.maximumPlayerLevel >= t.maximumPlayerLevel){
				tiers.add(t);
			}
		}
		return tiers;
	}
}
