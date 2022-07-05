# RAP Replacement

## Task

The current Elvis Admin is implemented as an RAP Application in a clustered OSGI environment.
As RAP is hardly maintained and lacks many modern functionalities, it was concluded to find a Software solution to replace RAP.

### Software Quality Attributes

<table>
  <tr>
    <th>Attribute</th>
    <th>Importance</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Up to date</td>
    <td><span style="color:black">★★★★★</span><span style="color:lightgray"></span></td>
    <td><ul><li>consistent updates<li>well-developed<li>promising to stay around</ul></td>
  </tr>
  <tr>
    <td>Easy to Migrate</td>
    <td><span style="color:black">★★★★★</span><span style="color:lightgray"></span></td>
    <td><ul><li>less work to migrate the system<li>migration in small steps</ul></td>
  </tr>
  <tr>
    <td>Modifiability</td>
    <td><span style="color:black">★★★★★</span><span style="color:lightgray"></span></td>
    <td><ul><li>development in small steps<li>easy to new functionalities<li>easy to adjust/change parts</ul></td>
  </tr>
  <tr>
    <td>Easy to Learn</td>
    <td><span style="color:black">★★★</span><span style="color:lightgray">★★</span></td>
    <td><ul><li>straight forward<li>similarity to previous system</ul></td>
  </tr>
  <tr>
    <td>Style Options</td>
    <td><span style="color:black">★★</span><span style="color:lightgray">★★★</span></td>
    <td><ul><li>possibility to style out the application<li>visualization for content</ul></td>
  </tr>
</table>

## Current Product

### RAP

<table>
    <tr>
    	<th>Name</th>
    	<th>Short Desc.</th>
    	<th>Description</th>
 	</tr>
	<tr>
		<td><a href="https://www.eclipse.org/rap/">RAP</a></td>
		<td>Remote Application Platform</td>
		<td>A Java based platform to create web UI's using RWT.</td>
  	</tr>
	<tr>
		<td><a href="https://www.eclipse.org/rap/developers-guide/devguide.php?topic=rwt.html">RWT</a></td>
		<td>RAP Widget Toolkit</td>
		<td>A set of widgets based on <strong>SWT</strong>. It is adjusted for a more modern approach of displaying UI elements.</td>
  	</tr>
	<tr>
		<td><a href="https://www.vogella.com/tutorials/SWT/article.html">SWT</a></td>
		<td>Standard Widget Toolkit</td>
		<td>A very basic set of Widgets providing content objects for the frontend.</td>
  	</tr>
	<tr>
		<td><a href="https://www.osgi.org/resources/what-is-osgi/">OSGi</a></td>
		<td>Dynamic Module System for Java</td>
		<td>A platform that is supposed to simplify the management of Java Bundles building an Application.</td>
  	</tr>
	<tr>
		<td><a href="https://www.eclipse.org/equinox/">Equinox</a></td>
		<td>Implementation of OSGi</td>
		<td>A specific Implementation of OSGI made by Eclipse harmonizing with <strong>RAP</strong></td>
  	</tr>
</table>

### Used Libs - WIP

### Functionalities - WIP

## Software Types

In order to structure the software options on the market types get identified.
Each type hints where the main value of a certain product is concerned to the given scenario.
As software products that are similar ofter share their main value.

### A SWT Based

The Widgets from RAP are based on SWT.
In case that there is a framework that is also either based on or able to handle SWT, could the migration be way easier. 

**pro**

- possibly direct use of old classes
- easy to apply of existing knowledge
- more smooth transition

**con**

- benefit might be quite limited
- possibility to not notice hidden troubles
- some problems might stay as the fundament is the same

### B Java Based

**pro**
- reduced deployment overhead
- Java knowledge is already there
- limitation of new software

**con**
- reducing the inconvenience might result in the migration taking way longer

### C Similar Technology

A completely new Framework brings much potential but also a lot of effort for getting used to the new mechanics.
A compromise would be the usage of a framework similar to the old one.
This could be either another Java Framework or one that just feels similar.

**pro**

- not too hard to learn new mechanics

**con**

- limits the options based on foreknowledge

### D "Best" Available Framework 

In order to achieve the best possible outcome is it also necessary to not got with the easiest option but one that has the most promising features and therefor results.

**pro**

- most likely better in the long run

**con**

- definitely hard to apply transition and much work to do
- a slow migration results in the use of possibly completely different frameworks beside each other

### E Python Based

**pro**
- good for handling and analysing big amounts of data

**con**
- prob quite far way from current system

## Migration Plan - WIP

One of the requirements is the need for a slow migration.
Meaning that the development based on the new framework would happen in smaller steps that slowly append and sooner or later replace RAP.

### Library based

In order to minimize the setup overhead it would be nice to make use of a library importing the functionality of anb other framework.
Either RAP functionalities to another framework or the functionalities of the new framework to RAP.

### OSGi based

The current system is deployed using the Equinox, an OSGi implementation handling Java Bundles.
If its gets decided to again use a Java based framework, its services can get packed into bundles that most likely can get integrated right beside the RAP bundles.

### Dual System

Systems that don't fit the other plans have to get developed and deployed independently of each other linking to each other.

### ...

## Software Considerations

### Java GUI Frameworks

https://csveda.com/best-java-gui-frameworks/
https://stackoverflow.com/questions/7358775/java-gui-frameworks-what-to-choose-swing-swt-awt-swingx-jgoodies-javafx

#### Java AWT

- good alternative but rather go for Spring as the next generation or JavaFX as the Framework after Swing

#### Swing

There might be a chance to realize this, but too many papers stated problems with such a solution.
The benefit of slowly migrating within the same Application is the trouble and restrictions most likely not worth it.

#### JavaFX

Supposedly the new generation to Swing.

https://pianalytix.com/difference-b-w-awt-and-swing-and-javafx/

**pro**
- has a nice Scene Builder

### Java Web UI

#### openxava

https://www.openxava.org/ate/eclipse-rap-alternative

**pro**

- very simple

**con**

- not as big
- seemingly quite specialized in simple database management

#### Spring Framework

- might be possible to use the old bundles in spring
  - first dude
    - https://www.javacodegeeks.com/2018/11/eclipse-rap-spring-boot.html
    - https://www.javacodegeeks.com/2018/11/eclipse-rap-spring-boot.html
    - https://github.com/bwolff/rwt-on-spring-boot
  - decoupled components
    - https://dzone.com/articles/spring-enabling-decoupled-swin
  - SWT/Swing Designer
    - https://www.genuitec.com/docs/visual-design/java-gui-design-using-swtswing/

#### Maintainable Considerations without Description

- Tapestry
- Stripes
- Grails
- JHipster
- Apache Struts
- Jmix
- Apache Wicket
- Spark

### Newcomer

#### Flutter

Type: B

**pro**
- dart is very close to java
- dart is used for frontend and backend
- flutters widgets are close the SWT widgets
- copy and past was never easier
  - https://flutter.github.io/samples/#
  - https://blog.logrocket.com/tag/flutter/
- high reputation in being fun to use/learn
- strong rising popularity
- most likely will not only stay around but become a standard
- very fast
- widgets provide a decent design very fast

**con**
- quite jung yet -> rapidly changing
- design is good but specific looks may require more configuration

comparison to react:
- https://medium.com/flutter-community/pros-and-cons-of-using-flutter-1f5d1269a4b9
- <a href="https://blog.logrocket.com/why-flutter-is-overtaking-react-native/">Why Flutter is overtaking React Native</a>
- git stars are already equal
  - https://github.com/flutter/flutter
  - https://github.com/facebook/react-native
- specific attribute comparison
  - direct
    - Language: while JavaScript is dynamic can dart be as well dynamic as static
    - security: both are good but the usage of static variable is by default safer
    - performance: both are very good but Flutter is a bit better as it compiles directly native without the JavaScript bridge in React
    - project size: flutter tends to be bigger and React can get reduced even more by using additional tools
    - layout: both based on Flexbox, similar but flutter seams to have more advances default construction objects
  - indirect
    - Publisher Documentation: both are good but the one from flutter is more straight forward
    - popularity:
      - git: <a href="https://github.com/facebook/react-native">React</a> is slightly above <a href="https://github.com/flutter/flutter">Flutter</a>
      - blogs: As React is longer around does it have more community blogs to read about. But Flutter-Devs are more active on social media websites as Twitter and Reddit
    - IDE defaults: reacts => Visual Studio, Flutter => Android Studio of IntelliJ

### Java Script

JavaScript is still the most used language in therms of frontend web development.
Often it is possible to use TypeScript instead too.

#### React

**pro**
- strong community
- search engine optimization
- already proven but still very active

**con**
- js is quite far away from java

#### jQuery

**pro**

**con**
- js is quite far away from java
- slowly in decline

#### Express

**pro**
- good caching
- templating
- minimalistic
- easy scalable
- full stack

#### Angular

**pro**
- high security
-

#### Vue

- rather go for react or angular

### Python => Django

Best opportunity when going for a python web app but beside that not further mentionable.

## Main Candidates

<table style="border: 0 solid; border-collapse: collapse;">
  <tr style="border: 1px solid black;">
    <th>Product</th>
    <th>Software Type</th>
    <th>Migration</th>
    <th>Up to Date</th>
    <th>Modifiability</th>
    <th>Easy to Learn</th>
    <th>Style Option</th>
    <th>Documentation</th>
    <th>Community</th>
  </tr>
  <tr style="border: 1px dotted;">
    <td><a href=""></a>Spring</td>
    <td>B Java Based</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr style="border: 1px dotted;">
    <td><a href=""></a>Flutter</td>
    <td>C Similar Technology</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr style="border: 1px dotted;">
    <td><a href=""></a>React</td>
    <td>D "Best" Available Framework </td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr style="border: 1px dotted;">
    <td><a href="">Django</a></td>
    <td>E Python Based</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</table>

