
public class FluxoComErro {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try
        {
        	metodo1();
        }catch(ArithmeticException | NullPointerException ex)
        {
        	String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        /*catch(NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("NullPointerException " + msg);
        }*/
        
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        /*
	         * try {
	        metodo2();
	    	} catch(MinhaExcecao ex) {}
         */
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaException {
    	System.out.println("Ini do metodo2");
        throw new MinhaException("deu muito errado");
    }

}
