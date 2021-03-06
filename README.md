Install with **[Eclipse](#install-in-linuxmacwindows-with-eclipse),**
**[IntelliJ](#install-in-linuxmacwindows-with-intellij),** or
**[Gradle](#install-in-linuxmacwindows-with-gradle) |**
**[How to contribute](#how-to-contribute) |**
**[What are all the files here for?](#what-are-all-the-files-here-for) |**
**[Important brain theories in use](#important-brain-theories-in-use) |**
**[algorithm part 1](#object-oriented-spatial-pooling-algorithm) |**
**[algorithm part 2](#object-oriented-temporal-pooling-algorithm) |**
**[Noise invariance experiment](#noise-invariance-experiment)**

# [WalnutiQ](http://walnutiq.com)

"*If you love something. Set it free.*"  
~ Someone at Unreal Engine

[![Build Status](https://travis-ci.org/WalnutiQ/WalnutiQ.png)](https://travis-ci.org/WalnutiQ/WalnutiQ)

Welcome! WalnutiQ is a human brain model simulation in Java. The long term goal 
of this repository is to store code that can simulate a full sized human brain 
in real-time. The current short term goal is to simulate a simplified visual 
pathway from an eye that is able to move to hierarchical regions in layer 3, 4, 
& 5 of the neocortex (70+% of the brain).

I believe that a real intelligence machine built on biological computation 
principles will be able to solve many of our hardest problems and will cause 
many new hard problems. Once a computer can correctly simulate the intelligence 
of 1 brain it can be quickly scaled to surpass the collective intelligence of 
the 7+ billion human brains on Earth. Everything that is considered 
impossible or unknowable will become <b>possible</b> and <b>knowable</b>.
Technology has always been used to do great good and great evil and it is scary 
to imagine the great evil this technology brings. I incredibly, 
desperately want to help build a technology that solves our hardest problems
where everything's happiness is considered. 

If you are interested in becoming a researcher/developer we would absolutely 
love your collaboration as we cannot do this alone. The only requirement we ask 
for is that you are someone that is not "all talk" and understands that progress
is made by not making excuses. Please e-mail me at quinnliu@vt.edu to talk 
about how you can get involved!

Most importantly, this research is made possible by everyone at 
[Numenta](http://numenta.org/). Numenta has theorized and tested algorithms 
that model layers 2/3 & 4 of the human neocortex. They have generously released 
the pseudo code for their learning algorithms, and this repository is an extended
implementation of their algorithms using object-oriented programming with a 
focus on understandability. Numenta's implementation of their algorithms can be
found [here](https://github.com/numenta/nupic). For more information please:

- Watch this [video playlist](http://www.youtube.com/playlist?list=PLPXsMt57rLtgddN0NQEmXP-FbF6wt2O-f) to become 
  familiar with the neuroscience behind this repository.
- Read Numenta's great explanation of their research in this [white paper](https://db.tt/FuQWQuwE) 
  to better understand the theory behind this repository.

Thank you,  
Q Liu

## Install in Linux/Mac/Windows with Eclipse
1. [Install Eclipse IDE](https://www.eclipse.org/downloads/) or use
   any other version of Eclipse if you already have it installed.

2. Go to the top right of this page and hit the `Fork` button. Then clone your 
   forked WalnutiQ repository locally. Then import it as a Git
   project into Eclipse. Right-click your package explorer `=>` Import...
   `=>` Git `=>` Projects from Git `=>` Next > `=>` Existing local repository
   `=>` Next > `=>` Add... `=>` Browse to the WalnutiQ folder you cloned locally
   and finish.

3. IMPORTANT: You will notice that your folders will have red X's everywhere. 
   To fix this right click your `src` folder then hover over "New", 
   then click "Source Folder". Then give it the "Folder name:" `src/main/java`. 
   Right click your `src` folder again and hover over "New", then click
   "Source Folder". Then give it the "Folder name:" `src/test/java`
   Similarily for the folder `experiments` right click the folder and go to
   New `=>` Source Folder `=>` Folder name: `experiments`. 
   Finally for the folder `images` right click the folder and go to
   New `=>` Source Folder `=>` Folder name: `images`.

4. In Eclipse, add all the libraries (.jar file) in the folder 
   `referencedLibraries/` by right-clicking your folder `WalnutiQ` 
   in the package explorer `=>` Build Path `=>` Add External Archives...

5. In Eclipse, add JUnit 4 by right-clicking your folder `WalnutiQ` 
   in the package explorer `=>` Build Path `=>` Add Libraries... `=>` JUnit `=>`
   Next > `=>` Finish

6. In Eclipse, also add JRE System Library by right-clicking 
   your folder `WalnutiQ` in the package explorer `=>` Build Path `=>` 
   Add Libraries... `=>` JRE System Library `=>` Next > `=>` Finish

7. Right click your folder `WalnutiQ` `=>` Run As `=>` JUnit Test `=>` 
   ALL TESTS PASS!


## Install in Linux/Mac/Windows with IntelliJ
1. [Install IntelliJ IDEA FREE Community Edition](http://www.jetbrains.com/idea/download/).
     - Note where you choose to install this and choose a folder that is easy to access
       (I stored it in Documents)

2. Once IntelliJ is installed, open it.  Go to "File" `=>` "Import Project...". This should
   open up a new window and you should easily be able to select the "WalnutiQ" folder. Click "ok".

3. Now, the project should be imported.  You should now add JDK.  Go back to "File"
   `=>` "Project Structure".

4. A new window should popup.  Under "Platform Settings" `=>` "SDKs".  At the upper
   lefthand, select the "+" `=>` "JDK".

5. On Mac, In the "Finder" window, enter SHIFT + command + G.  Type in "/System/Library/Java".
   Navigate to the JDK folder and once you have done so, click "choose". On Windows,
   navigate to the JDK folder in "C:\Program Files\Java". On Linux, good luck finding it.
   
6. If this was successfully done, a list of SDKs should now appear under SDKs.
   In the same window, navigate to the lefthand side and under "Project Settings" `=>`
   "Project".  Under "Project SDK", it should say "<No SDK>".  In that bar, select the new
   Java version which you added.  At the bottom righthand corner, select "Apply".
  
## Install in Linux/Mac/Windows with Gradle
1. Make sure you have java version 1.6, 1.7 or 1.8. To check open up a new terminal 
   and type:
   ```sh
   prompt> java -version
   java version "1.7.0_60" # it's only important to see "1.6", 1.7" or "1.8" in 
                           # the version
   ```  
   If you don't have any of those Java versions install java 1.7 by going 
   [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html). 
   After installing java 1.7 open up a new terminal to check if java 1.7 
   is installed by retyping `java -version` in the terminal.
   
2. Go to the top right of this page and hit the `Fork` button. Then clone your 
   forked WalnutiQ repository locally. Navigate into the `WalnutiQ/` folder.

3. To run all of the code in the Linux or Mac terminal type:
   ```sh
   prompt> ./gradlew build
   # some other stuff...
   BUILD SUCCESSFUL # If you see `BUILD SUCCESSFUL` all of the tests have passed! 
   ```

4. To run all of the code in the Windows terminal type:
   ```sh
   prompt> gradlew.bat
   # some other stuff...
   BUILD SUCCESSFUL # If you see `BUILD SUCCESSFUL` all of the tests have passed! 
   ```
   
5. In the future after editing some code make sure to clean your old compiled 
   code before rerunning the tests by typing:
   ```sh
   prompt> ./gradlew clean # removes your old compiled code
   prompt> ./gradlew build
   # hopefully all the tests still pass... :)
   ```

## How to contribute
1. You need to be able to use Git & Github.com. If you don't know how I created 
   a easy to follow 1.5 hour playlist on how to use Git & Github 
   [here](https://www.youtube.com/watch?v=44E8o-xuxWo&list=PLPXsMt57rLtgpwFBqZq4QKxrD9Hhc_8L4).  

2. For now we are using the Git workflow model described 
   [here](https://github.com/quinnliu/WalnutiQ/issues/62) to contribute to this
   repository effectively. Make sure you understand this model before 
   trying to merge into the master branch. Additionally, before merging your
   feature branch to master make sure to change the quote at the top of this 
   README.md to another quote. 

3. View our [issue tracker](https://github.com/quinnliu/WalnutiQ/issues?state=open) 
   and create a new issue with a question if you are confused. Otherwise, 
   assign a issue to yourself you would like to work on or suggest
   a new issue if you kinda know what you are doing.

4. While reading through the code base it will be very helpful to refer to the 
   following labeled model:
   ![alt text](https://dl.dropboxusercontent.com/u/106853306/WalnutiQ%20Gallery/labeled_MARK%20NULLA_version2.jpg)
   
## What are all the files here for
  - experiments  
      + model
          - MARK_I 
            + [vision](./experiments/model/MARK_I/vision) = experiments with 
              partial visual pathway models on a popular handwritten digit data
              set called MNIST
  - gradle = the actual Gradle code for building our Java code
  - images = images used in training & testing the partial brain model
  - referencedLibraries = contains .jar files(of other people's code) needed to 
                          run WalnutiQ
  - src
      + main
        - java
          + model
            - [MARK_II](./src/main/java/model/MARK_II) = the core logic for the 
              partial brain model. Includes abstract data types for basic brain 
              structures and learning algorithms that simulate how the brain learns.
              + [connectTypes](./src/main/java/model/MARK_II/connectTypes) = 
                allow the different brain structures to connect to each other in
                a variety of ways
              + [parameters](./src/main/java/model/MARK_II/parameters) = allows 
                construction of different WalnutiQ models from command line for 
                this repo https://github.com/quinnliu/CallWalnutiQ
              + **[SpatialPooler.java](./src/main/java/model/MARK_II/SpatialPooler.java) 
                = models the sparse & distributed spiking activity of neurons 
                  seen in the neocortex and models long term potentiation and 
                  depression on synapses of proximal dendrites**
              + **[TemporalPooler.java](./src/main/java/model/MARK_II/TemporalPooler.java) 
                = models neocortex's ability to predict future input using long 
                  term potentiation and depression on synapses of distal dendrites**
            - [util](./src/main/java/model/util) = classes that enable the brain
              model properties to be viewed graphically and efficiently saved 
              and opened  
      + test = test classes for important classes in the `src/main/java/model` 
               folder
  - .gitignore = contains names of files/folders not to add to this repository 
                 but keep in your local WalnutiQ folder
  - .project = when writing your code using Eclipse this file will allow all of
               your files to be organized in the correct folder
  - .travis.yml = tells [our custom travis testing site](https://travis-ci.org/quinnliu/WalnutiQ) 
                  what versions of Java to test the files here
  - LICENSE.txt = GNU General Public License version 3
  - README.md = the file you are reading right now
  - build.gradle = compiles all of the code in this repository using Gradle
  - gradlew = allows you to use Gradle to run all of the code in this repository 
              in Linux & Mac
  - gradlew.bat = allows you to use Gradle to run all of the code in this 
                  repository in Windows

# Important brain theories in use 

1. **Theory:** 1 common learning/predicting algorithm in the neocortex of the brain
   - Supportive: 
     + 1992 Paper [here](https://db.tt/dXTDFAVe) from Department of Brain and 
       Cognitive Sciences at MIT.
       - Summary: A portion of wires of the optic nerve are routed to the auditory 
         cortex in ferrets. The neurons of this primary auditory cortex(A1) with 
         vision input did not work exactly like neurons in primary visual 
         cortex(V1). Neurons in rewired A1 had larger receptive field sizes 
         and other differences. However there are also similarities including:
         + rewired A1 neurons showed orientation and direction selectivity.
         + similar proportions of simple, complex, and nonoriented cells between
           rewired A1 and V1.
         + implies "*significant implications for possible commonalities in 
           intracortical processing circuits between sensory cortices*".

     + 1988 Paper [here](https://db.tt/RXAOVwfa) from
       Laboratoire des Neuroscience de la Vision at Universite de Paris.
       - Summary: Wires of the optic nerve were routed permanently to the
         main thalamic somatosensory nucleus in hamsters. After the hamsters 
         grew up the neurons in the somatosensory cortex were recorded.
         The "*somatosensory neurons responded to visual stimulation of
         distinct receptive fields, and their response properties resembled,
         in several characteristic features, those of normal visual cortical
         neurons.*" 
         + "*the same functional categories of neurons occurred in similar 
           proportions, and the neurons' selectivity for the orientation or
           direction of movement of visual stimuli was comparable*" between
           normal hamsters and rewired hamsters.
         + "*These results suggest that thalamic nuclei or cortical areas at
           corresponding levels in the visual and somatosensory pathways perform
           similar transformations on their inputs*".
     
   - Not supportive:
     + 2002 Paper [here](https://db.tt/NJxHdObc) from Vision, Touch and Hearing
        Research Centre at The University of Queensland.
          - "*recent studies have revealed substantial variation in pyramidal
            cell structure in different cortical areas*".
          - Some of these variations like increase in dendritic arbor size(
            dendritic branching) can be resolved with the idea of a common 
            algorithm.

     + 2008 PhD thesis [here](https://db.tt/I2Fi03DS) by Dileep George from 
        Stanford University
          - "*Until we understand and explain the computational reason behind
            a large majority of such variations, the common cortical algorithm
            will have to be considered as a working hypothesis*".

   - Conclusion: If cortex X(arbitrary cortex) of the neocortex(contains visual cortex,
     auditory cortex, somatosensory cortex, and others..) can be given 
     non-normal sensory input usually given to say cortex Y and then learn to 
     process this new input similarily to how cortex X would process it, then we 
     can hypothesize that there is a common learning/predicting algorithm in all 
     cortices of the neocortex.

# Object oriented spatial pooling algorithm

The following section will not make sense until you have first read and tried to understand the spatial pooling
algorithm explained in detail in this [white paper](https://db.tt/FuQWQuwE).

The following is the spatial pooling algorithm pseudocode in the white paper
implemented using object oriented design. Notice how the pseudocode from the
white paper pages 34-38 is placed immediately above the object oriented Java 
code that it is equivalent to. The pseudocode always begins with `///` to 
differentiate from regular comments.

The actual [SpatialPooler.java](./src/main/java/model/MARK_II/SpatialPooler.java) 
class contains the below code and additional code and clarifying comments.

The spatial pooling algorithm can be run once by creating a `SpatialPooler` 
class object and calling the `performPooling()` method on that object.

```java
public Set<Column> performPooling() {
    /// for c in columns <== this pseudocode is from line 1 in the white paper
    Column[][] columns = this.region.getColumns();
    for (int row = 0; row < columns.length; row++) {
        for (int column = 0; column < columns[0].length; column++) {
            this.computeColumnOverlapScore(columns[row][column]); 
            // ^ let's take a look inside this method for the 
            // remaining Phase 1 pseudocode
        }
    }

    // a sparse set of Columns become active after local inhibition
    this.computeActiveColumnsOfRegion();

    // simulate learning by boosting specific Synapses
    this.regionLearnOneTimeStep();

    return this.activeColumns;
}
```

<b>Phase 1: Overlap pseudocode implemented using object oriented design</b>
```java
void computeColumnOverlapScore(Column column) {
    /// overlap(c) = 0
    int newOverlapScore = column.getProximalSegment()
        /// for s in connectedSynapses(c)
        ///     overlap(c) = overlap(c) + input(t, s.sourceInput)
        .getNumberOfActiveSynapses();

    // compute minimumOverlapScore assuming all proximalSegments are
    // connected to the same number of synapses
    Column[][] columns = this.region.getColumns();
    int regionMinimumOverlapScore = this.region.getMinimumOverlapScore();

    /// if overlap(c) < minOverlap then
    if (newOverlapScore < regionMinimumOverlapScore) {
        /// overlap(c) = 0
        newOverlapScore = 0;
    } else {
        /// overlap(c) = overlap(c) * boost(c)
        newOverlapScore = (int) (newOverlapScore * column.getBoostValue());
    }
    column.setOverlapScore(newOverlapScore);
}
```

<b>Phase 2: Inhibition pseudocode implemented using object oriented design</b>
```java
void computeActiveColumnsOfRegion() {
    Column[][] columns = this.region.getColumns();
    /// for c in columns
    for (int x = 0; x < columns.length; x++) {
        for (int y = 0; y < columns[0].length; y++) {
            columns[x][y].setActiveState(false);
            this.updateNeighborColumns(x, y);

            // necessary for calculating kthScoreOfColumns
            List<ColumnPosition> neighborColumnPositions = 
                new ArrayList<ColumnPosition>();
            neighborColumnPositions = columns[x][y].getNeighborColumns();
            List<Column> neighborColumns = new ArrayList<Column>();
            for (ColumnPosition columnPosition : neighborColumnPositions) {
                neighborColumns
                        .add(columns[columnPosition.getRow()][columnPosition
                                .getColumn()]);
            }

            /// minLocalActivity = kthScore(neighbors(c), desiredLocalActivity)
            int minimumLocalOverlapScore = this.kthScoreOfColumns(
                    neighborColumns, this.region.getDesiredLocalActivity());

            // more than (this.region.desiredLocalActivity) number of
            // columns can become active since it is applied to each
            // Column object's neighborColumns

            /// if overlap(c) > 0 and overlap(c) >= minLocalActivity then
            if (columns[x][y].getOverlapScore() > 0
                    && columns[x][y].getOverlapScore() 
                    >= minimumLocalOverlapScore) {
                /// activeColumns(t).append(c)
                columns[x][y].setActiveState(true);

                this.addActiveColumn(columns[x][y]);
                this.activeColumnPositions.add(new ColumnPosition(x, y));
            }
        }
    }
}
```

<b>Phase 3: Learning pseudocode implemented using object oriented design</b>  
The pseudocode in Phase 3 is split into 3 separate methods that describe what that
part of the algorithm is doing biologically.

```java
void regionLearnOneTimeStep() {
    this.modelLongTermPotentiationAndDepression(); // implements lines 18-26

    this.boostSynapsesBasedOnActiveAndOverlapDutyCycle(); // implements lines 28-36

    /// inhibitionRadius = averageReceptiveFieldSize()
    this.region
            .setInhibitionRadius((int) averageReceptiveFieldSizeOfRegion());
}
```

```java
void modelLongTermPotentiationAndDepression() {
    Column[][] columns = this.region.getColumns();

    if (super.getLearningState()) {
        /// for c in activeColumns(t)
        for (int x = 0; x < columns.length; x++) {
            for (int y = 0; y < columns[0].length; y++) {
                if (columns[x][y].getActiveState()) {
                    // increase and decrease of proximal segment synapses
                    // based on each Synapses's activeState
                    Set<Synapse<Cell>> synapses = columns[x][y]
                            .getProximalSegment().getSynapses();

                    /// for s in potentialSynapses(c)
                    for (Synapse<Cell> synapse : synapses) {
                        /// if active(s) then
                        if (synapse.getConnectedCell() != null
                                && synapse.getConnectedCell()
                                .getActiveState()) {
                            // model long term potentiation
                            /// s.permanence += permanenceInc
                            /// s.permanence = min(1.0, s.permanence)
                            synapse.increasePermanence();
                        } else {
                            // model long term depression
                            /// s.permanence -= permanenceDec
                            /// s.permanence = max(0.0, s.permanence)
                            synapse.decreasePermanence();
                        }
                    }
                }
            }
        }
    }
}
```

```java
void boostSynapsesBasedOnActiveAndOverlapDutyCycle() {
    Column[][] columns = this.region.getColumns();
    
     /// for c in columns
     for (int row = 0; row < columns.length; row++) {
         for (int column = 0; column < columns[0].length; column++) {
             if (columns[row][column].getActiveState()) {
                 // increase and decrease of proximal Segment Synapses based
                 // on each Synapses's activeState
                 // columns[row][column].performBoosting();
    
                 // 2 methods to help a Column's proximal Segment
                 // Synapses learn connections:
                 //
                 // 1) If activeDutyCycle(measures winning rate) is too low.
                 // The overall boost value of the Columns is increased.
                 //
                 // 2) If overlapDutyCycle(measures connected Synapses with
                 // inputs) is too low, the permanence values of the
                 // Column's Synapses are boosted.
    
                 // neighborColumns are already up to date.
                 List<ColumnPosition> neighborColumnPositions = columns[row][column]
                         .getNeighborColumns();
    
                 List<Column> neighborColumns = new ArrayList<Column>();
                 for (ColumnPosition columnPosition : neighborColumnPositions) {
                     // add the Column object to neighborColumns
                     neighborColumns
                             .add(columns[columnPosition.getRow()][columnPosition
                                     .getColumn()]);
                 }
    
                 float maximumActiveDutyCycle = this.region
                         .maximumActiveDutyCycle(neighborColumns);
                 if (maximumActiveDutyCycle == 0) {
                     maximumActiveDutyCycle = 0.1f;
                 }
    
                 // neighborColumns are no longer necessary for calculations
                 // in this time step
                 columns[row][column].clearNeighborColumns();
    
                 // minDutyCycle represents the minimum desired firing rate
                 // for a Column(number of times it becomes active over some
                 // number of iterations).
                 // If a Column's firing rate falls below this value, it will
                 // be boosted.
                 /// minDutyCycle(c) = 0.01 * maxDutyCycle(neighbors(c))
                 float minimumActiveDutyCycle = this.MINIMUM_COLUMN_FIRING_RATE
                         * maximumActiveDutyCycle;
    
                 // 1) boost if activeDutyCycle is too low
                 /// activeDutyCycle(c) = updateActiveDutyCycle(c)
                 columns[row][column].updateActiveDutyCycle();
    
                 /// boost(c) = boostFunction(activeDutyCycle(c), minDutyCycle(c))
                 columns[row][column].setBoostValue(columns[row][column]
                         .boostFunction(minimumActiveDutyCycle));
    
                 // 2) boost if overlapDutyCycle is too low
                 /// overlapDutyCycle(c) = updateOverlapDutyCycle(c)
                 this.updateOverlapDutyCycle(row, column);
    
                 /// if overlapDutyCycle(c) < minDutyCycle(c) then
                 if (columns[row][column].getOverlapDutyCycle() 
                         < minimumActiveDutyCycle
                         && this.getLearningState()) {
                     /// increasePermanences(c, 0.1*connectedPerm)
                     columns[row][column]
                             .increaseProximalSegmentSynapsePermanences(1);
                 }
             }
         }
     }
}
```

# Object oriented temporal pooling algorithm

The following section will not make sense until you have first read and tried to 
understand the temporal pooling algorithm explained in detail in this 
[white paper](https://db.tt/FuQWQuwE). This algorithm postulates that the only
way to learn invariant representations of any type is by using when things
happen across time. It hypothesizes the brain makes no assumptions about 
the different transformations the world has(shits, rotations, etc.). The brain
ONLY says if patterns follow each other in time in a predictable way they are
causally related and should have the same representation. This is a incredibly
simple and powerful idea.

The following is the temporal pooling algorithm(combined inference and learning)
pseudocode in the white paper implemented using object oriented design. Notice 
how the pseudocode from the white paper pages 39-46 is placed immediately above 
the object oriented Java code that is equivalent to the pseudocode. The 
pseudocode always begins with `///` to differentiate from regular comments.

The actual [TemporalPooler.java](./src/main/java/model/MARK_II/TemporalPooler.java) 
class contains the below code and additional code and clarifying comments.

The temporal pooling algorithm can be run once by creating a `TemporalPooler` class 
object and calling the `performPooling()` method on that object.

```java
public void performPooling() {
    Set<Column> activeColumns = this.spatialPooler.getActiveColumns();
    if (super.getLearningState()) {
        this.phaseOne(activeColumns);
        this.phaseTwo(activeColumns);
        this.phaseThree(activeColumns);
    } else {
        this.computeActiveStateOfAllNeuronsInActiveColumn(activeColumns);
        this.computePredictiveStateOfAllNeurons(activeColumns);
    }
}
```

<b>Phase 1: pseudocode implemented using object oriented design</b>

```java
void phaseOne(Set<Column> activeColumns) {
    /// for c in activeColumns(t)
    for (Column column : activeColumns) {
        /// buPredicted = false
        boolean bottomUpPredicted = false;
        /// lcChosen = false
        boolean learningCellChosen = false;

        Neuron[] neurons = column.getNeurons();
        /// for i = 0 to cellsPerColumn - 1
        for (int i = 0; i < neurons.length; i++) {
            /// predictiveState(c, i, t-1) == true then
            if (neurons[i].getPreviousActiveState() == true) {
                /// s = getActiveSegment(c, i, t-1, activeState)
                DistalSegment bestSegment = neurons[i]
                        .getBestPreviousActiveSegment();

                /// if s.sequenceSegment == true then
                if (bestSegment != null
                        && bestSegment
                        .getSequenceStatePredictsFeedFowardInputOnNextStep()) {
                    /// buPredicted = true
                    bottomUpPredicted = true;
                    /// activeState(c, i, t) = 1
                    neurons[i].setActiveState(true);

                    /// if segmentActive(s, t-1, learnState) then
                    if (bestSegment.getPreviousActiveState()) {
                        /// lcChosen = true
                        learningCellChosen = true;
                        /// learnState(c, i, t) = 1
                        column.setLearningNeuronPosition(i);
                        this.currentLearningNeurons.add(neurons[i]);
                    }
                }
            }
        }
        /// if buPredicted == false then
        if (bottomUpPredicted == false) {
            /// for i = 0 to cellsPerColumn - 1
            for (Neuron neuron : column.getNeurons()) {
                /// activeState(c, i, t) = 1
                neuron.setActiveState(true);
            }
        }

        /// if lcChosen == false then
        if (learningCellChosen == false) {
            /// l,s = getBestMatchingCell(c, t-1)
            int bestNeuronIndex = this.getBestMatchingNeuronIndex(column);
            /// learnState(c, i, t) = 1
            column.setLearningNeuronPosition(bestNeuronIndex);
            this.currentLearningNeurons.add(column
                    .getNeuron(bestNeuronIndex));

            DistalSegment segment = neurons[bestNeuronIndex]
                    .getBestPreviousActiveSegment();
            /// sUpdate = getSegmentActiveSynapses(c, i, s, t-1, true)
            SegmentUpdate segmentUpdate = this.getSegmentActiveSynapses(
                    column.getCurrentPosition(), bestNeuronIndex, segment,
                    true, true);
            /// sUpdate.sequenceSegment = true
            segmentUpdate.setSequenceState(true);
            segment.setSequenceState(true);

            /// segmentUpdateList.add(sUpdate)
            this.segmentUpdateList.add(segmentUpdate);
        }
    }
}
```

<b>Phase 2: pseudocode implemented using object oriented design</b>

```java
void phaseTwo(Set<Column> activeColumns) {
    /// for c, i in cells
    for (Column column : activeColumns) {
        Neuron[] neurons = column.getNeurons();
        for (int i = 0; i < neurons.length; i++) {
            // we must compute the best segment here because
            // if we compute it where it is commented out below
            // then we would be iterating over the neuron's list
            // of segments again
            Segment predictingSegment = neurons[i]
                    .getBestPreviousActiveSegment();

            /// for s in segments(c, i)
            for (Segment segment : neurons[i].getDistalSegments()) {
                // NOTE: segment may become active during the spatial pooling
                // between temporal pooling iterations
                /// if segmentActive(s, t, activeState) then
                if (segment.getActiveState()) {
                    /// predictiveState(c, i, t) = 1
                    neurons[i].setPredictingState(true);

                    /// activeUpdate = getSegmentActiveSynapses(c, i, s, t, false)
                    SegmentUpdate activeUpdate = this
                            .getSegmentActiveSynapses(
                                    column.getCurrentPosition(), i,
                                    segment, false, false);
                    /// segmentUpdateList.add(activeUpdate)
                    this.segmentUpdateList.add(activeUpdate);
                    // Segment predictingSegment = neurons[i]
                    // .getBestPreviousActiveSegment();

                    /// predSegment = getBestMatchingSegment(c, i, t-1)
                    /// predUpdate = getSegmentActiveSynapses(c, i, predSegment, 
                                                              t-1, true)
                    SegmentUpdate predictionUpdate = this
                            .getSegmentActiveSynapses(
                                    column.getCurrentPosition(), i,
                                    predictingSegment, true, true);
                    /// segmentUpdateList.add(predUpdate)
                    this.segmentUpdateList.add(predictionUpdate);
                }
            }
        }
    }
}
```

<b>Phase 3: pseudocode implemented using object oriented design</b>

```java
void phaseThree(Set<Column> activeColumns) {
    /// for c, i in cells
    for (Column column : activeColumns) {
        ColumnPosition c = column.getCurrentPosition();
        Neuron[] neurons = column.getNeurons();
        for (int i = 0; i < neurons.length; i++) {
            /// if learnState(s, i, t) == 1 then
            if (i == column.getLearningNeuronPosition()) {
                /// adaptSegments(segmentUpdateList(c, i), true)
                this.adaptSegments(
                        this.segmentUpdateList.getSegmentUpdate(c, i), true);
                /// segmentUpdateList(c, i).delete()
                this.segmentUpdateList.deleteSegmentUpdate(c, i);
            /// else if predictiveState(c, i, t) == 0 and predictiveState(c, i, 
                                                                    t-1)==1 then
            } else if (neurons[i].getPredictingState() == false
                    && neurons[i].getPreviousPredictingState() == true) {
                /// adaptSegments(segmentUpdateList(c, i), false)
                this.adaptSegments(
                        this.segmentUpdateList.getSegmentUpdate(c, i),
                        false);
                /// segmentUpdateList(c, i).delete()
                this.segmentUpdateList.deleteSegmentUpdate(c, i);
            }
        }
    }
}
```

# Noise invariance experiment

Here is some example code of how part of the theorized prediction algorithm 
works. You do NOT need to understand the following code to make meaningful 
contributions to this repository but it is a beautiful summary of how columns 
of neurons in your brain are probably working to encode what you see. The 
following are the three images the retina will be looking at:

![alt text](https://db.tt/8ZAdcAbM)

```java
retina.seeBMPImage("2.bmp");
spatialPooler.performPooling();
// set1 = ((6,2), (1,5))
assertEquals(set1, this.spatialPooler.getActiveColumnPositions());

retina.seeBMPImage("2_with_some_noise.bmp");
spatialPooler.performPooling();
// set1 = ((6,2), (1,5))
assertEquals(set1, this.spatialPooler.getActiveColumnPositions());

retina.seeBMPImage("2_with_a_lot_of_noise.bmp");
spatialPooler.performPooling();
// when there is a lot of noise notice how the active columns are 
// no longer the same?
// set2 = ((6,2), (2,5))
assertEquals(set2, this.spatialPooler.getActiveColumnPositions());
```

You can view the entire file in 
[NoiseInvarianceExperiment.java](./experiments/model/MARK_I/vision/NoiseInvarianceExperiment.java). 
Please do not be afraid to ask a question if you are confused! This stuff took 
me several months to fully understand but it is really beautiful after you 
understand it.