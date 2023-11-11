public class SmartTv{
	boolean ligada = true;
	int canal = 1;
	int volume = 25;

	public void mudarCanal (int novoCanal){
		canal = novoCanal;
	}
	public void aumentarCanal(){
		canal++;
		//System.out.println("Subir um canal: " + canal);
	}
	public void diminuirCanal(){
	canal--;
	//System.out.println(" descer um canal: " + canal);
}

	public void aumentarVolume(){
		volume++;
		System.out.println("AUMENTANDO O VOLUME PARA: " + volume);
	}
	public void diminuirVolume(){
		volume--;
		System.out.println("DIMINUINDO O VOLUME PARA: " + volume);
	}		

	public void ligar(){
		ligada=true;
	}
	public void desligar(){
		ligada=false;
	}


}