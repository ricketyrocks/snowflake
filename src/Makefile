CC=gcc
CFLAGS=-c -Wall
LDFLAGS=
TARGET=helloworld
SOURCES=$(TARGET).c
OBJECTS=$(SOURCES:.c=.o)

all: $(SOURCES) $(TARGET)


$(TARGET): $(SOURCES) $(OBJECTS)
	$(CC) $(LDFLAGS) $(OBJECTS) -o $@

.c.o:
	$(CC) $(CFLAGS) $< -o $@
