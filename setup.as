﻿package  {
	
	import flash.display.MovieClip;
	
	public class setup extends MovieClip {
		
      private var piso_new: piso = new piso;
	  private var hulk_new: hulk = new hulk;
	  static var thor_new: thor = new thor;
	  
		public function setup() {
			
			addChild(piso_new);
			piso_new.x=1, piso_new.y=190;
			
			addChild(hulk_new);
			hulk_new.x=110, hulk_new.y=60;
			
			addChild(thor_new);
			thor_new.x=200, thor_new.y=330;
			
		}
		
		

	}
	
}
