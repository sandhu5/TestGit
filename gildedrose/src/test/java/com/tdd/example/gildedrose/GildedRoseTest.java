package com.tdd.example.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {
	@Test
	public void updateQuality_qualityIsNeverNegative() {
		Item[] items = new Item[] { new Item("foo", 1, 1) };
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		assertEquals(0, gildedRose.items[0].quality);
	}
    @Test
    public void updateQuality_QualityImproveForAged_Bri(){
    	Item[] items = new Item[]{new Item("Aged Brie",4,4)};
    	GildedRose gildedRose = new GildedRose(items);
    	gildedRose.updateQuality();
    	assertEquals(5, gildedRose.items[0].quality);
    }
    @Test
    public void updateQuality_QualityIsNeverMoreThan50(){
    	Item[] items = new Item[]{new Item("Aged Brie",4,49)};
    	GildedRose gildedRose = new GildedRose(items);
    	gildedRose.updateQuality();
    	assertTrue(gildedRose.items[0].quality <= 50);
    }
    @Test
    public void updateQuaality_SulfurasNeverGetSoldOrDeprecated(){
    	Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 5, 5)};
    	GildedRose gildedRose  = new GildedRose(items);
    	gildedRose.updateQuality();
    	assertEquals(5,gildedRose.items[0].quality);	
    }
    
}