package com.test.spring;

import com.test.spring.spring.SoundSystemConfig;
import com.test.spring.spring.player.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SoundSystemConfig.class)
public class JavaConfigTest {

  @Autowired
  private MediaPlayer player;


  @Test
  public void play() {
    player.play();
  }

}
