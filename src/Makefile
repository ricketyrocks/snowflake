CC=gcc
CFLAGS=-c -Wall
LDFLAGS=
TARGET=helloworld
SOURCES=$(TARGET).c
OBJECTS=$(SOURCES:.c=.o)

all: $(SOURCES) $(TARGET)

clean:
	\rm -f $(TARGET) $(OBJECTS)

check: $(TARGET)
	echo checkcheck

$(TARGET): $(SOURCES) $(OBJECTS)
	$(CC) $(LDFLAGS) $(OBJECTS) -o $@

.c.o:
	$(CC) $(CFLAGS) $< -o $@

.PHONY: all check clean
