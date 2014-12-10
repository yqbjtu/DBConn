
import java.io.IOException;




/** ArguMain class
 *
 * @author YangQian 2014-01-20
 */
public class ArguMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length >= 3) {

		} else { 
			System.out.println("Usage  :java  -jar ArguMain  consoleIP      port  username password userToMgr preferenceToDelete");
			System.out.println("such as:java  -jar ArguMain  192.168.2.211  3966  root     pwOfRoot usr1  海外核心");
			System.out.println("Note:please make sure that the specified user exist.");
			System.exit(-1);
		}
		
        
		String args0 = args[0];
		String args1 = args[1];
		String args2 = args[2];

			
		try {
			System.out.println(" Paramter(0):"+args0+" (1)"+args1+"   (2)"+args2);
			

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			
		}
	}

}
