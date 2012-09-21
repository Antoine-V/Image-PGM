import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ImagePGM{
	
	protected int[][] pixels;
	protected int tailleX;
	protected int tailleY;
	
	
	public ImagePGM(String fichierSource) {
		
			InputStream ips=new FileInputStream(fichierSource); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			br.readLine();
			br.readLine();
			
			String mon_String = new String(br.readLine());
			String str[]=mon_String.split(" ");
			tailleX = Integer.parseInt(str[0]); 
			tailleY = Integer.parseInt(str[1]); 
			
			for (int i = 0 ; i<tailleX; i++) {
				for (int j =0; j<tailleY; j++){
					pixels[i][j]=Integer.parseInt(br.readLine());
				}
			}
			br.close();
				
		
	}
	
}
