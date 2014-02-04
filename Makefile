TARGET=Swarm.jar

SRCDIR=src
LIBDIR=lib
SRC=Dot.java SwarmPanel.java Swarm.java

CLASSESDIR=classes
CLASSES=$(SRC:.java=.class)

all: $(TARGET)

$(TARGET):$(patsubst %,$(CLASSESDIR)/%,$(CLASSES)) MANIFEST.MF
	jar cvfm $(TARGET) MANIFEST.MF -C classes .

$(CLASSESDIR)/%.class:$(SRCDIR)/%.java
	javac -d classes -classpath classes $^

$(CLASSESDIR)/%.class:$(LIBDIR)/%.java
	javac -d classes -classpath classes $^

.PHONY: clean
clean:
	rm classes/* $(TARGET)

