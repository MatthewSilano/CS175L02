package CS175L;

public class Counter2 {
	/**
	   This class models a tally counter.
	*/
	
	   private int value;

	   /**
	      Gets the current value of this counter.
	      @return the current value
	   */
	   public int getValue()
	   {
	      return value;
	   }

	   /**
	      Advances the value of this counter by 1.
	   */
	   public void click() 
	   {
	      value = value + 1;
	   }
	   /**
	      Decreases the value of this counter by 1.
	   */
	   
	   
	   public void clickMany(int many)
	   {
		   value = value + many;
	   }
	   
	   
	 
	   public void unclick()
	   {
		   value = value -1;
	   }

	   /**
	      Resets the value of this counter to 0.
	   */
	   
	   public void unclickMany(int many)
	   {
		   value = value - many;
	   }
	   
	   
	   
	   
	   
	   public void reset()
	   {
	      value = 0;
	   }
	

}
