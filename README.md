# WebcamSurveillanceJava
A multi threaded Webcam Streaming and Recording Project

Following Software need to be installed:(All setups included)
1. Latest JDK 
2. Latest NetBeans
3. WebCam driver (from CD)

> Run OpenCV-2.4.0 setup and extract to C:\opencv

> Extract javacv-0.1-bin to C:\javacv-bin

> Edit Enivronment Variables (My Computer->System Properties->Advanced System Settings->Advanced->Enivronment Variables) to add the following:

User Variables::

CLASSPATH
C:\opencv\build\x86\vc10\lib;C:\opencv\build\common\tbb\ia32\vc10;C:\opencv\build\x86\vc10\staticlib;%CLASSPATH%

PATH
C:\opencv\build\common\tbb\ia32\vc10\;C:\opencv\build\x86\vc10\bin\;

> From javaxcomm folder

Refer Image files.png to see where the files in javxcomm package are to be copied to ensure that the program can use javax.comm package

Courtesy of java serial port communication: https://www.youtube.com/watch?v=8rnCzYv_8WU