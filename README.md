# Zoo Java Console Application
---
## Uitleg

 - package structuur
 - abstract classes
 - interfaces
 - Enum
 - Zoo class


## Package structuur

De package structuur is aangepast naar de dier soorten die er zijn. Als eerst is er een animal package gemaakt voor de
generieke dieren classen zoals Animal en Performable. Daaronder zijn dier soort packages gemaakt om de
onderscheid te kunnen maken tussen dieren die plant, vlees of beide eten. Vandaar ook de methodes eatMeat and eatPlant.

## Abstract class

Er is 1 generieke abstract class Animal die de generieke attributen bevat die alle dieren hebben. Ook de sayHello methode valt hier onder,
omdat deze uit alle dier classen aangeroepen moet worden. Daarnaast zijn er voor de verschillende diersoorten abstracte classen om generieke methodes
te defineren die aangeroepen kunnen worden per diersoort.

## Interfaces

Voor elk diersoort is een interface. Een carnivore heeft een eatMeat methode, omdat deze vlees eet. Een herbivore
heeft een eatLeafs, omdat deze alleen planten eet. Een Ommnivore extends beide, omdat deze zowel vlees als planten eet.

Er is nog een generieke interface gemaakt, performable. Deze wordt alleen toegekend aan dier classen die een trucje kunnen doen.

## Enum

De enum Command is geïmplementeerd om de commando's in een eigen classe te plaatsen en om een enum te kunnen gebruiken.
Met de fromString methode kan de input string omgezet worden naar een enum en kan deze gebruikt worden in de verdere code,
in plaats van de string en de array met commando's. 

## Zoo class

De dieren classen worden allemaal aangemaakt en in een arraylist gezet, zodat ze later makkelijk gefilterd kunnen worden waar nodig.
Daarna wordt er aan de hand van een do while loop eerst de input gelezen en omgezet naar een Command enum. Deze wordt via een switch verwerkt.


Als de command HELLO is dan wordt er eerste gekeken of er ook een naar achter komt, door een spatie " " achter "hello" te plakken. 
Als dit zo is dan wordt door middel van substring alles achter "hello " als naam gepakt. Mocht dit een naam zijn van 1 van de dieren
dan wordt sayHello van dat dier aangeroepen, andere is de input niet valide. 
Als de input "hello" is dan wordt sayHello van alle dieren aangeroepen.


Als de command "GIVE_LEAVES" is dan wordt eerst een filter op de lijst met dieren toegepast om alleen herbivore dieren over te houden.
Daarna worden deze classes gecast naar herbivore class om de eatLeafs aan te kunnen roepen.


Als de command "GIVE_MEAT" is dan wordt eerst een filter op de lijst met dieren toegepast om alleen carnivore dieren over te houden.
Daarna worden deze classes gecast naar carnivore class om de eatMeat aan te kunnen roepen.


Als de command "PERFORM_TRICK" is dan wordt eerst de filter op de lijst van dieren toegepast om alleen dieren die een trucje kunnen over te houden.
Daarna worden deze classen gecast naar performable class om de performTrick aan te kunnen roepen.


als de command "EXIT" is dan wordt deze overgeslagen in de switch doormiddel van alleen een break. Bij de while wordt deze dan true en stopt de switch en 
de programma


Bij andere inputes wordt een onbekend commando weergegeven.

