package estuary;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ModelTest {
	
	ModelMazeGame createTestMazeGame1() {
		
		List<Barrier>   walls      = new ArrayList<Barrier>();
		List<KelpPlant> kelpPlants = new ArrayList<KelpPlant>();
		List<Predator>  predators  = new ArrayList<Predator>();
		
		kelpPlants.add(new KelpPlant(new Vector2(10.0, 10.0)));
		kelpPlants.add(new KelpPlant(new Vector2(20.0, 20.0)));
		kelpPlants.add(new KelpPlant(new Vector2(30.0, 30.0)));
		
		Vector2 estuaryPoint = new Vector2(0, 0);
		
		return new ModelMazeGame(0, kelpPlants, walls, predators, estuaryPoint);
		
	}
	
	
	/*************************
	 * Maze Game Model Tests *
	 *************************/

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_001() {
		
		ModelMazeGame mazeGame = createTestMazeGame1();
		
		// possible initial adjustments
		mazeGame.mazeCrab.setHealth(MazeCrab.MAX_HEALTH);
		
		mazeGame.onTick();
		
		assertEquals("Crab Health decreases after getting hit by a predator",
					 3, mazeGame.mazeCrab.getHealth());
	}
	
	@Test
	public void test_002() {
		
		ModelMazeGame mazeGame = createTestMazeGame1();
		
		// possible initial adjustments
		
		mazeGame.onTick();
		
		assertEquals("Kelp goes away after being eaten",
					 2, mazeGame.kelpPlants.size());
	}
	
	@Test
	public void test_003() {
		
		ModelMazeGame mazeGame = createTestMazeGame1();
		
		// possible initial adjustments
		mazeGame.mazeCrab.setHealth(MazeCrab.MAX_HEALTH);
		
		mazeGame.onTick();
		
		assertEquals("When MazeCrab with full health eats Kelp, health doesn't increase",
					 true, mazeGame.mazeCrab.getHealth() == 3;
	}
			     
	@Test
	public void test_004() {
		
		ModelMazeGame mazeGame = createTestMazeGame1();
		
		// possible initial adjustments
		mazeGame.mazeCrab.setHealth(MazeCrab.MAX_HEALTH);
		
		mazeGame.onTick();
		
		assertEquals("When MazeCrab with full health eats Kelp, kelp goes away,
					 2, mazeGame.kelpPlants.size());
	}
			     
	@Test
	public void test_005() {
		
		ModelMazeGame mazeGame = createTestMazeGame1();
		
		// possible initial adjustments
		mazeGame.predators.add(new Predator(new Vector2(12.0,12.0));
		mazeCrab.setHealth(mazeCrab.MAX_HEALTH);
				      
		mazeGame.onTick();
		
		assertEquals("When MazeCrab collides with predator, mazeCrab health decreases
					 mazeCrab.MAX_HEALTH - 1, mazeGame.mazeCrab.getHealth());
			
	}
				  
	public void test_006() {
		
		ModelMazeGame mazeGame = createTestMazeGame1();
		
		// possible initial adjustments
		mazeGame.predators.add(new Predator(new Vector2(12.0,12.0));
		mazeCrab.setHealth(1);
				      
		mazeGame.onTick();
		
		assertEquals("When MazeCrab collides with predator and has one health, the game ends
					 true, mazeGame.isEnd();
			
	}
			
	
	/*****************************
	 * Counting Game Model Tests *
	 *****************************/
	
	@Test
	public void test_050() {
		
	}
	
	/*************************
	 * Shore Game Model Test *
	 *************************/
	
}
