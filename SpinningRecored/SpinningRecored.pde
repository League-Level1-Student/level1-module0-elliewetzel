import processing.sound.*;
SoundFile file;
import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int rotation = 0;
void setup() {
  size(600, 600);
  pictureOfRecord = loadImage("record.jpg");
  pictureOfRecord.resize(600, 600);
  minim = new Minim(this);
  file = new SoundFile(this, "song.mp3");
}

void draw() {
  if(mousePressed) {
  rotateImage(pictureOfRecord, rotation);
  rotation+=5;
  image(pictureOfRecord, 0, 0);
 file.play();
  }
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}