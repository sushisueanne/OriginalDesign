import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int timesClacked =0; 
int h = hour();
int m = minute();


public void setup(){

size(400,400);
background(0,0,0);
textSize(60);
fill(255,255,255);
text("It is ", 150,120);
textSize(32);
text(h,150,200);
text(":",200,200);
text(m, 220,200);
textSize(50);
text("where you are",20,280);

}
public void draw()
{
	
}

public void night(){
for (int y =0;y<400;y=y+1){
		stroke(50,0,10+y);
		line(0,y,400,y);
	}

	fill(255,255,255);
	noStroke();
	ellipse(200,200,180,180);

	textSize(32);
	fill(255,255,255);
	text("Good night!",130,380);

}

public void morning(){
	for (int x =0;x<400;x=x+1){
		stroke(200+x,0+x,10);
		line(0,x,400,x);
	}

	fill(255,215,0);
    noStroke(); 
    ellipse(200,200,180,180);

	textSize(32);
	fill(255,255,255);
	text("Good morning!",100,380);
}

public void mouseClicked(){
timesClacked=timesClacked+1;
println(timesClacked);


//Night
if (timesClacked%2==0||h>=18){
	
	night();
	
}

//Morning
if (h<=12 && timesClacked%2!=0 || timesClacked%2==1){

	morning();

}


}



  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
