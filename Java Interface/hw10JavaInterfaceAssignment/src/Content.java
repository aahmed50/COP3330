//interfaces 

//straw required?
interface Straw{
	//abstract methods
	boolean needsStraw();
	}//close comparable 

//calculate sugar content
interface Content {
	//abstract methods
	void sugarContent(int x);
	}//close content

//calculate time needed (time needed = heat * number of items)
interface Time {
	//abstract methods
	void heatTimeNeeded(int ing);
	}//close Time 

