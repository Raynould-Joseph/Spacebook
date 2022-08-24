package com.example.spacebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class scrollview extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);
        Button mail=findViewById(R.id.mail_me);



        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(i.EXTRA_EMAIL,"raynould2000gmail.com");
               i.putExtra(i.EXTRA_SUBJECT,"Exoplanet");
                i.putExtra(i.EXTRA_TEXT, "   Most of the exoplanets discovered so far are in a relatively small region of our galaxy, the Milky Way.We know from NASA’s Kepler Space Telescope that there are more planets than stars in the galaxy. By measuring exoplanets’ sizes (diameters) and masses (weights), we can see compositions ranging from very rocky (like Earth and Venus) to very gas-rich (like Jupiter and Saturn). Exoplanets are made up of elements similar to those of the planets in our solar system, but their mixes of those elements may differ. Some planets may be dominated by water or ice, while others are dominated by iron or carbon. We’ve identified lava worlds covered in molten seas, puffy planets the density of Styrofoam and dense cores of planets still orbiting their stars. \\n\\n\\tThe first exoplanets were discovered in the 1990s and since then we’ve identified thousands using a variety of detection methods.The first exoplanets were discovered in the 1990s and since then we’ve identified thousands using a variety of detection methods. it is pretty rare for astronomer to see an exoplanet through their telescope the way you might see Saturn through a telescope from Earth.hat’s called direct imaging, and only a handful of exoplanets have been found this way (and these tend to be young gas giant planets orbiting very far from their stars). Most exoplanets are found through indirect methods: measuring the dimming of a star that happens to have a planet pass in front of it, called the transit method, or monitoring the spectrum of a star for the tell-tale signs of a planet pulling on its star and causing its light to subtly Doppler shift. Space telescopes have found thousands of planets by observing “transits,” the slight dimming of light from a star when its tiny planet passes between it and our telescopes. Other detection methods include gravitational lensing, the so-called “wobble method.”The TRAPPIST-1 planets have been examined with ground and space telescopes. The space-based studies revealed not only their diameters, but the subtle gravitational influence these seven closely packed planets have upon each other; from this, scientists determined each planet’s mass.\\n\\nSo now we know their masses and their diameters. We also know how much of the energy radiated by their star strikes these planets’ surfaces, allowing scientists to estimate their temperatures. We can even make reasonable estimates of the light level, and guess at the color of the sky, if you were standing on one of them. And while much remains unknown about these seven worlds, including whether they possess atmospheres or oceans, ice sheets or glaciers, it’s become the best-known solar system apart from our own.\\n\\tBecause planets are much fainter than the stars they orbit, extrasolar planets are extremely difficult to detect directly. By far the most successful technique for finding and studying extrasolar planets has been the radial velocity method, which measures the motion of host stars in response to gravitational tugs by their planets. Swiss astronomers Michel Mayor and Didier Queloz discovered the first planet using this technique, 51 Pegasi b, in 1995. (Mayor and Queloz won the 2019 Nobel Prize in Physics for their discovery.) Radial velocity measurements determine the sizes and shapes of the orbits of extrasolar planets as well as the lower limits of the masses of these planets. (They provide only lower limits on planetary mass because they measure just the portion of the star’s motion toward and away from Earth.)\\nA complementary technique is transit photometry, which measures drops in starlight caused by those planets whose orbits are oriented in space such that they periodically pass between their stars and the telescope; transit observations reveal the sizes of planets as well as their orbital periods. Radial velocity data can be combined with transit measurements to yield precise planetary masses as well as densities of transiting planets and thereby limit the possible materials of which the planets are composed. Spectroscopic studies that rely on variations in the depth of the transit with wavelength have been used to identify gases such as hydrogen, sodium, and methane in the upper atmospheres of some close-in giant planets. The first detected transiting planet was HD 209458b in 1999. Both radial velocity and transit techniques are most sensitive to large planets orbiting close to their stars.\\n\\tThree other techniques that have detected extrasolar planets are pulsation timing, microlensing, and direct imaging. Pulsation timing measures the change in distance between the signal source and the telescope by using the arrival times of signals that are emitted periodically by the source. When the source is a pulsar (a rotating, magnetized neutron star), current technology can detect motions in response to a planet whose mass is as small as that of Earth’s Moon, whereas only giant planets can be detected around pulsating normal stars. The first extrasolar planets to be discovered were found in 1992 around the pulsar PSR 1257+12 by using this method. Microlensing relies upon measurements of the gravitational bending of light (predicted by Albert Einstein’s general theory of relativity) from a more distant source by an intervening star and its planets. This technique is most sensitive to massive planets orbiting hundreds of millions of kilometres from their star and has also been used to discover a population of free-floating giant planets that do not orbit any star. Direct imaging can be done by using starlight reflected off the planet or thermal infrared radiation emitted by the planet. Imaging works best for planets orbiting those stars that are nearest to the Sun, with infrared imaging being especially sensitive to young massive planets that orbit far from their star.");
                if(i.resolveActivity(getPackageManager())!=null){
                    startActivity(i);
                }
            }
        });

    }
}