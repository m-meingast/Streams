# Streams

In dieser Übung sollst du ein Programm zum Analysieren von Java-Fragen der Q&A Plattform StackOverflow implementieren. 
Ziel ist es, nützliche Methoden der Stream-API der Java-Klassenbibliothek kennenzulernen.

## Folgende Klassen stehen im Paket *stackoverflow* bereit

### Data:

- Stellt die Daten dar, die von Stackoverflow heruntergeladen wurden.
- Ein Objekt der Klasse **Data** kann über die Factory-Methode Data.loadFromWeb() angelegt werden. Dabei wird die StackOverflow-REST-Schnittstelle
  (https://api.stackexchange.com) angesprochen, um die 100 meist hochgewählten Fragen mit dem Tag *Java* herunterzuladen.
- Speichert ein Array an Fragen (Klasse **Data.Question**) im privaten Feld *items*.

### Data.Question:

- Stellt eine Frage auf StackOverflow dar 
- Speichert seine Daten in privaten Feldern (die Felder sind nicht final, da die verwendete JSON-Bibliothek Gson diese Felder über Reflection befüllt)
- Stellt folgende Getter zur Verfügung:
	- `String getTitle()` Liefert den Titel der Frage. 
	- `long getAcceptedAnswerId()` Liefert die ID der akzeptierten Antwort, oder 0 falls bisher keine 
	Antwort als korrekt akzeptiert wurde.
	- `long getAnswerCount()` Liefert die Anzahl an Antworten zu der Frage. 
	- `long getScore()` Liefert den aktuellen Score (Upvotes minus Downvotes) der Frage. 
	- `long getViewCount()` Liefert die Zahl, wie oft die Frage angesehen wurde. 
	- `String[] getTags()` Liefert die Tags, mit denen die Frage versehen ist. 
	- `Data.Owner getOwner()` Liefert den Benutzer, der die Frage erstellt hat.
	
### Data.Owner

- Stellt einen Fragesteller/eine Fragestellerin auf StackOverflow dar. 
- Speichert seine Daten in privaten Feldern (die Felder sind nicht final, da die verwendete JSON-Bibliothek. 
 Gson diese Felder über Reflection befüllt)
- Stellt folgende Getter zur Verfügung:
	- `String getDisplayName()` Liefert den Namen des Nutzers.
	- `long getReputation()` Liefert die Reputation (in StackOverflow-Punkten) des Nutzers.


## Implementiere folgende Methoden in der Klasse Data - Jede Methode soll durche eine einzige Kette von Stream-Operationen gelöst werden

- `public Stream<Question> stream()`

Erstellt einen neuen Stream aus den Fragen, die im Array items gespeichert sind. 

- `public Stream<Question> sortedStream()`

Liefert einen sortierten Stream absteigend anhand der Scores der Fragen. 

- `public Optional<Question> findHighestScoringQuestionWith(int minimumViews)`

Liefert die Frage mit dem höchsten Score, welche auch mindestens minimumViews oft betrachtet wurde. 

- `public Optional<String> getLongestTitle()`
 
Liefert den Titel der Frage mit dem längsten Titel. 

- `public List<Question> findQuestions(String titlePart)`

Liefert eine Liste aller Fragen, die im Titel den String titlePart enthalten. 

- `public long countQuestionsWithoutAcceptedAnswer()`

Liefert die Anzahl an Fragen, die keine akzeptierte Antwort haben (accepted answer id == 0). 

- `public OptionalDouble averageOwnerReputation()`

Liefert die durchschnittliche Reputation der Fragesteller.<br>
<u>Hinweis</u>: Nutze `mapToLong()` um alle Fragen auf die Reputation ihrer Fragesteller zu mappen, und 
verwende dann die Methode `average()` des resultierenden LongStreams. 

- `public double averageOwnerReputation2()`

Liefert ebenfalls die durchschnittliche Reputation der Fragesteller. <br>
<u>Hinweis</u>: Nutze nur die Methode `collect()` in Kombination mit `Collectors.averagingLong()`. 

- `public long sumOfAllAnswerCounts()`

Liefert die Anzahl aller Antworten, die in Summe auf alle 100 Fragen gegeben wurden. 

- `public Optional<Owner> getOwnerWithShortestName()`

Liefert den User mit dem kürzesten Usernamen.

## Implementiere die Testklasse Main
Implementiere die Testklasse Main im Paket *stackoverflow.main*, welche in der main-Methode alle oben 
implementierten Methoden testet. 
Das Data-Objekt wurde mittels Data.loadFromWeb() bereits erstellt. Rufe alle Methoden darauf auf. 
Gebe die Resultate der Methodenaufrufe sinnvoll formatiert aus.

## Optional

- `public Map<Integer, List<Question>> groupQuestionsByTagCount()`

Liefert alle Fragen, gruppiert nach ihrer Anzahl an Tags. <br>
<u>Hinweis</u>: Nutze nur die Methode `collect()` in Kombination mit `Collectors.groupingBy()`. 

- `public Map<Boolean, List<Question>> partitionByAcceptedAnswer()`

Liefert alle Fragen, partitioniert in zwei Gruppen: Jene Fragen, die noch keine akzeptierte Antowort haben (Gruppe "false") und jene Fragen, die eine akzeptierte Antwort haben(Gruppe "true")<br>
<u>Hinweis</u>: Nutze nur die Methode `collect()` in Kombination mit `Collectors.partitionBy()`. 

- `public List<String> distinctTags()`

Liefert eine alphabetisch aufsteigend sortierte Liste aller unterschiedlichen Tags. <br>
<u>Hinweis</u>: Nutze die Stream-Methoden `flatMap()`, `distinct()`, `sorted()` sowie `collect()` in Kombination mit dem passenden Collector aus der Klasse **Collectors**.


