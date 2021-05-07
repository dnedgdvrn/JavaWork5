package core.concrete;

import UserGoogle.UserGoogleManager;
import core.abstartct.UserGoogleService;

public class UserGoogleManagerAdaptor implements UserGoogleService {
  UserGoogleManager usergoogleManager = new UserGoogleManager();
	

	@Override
	public void adToSystem(String mail, String Password) {
	usergoogleManager.add(mail, Password);
		
	}

	@Override
	public void loginSystem(String mail, String Password) {
		usergoogleManager.add(mail, Password);
		
	}

	
	

}
