# "*Prime Searcher*"

## Aufgabenstellung
Die detaillierte [Aufgabenstellung](TASK.md) beschreibt die notwendigen Schritte zur Realisierung.

## Implementierung

#### Vorausetzungen:

* Spring Boot
* Java



Eine Web Applikation, welche im Hintergrund berechnet und immer die zuletzt berechnete Primzahl zurück gibt. Die Applikation wurde. Beim Start der Applikation wird die Startzeit in einer Variable gespeichert. In eine andere Variable wird dann immer das Änderungsdatum gespeichert.

Die Weiterleitung funktioniert mittels eines speziellen returns:

```java
return "redirect:/primes/searcher"
```

Um Werte während der Laufzeit auf einer HTML-Seite zu verändern fügt man eine Datei in den **/main/resources/templates/searcher.html**

Damit man die Attribute setzen kann muss folgendes zum html-tag hinzufügen

```html
<html xmlns:th="http://www.thymeleaf.org">
```

Das macht folgendes möglich

```html
<p th:text="'Started at'+${start} +'    The last prime discovered was ' +${prime}+' at  ' +${primeModified}" />
```

Attribute:

* start
* prime
* primeModified

Mit Spring kann man dann die Attribute wie folgt setzen:

```java
model.addAttribute("start", this.start);
model.addAttribute("prime",this.prime);
model.addAttribute("primeModified",this.primeModified);
return "searcher";
```

Die Berechnung erfolgt neben läufig das funktioniert indem die Klasse das Interface ApplicationRunner implementiert. Diese Interface verlangt, dass die run Methode implementiert wird. In dieser Methode findet die Berechnung der Primzahl statt welche jedes mal geupdated wird wenn eine neue gefunden wurde.  



**@PostConstruct**

Wird vor dem eigentliche start der  Bean ausgeführt weshalt wir hier zum Beispiel das startDate und die Laufbedingung setzten.

**@PreDestroy**

Wird beim beenden des Programms aufgerufen hier setzen wird die Laufbedingung auf false

Die Weboberfläche könnte dann wie folgt aussehen.

![Web](resources/bild.png)

## Quellen

- ["Context and Servlet Initialization Parameters"; Baeldung Guides; zuletzt besucht am 2019-05-01; online](https://www.baeldung.com/context-servlet-initialization-param)

- ["Developing Web Applications"; SpringBoot Reference; zuletzt besucht am 2019-05-01; online](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-web-applications.html)

- ["ServletRegistrationBean"; SpringBoot API; zuletzt besucht am 2019-05-01; online](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/web/servlet/ServletRegistrationBean.html)

