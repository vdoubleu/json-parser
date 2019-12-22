
public class TestObj {
        String a1;
        int a2;
        InnerObj a3;
	/*
        private class b{
        	String b1;
        	String b2;
        	
        	private class c{
        		int c1;
        		String c2;
        	}
        }
	*/
        public TestObj(String alpha, int alpha2, InnerObj i){
        	this.a1 = alpha;
        	this.a2 = alpha2;
        	this.a3 = i;
        }
        
        
        public InnerObj getInnerObj(){
        	return a3;
        }

    
}
