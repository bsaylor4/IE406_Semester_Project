double navigate(ViewArea viewArea)
{/*ALCODESTART::1777312873831*/

selectedViewArea = viewArea;
viewArea.navigateTo();
groupMainMenu.setPos( viewArea.getX(), viewArea.getY() );

/*ALCODEEND*/}

double cameraRotation()
{/*ALCODESTART::1777314304789*/
return System.currentTimeMillis()/10000.0;
/*ALCODEEND*/}

