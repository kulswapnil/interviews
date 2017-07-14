package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/

/**
 * 
 * @author swapnilkulkarni
 *Added dependency injection for engine using constructor.
 * added qualifer annotation to mention which engine should be used.
 * added method class for electricEngine.
 */
 public class Exercise2 {

	public static class Car {
		
		@Qualifier("GasEngine")
		private Engine engine;
		
		public void setEngine(Engine engine) {
	        this.engine = engine;
	    }
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}
